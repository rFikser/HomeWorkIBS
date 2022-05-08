import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scan.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        String[] words = input.split(" ");
        int count = 0;
        for (String word : words){
            Matcher matcher = pattern.matcher(word);
            if (matcher.matches()){
                System.out.println(word);
                count++;
            }
        }
        System.out.printf("Слов в латинице: %d", count);
    }
}
