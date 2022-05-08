import java.util.Arrays;
import java.util.Random;

public class HomeWorkRandom {
    public static void main(String[] args) {


        int[] array = new int[15];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(41) - 20);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        int min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимум: " + min + ", " + "максимум: " + max);
        if ((Math.abs(min) > Math.abs(max))) {
            System.out.println("Наибольшее по модулю: " + min);
        } else {
            System.out.println("Наибольшее по модулю: " + max);
        }
    }
}
