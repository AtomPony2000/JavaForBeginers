import java.util.Scanner;

public class Home_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String S = sc.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;

        System.out.println("Вот то что вы просили....." +
                "мне было больно писать переменные верхним регистром --->" + Y);
    }
}
