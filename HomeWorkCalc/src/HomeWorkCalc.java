import java.util.Scanner;

public class HomeWorkCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        String operation = scan.next();
        switch (operation) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                if (y == 0) {
                    System.out.println("Делить на ноль нельзя!");
                } else {
                    System.out.println(x / y);
                }
                break;
        }
    }
}
