import java.util.Scanner;

public class HomeWorkILikeJava {
    public static void main(String[] args) {
        System.out.println("Введите I like Java!!!");
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int count = 0;
        if (string.contains("Java")) {
            System.out.println("Содержит Java");
            count++;
        }
        if (string.startsWith("I like")) {
            System.out.println("Начинается с I like");
            count++;
        }
        if (string.endsWith("!!!")) {
            System.out.println("Заканчивается на !!!");
            count++;
        }
        if (count == 3) {
            System.out.println(string.toUpperCase());
        }
        string = string.replace('a','o');
        System.out.println(string.substring(7,11));
    }
}
