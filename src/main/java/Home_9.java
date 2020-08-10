import java.util.Scanner;

public class Home_9 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк массива: ");
        int a = in.nextInt();

        System.out.print("Введите количество столбцов массива: ");
        int b = in.nextInt();

        int[][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < b; i++) {
            System.out.println(arr[0][i] + " * 3 = " + arr[0][i] * 3);
        }
    }
}
