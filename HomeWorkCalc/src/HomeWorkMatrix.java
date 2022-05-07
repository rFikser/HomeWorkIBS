import java.util.Scanner;

public class HomeWorkMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int x = scan.nextInt(); // вводим кол-во строк
        System.out.println("Введите количество столбцов");
        int y = scan.nextInt(); // вводим кол-во столбцов
        int[][] matrix = new int [x][y]; // массив из целочисленных элементов
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Введите элемент " + (i+1) +":" + (j+1));
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Первая строка, помноженная на 3: ");
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (i == 0){
                    System.out.print(matrix[i][j] * 3 + " ");
                }
            }
        }
    }
}
