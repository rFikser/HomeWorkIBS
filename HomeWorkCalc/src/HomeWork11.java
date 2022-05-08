import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String num1 = scan.next();
        System.out.println("Введите второе число:");
        int num2 = scan.nextInt();
        int val = Integer.parseInt(num1);
        if (val >num2) {
            System.out.println("Наибольшее число: " + val);
            System.out.println("Наименьшее число: " + (double)num2);
        }else{
            System.out.println("Наибольшее число: " + num2);
            System.out.println("Наименьшее число: " + (double)val);
        }
    }
}
