import java.util.Scanner;

public class Home_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        double x = sc.nextInt();
        System.out.println("Введите число 2: ");
        double y = sc.nextInt();
        System.out.println("Введите число 3: ");
        double z = sc.nextInt();

        double[] inputNumbers = {x, y, z};
        double sum = 0;
        for (double i : inputNumbers) sum = sum + i;
        System.out.println("Сумма чисел: " + sum);
        double average = sum / inputNumbers.length;
        System.out.println("Среднее арифметическое: " + average);
        int result = (int) average / 2;
        System.out.println("Результат: " + result);
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
