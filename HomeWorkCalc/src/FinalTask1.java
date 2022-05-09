import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double rate = sc.nextDouble();
        System.out.println("Введите количество рублей");
        double amount = sc.nextDouble();
        double result = amount / rate;
        System.out.println("Курс доллара: " + rate);
        System.out.println("Количество рублей: " + amount);
        System.out.printf("Итого: %.2f долларов", result);
    }
}
