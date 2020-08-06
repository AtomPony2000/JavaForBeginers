import java.util.Scanner;

public class Home_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String bin = sc.nextLine();
        int num = Integer.parseInt(bin, 2);

        System.out.println("Ваше число: " + num);
    }
}
