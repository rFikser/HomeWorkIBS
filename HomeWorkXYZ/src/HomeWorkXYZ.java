import java.util.Scanner;
import java.lang.Math;

public class HomeWorkXYZ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double avg = ((x + y + z) / 3);
        System.out.println(avg);
        if (Math.floor(avg / 2) > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
