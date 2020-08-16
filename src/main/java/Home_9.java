import java.util.Scanner;

public class Home_9 {

    protected static String[] motivation = {
            "Еще!", "Да что ты можешь?", "Камон!", "Используй силу!",
            "Слабак", "Моя бабушка быстрее печатает"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


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

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i] + " * 2 = " + mass[i] * 2);
        }
    }
}
