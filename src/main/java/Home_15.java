import java.util.Arrays;
import java.util.Scanner;

public class Home_15 extends Home_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] motivation = {
                "Еще!", "Да что ты можешь?", "Камон!", "Используй силу!",
                "Слабак", "Моя бабушка быстрее печатает"
        };

        System.out.println("Укажи размер массива");
        int firstInput = sc.nextInt();
        int[] mass = new int[firstInput];
        System.out.println("Введите число: ");
        for (int i = 0; i < mass.length; i++) {
            String randomMotivation = motivation[(int) (Math.random() * motivation.length)];
            System.out.println(randomMotivation);
            int number = sc.nextInt();
            mass[i] = number;
        }

        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = mass.length - 1; j > i; j--) {
                if (mass[j - 1] > mass[j]) {
                    int tmp = mass[j - 1];
                    mass[j - 1] = mass[j];
                    mass[j] = tmp;
                }
            }
        }

        System.out.println("Вот твой красивый и отсортированный массив ---> " + Arrays.toString(mass));
    }
}
