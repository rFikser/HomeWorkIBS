import java.util.Arrays;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int quantity = sc.nextInt();
        String max = "";
        String[] input = new String[quantity];
        String[] uniques = new String[quantity];
        for (int i = 0; i < input.length; i++) {
            Scanner arrayScan = new Scanner(System.in);
            System.out.println("Введите строку " + (i + 1));
            input[i] = arrayScan.nextLine();
        }
        for (int i = 0; i < input.length; i++) {
            uniques[i] = input[i].replaceAll("(?i)(.)(?=.*?\\1)", "");
            if (max.length() < uniques[i].length()) {
                max = input[i];
            }
        }
        System.out.println(Arrays.toString(input));
        System.out.println("Ответ: " + max);
    }
}
