import java.util.Scanner;

public class Home_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String firstInput = sc.nextLine();
        System.out.println("Введите что нибудь другое ");
        String secondInput = sc.nextLine();

        int lenghtFirst = firstInput.length();
        int lenghtSecond = secondInput.length();
        if (lenghtFirst > lenghtSecond) {
            System.out.println("Первая строка была больше... Вот она!!!! ----> " + firstInput);
        } else if (lenghtFirst < lenghtSecond) {
            System.out.println("Вторая оказалась длиннее!!! Гляди! ---> " + secondInput);
        } else {
            System.out.println("Они равны? Да, точно равны...");
        }
    }
}