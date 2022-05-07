import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkAVG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива");
        int size = scan.nextInt();
        double[] nums = new double[size];
        double avg1 = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент " + (i+1));
            nums[i] = scan.nextDouble();
            avg1 += nums[i];
        }
        double avg = avg1 / size;
        System.out.println("Среднее арифметическое массива: " + avg);
        for (int i = 0; i < size; i++) {
            nums[i] *= avg;
        }
        System.out.println("Элементы помноженные на avg: " + Arrays.toString(nums));
    }
}
