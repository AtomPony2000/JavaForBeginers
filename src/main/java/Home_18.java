import java.io.*;
import java.util.Scanner;

public class Home_18 extends Home_9 {
    public static void main(String[] args) throws Exception {
        String path = "src/main/resources/home17.txt";
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
        int i = 1;

        System.out.println("Вот все строки, которые храняться в файле:");
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }
        int count = i - 1;
        fr.close();

        System.out.println("Строк всего " + count + "\n" +
                "Давай заполним их");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(path))) {
                for (int n = 0; n < count; n++) {
                    String line = reader.readLine();
                    System.out.println(motivation[(int) (Math.random() * motivation.length)]);
                    writter.write(line + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}