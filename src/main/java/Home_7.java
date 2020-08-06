import java.util.Scanner;
import java.util.stream.IntStream;

public class Home_7 {
    public static void main(String[] args) {

        final int X = 1;
        final int Y = 5;
        final int Z = 13;
        int[] constants = {X, Y, Z};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();

        boolean contains = IntStream.of(constants).anyMatch(x -> x == number);
        if (contains) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }
    }
}
