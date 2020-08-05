import java.util.Scanner;

public class Home_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String inputValue = sc.nextLine();
        int value = Integer.parseInt(inputValue);
        System.out.println(
                        value + " * " + 1 + " = " + value * 1 + "\n" +
                        value + " * " + 1 + " = " + value * 1 + "\n" +
                        value + " * " + 2 + " = " + value * 2 + "\n" +
                        value + " * " + 3 + " = " + value * 3 + "\n" +
                        value + " * " + 4 + " = " + value * 4 + "\n" +
                        value + " * " + 5 + " = " + value * 5 + "\n" +
                        value + " * " + 6 + " = " + value * 6 + "\n" +
                        value + " * " + 7 + " = " + value * 7 + "\n" +
                        value + " * " + 8 + " = " + value * 8 + "\n" +
                        value + " * " + 9 + " = " + value * 9 + "\n" +
                        value + " * " + 10 + " = " + value * 10 + "\n");
    }
}
