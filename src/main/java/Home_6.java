import java.util.Scanner;

public class Home_6 {
    public static void main(String[] args) {
        int x, y, z, average, result;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        x = sc.nextInt();
        System.out.println("Введите число 2: ");
        y = sc.nextInt();
        System.out.println("Введите число 3: ");
        z = sc.nextInt();

        int[] inputNumbers = {x, y, z};
        int sum = 0;
        for (int i : inputNumbers) sum = sum + i;
        System.out.println("Сумма чисел: " + sum);
        average = sum / inputNumbers.length;
        System.out.println("Среднее арифметическое: " + average);
        result = average / 2;
        System.out.println("Результат: " + result);
        if (average > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
