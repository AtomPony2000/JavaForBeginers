import java.util.Scanner;

public class Home_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputString = sc.nextLine();
        System.out.println(inputString + "Сам " + inputString + "!!!");
    }
}
