import java.util.Scanner;

public class FinalTask_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число в бинарном формате: ");

        String input = sc.nextLine();

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            result <<= 1;
            if (input.charAt(i) == '1') result++;
        }
        System.out.println("Держи, друг: " + result);
    }
}
