import java.util.Scanner;

public class HomeWorkConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите, что переводить: 1 - масса, 2 - расстояние");
        int type = scan.nextInt();

        if (type == 1) {
            System.out.println("Выберите единицу измерения: 1 - гр, 2 - кг, 3 - центнер, 4 - тонны");
            int measure = scan.nextInt();
            System.out.println("Введите число");
            double value = scan.nextDouble();
            if (measure == 1) {
                System.out.printf("Граммы: %.2f\n", value);
                System.out.printf("Килограммы: %.2f\n", (value / 1000));
                System.out.printf("Центнеры: %.2f\n", (value / 100000));
                System.out.printf("Тонны: %.2f\n", (value / 1000000));
            } else if (measure == 2) {
                System.out.printf("Граммы: %.2f\n", (value * 1000));
                System.out.printf("Килограммы: %.2f\n", value);
                System.out.printf("Центнеры: %.2f\n", (value / 100));
                System.out.printf("Тонны: %.2f\n", (value / 1000));
            } else if (measure == 3) {
                System.out.printf("Граммы: %.2f\n", (value * 100000));
                System.out.printf("Килограммы: %.2f\n",  (value * 100));
                System.out.printf("Центнеры: %.2f\n", value);
                System.out.printf("Тонны: %.2f\n", (value / 10));
            } else if (measure == 4) {
                System.out.printf("Граммы: %.2f\n", (value * 1000000));
                System.out.printf("Килограммы: %.2f\n", (value * 1000));
                System.out.printf("Центнеры: %.2f\n", (value * 0.1));
                System.out.printf("Тонны: %.2f\n", value);
            }
        } else if (type == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int measure = scan.nextInt();
            System.out.println("Введите число");
            double value = scan.nextDouble();
            if (measure == 1) {
                System.out.printf("Метры: %.3f\n", value);
                System.out.printf("Мили: %.3f\n", (value * 0.0006));
                System.out.printf("Ярды: %.2f\n", (value * 1.094));
                System.out.printf("Футы: %.2f\n", (value * 3.281));
            } else if (measure == 2) {
                System.out.printf("Метры: %.3f\n", (value * 1609.34));
                System.out.printf("Мили: %.3f\n", value);
                System.out.printf("Ярды: %.2f\n", (value * 1760));
                System.out.printf("Футы: %.2f\n", (value * 5280));
            } else if (measure == 3) {
                System.out.printf("Метры: %.3f\n", (value * 0.9144));
                System.out.printf("Мили: %.3f\n", (value * 0.0006));
                System.out.printf("Ярды: %.2f\n", value);
                System.out.printf("Футы: %.2f\n", (value * 3));
            } else if (measure == 4) {
                System.out.printf("Метры: %.3f\n", (value * 0.3048));
                System.out.printf("Мили: %.3f\n", (value * 0.0002));
                System.out.printf("Ярды: %.2f\n", (value * 0.3333));
                System.out.printf("Футы: %.2f\n", value);
            }
        }
    }
}
