import java.util.Scanner;

public class HomeWorkXYZLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 1;
        int y = 2;
        int z = 3;
        System.out.println("Введите кол-во элементов массива");
        int arraySize = scan.nextInt();
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Введите элемент " + (i + 1));
            nums[i] = scan.nextInt();
        }
        for (int i = 0; i < arraySize; i++){
            if ((nums[i] == x) ||(nums[i] == y) || (nums[i] == z)){
                System.out.println("Значение '" + nums[i] + "' есть в константах.");
                break;
            }
        }
    }
}
