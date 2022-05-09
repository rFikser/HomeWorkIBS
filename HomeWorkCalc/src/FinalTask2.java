import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        System.out.println("Запишите уравнение длиной 5 символов, вида \"a+b=c\", с любым неизвестным операндом");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char operation = input.charAt(1);
        int xPos = input.indexOf("x");
        if ((xPos == 0) && (operation == '+')) { //x+3=4
            System.out.println("x равен: " + (Integer.parseInt(input.substring(4)) - Integer.parseInt(input.substring(2, 3))));
        } else if ((xPos == 0) && (operation == '-')) { //x-3=4
            System.out.println("x равен: " + (Integer.parseInt(input.substring(4)) + Integer.parseInt(input.substring(2, 3))));
        } else if ((xPos == 2) && (operation == '+')) { //4+x=7
            System.out.println("x равен: " + (Integer.parseInt(input.substring(4)) - Integer.parseInt(input.substring(0, 1))));
        } else if ((xPos == 2) && (operation == '-')) { //4-x=2
            System.out.println("x равен: " + (Integer.parseInt(input.substring(0, 1)) - Integer.parseInt(input.substring(4))));
        } else if ((xPos == 4) && (operation == '+')) { //4-4=x
            System.out.println("x равен: " + (Integer.parseInt(input.substring(0, 1)) + Integer.parseInt(input.substring(2, 3))));
        } else if ((xPos == 4) && (operation == '-')) { //4-4=x
            System.out.println("x равен: " + (Integer.parseInt(input.substring(0, 1)) - Integer.parseInt(input.substring(2, 3))));
        } else {
            System.out.println("Уравнение неправильного вида");
        }
    }
}
