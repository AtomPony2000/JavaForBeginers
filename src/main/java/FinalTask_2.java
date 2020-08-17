import java.util.Arrays;
import java.util.Scanner;

public class FinalTask_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Укажи размер массива");
        int firstInput = sc.nextInt();
        int[] mass = new int[firstInput];
        System.out.println("Введите число: ");
        for (int i = 0; i < mass.length; i++) {
            int number = sc.nextInt();
            mass[i] = number;
        }

        System.out.println(Arrays.toString(mass));
        for (int left = 0; left < mass.length; left++) {
            int value = mass[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < mass[i]) {
                    mass[i + 1] = mass[i];
                } else {
                    break;
                }
            }
            mass[i + 1] = value;
        }
        System.out.println(Arrays.toString(mass));
    }
}
