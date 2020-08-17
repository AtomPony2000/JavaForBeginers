import java.util.Scanner;

public class FinalTask_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("$$$Введи курс доллара$$$: ");
        double exchangeRate = sc.nextDouble();
        System.out.println("Сколько будем менять рублей?");
        double amount = sc.nextDouble();
        double result = exchangeRate / amount;
        System.out.println(result);
        String formattedResult = String.format("%.2f", result);

        System.out.println("У вас есть = " + formattedResult + "$");
    }
}
