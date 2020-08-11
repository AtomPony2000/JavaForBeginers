import java.util.Scanner;

public class Home_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String inputString = sc.nextLine();
        System.out.println("Я о них позаботился... " + inputString.replaceAll(" ", ""));
    }
}
