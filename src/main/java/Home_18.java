import java.io.*;
import java.util.Scanner;

public class Home_18 {
    public static void main(String[] args) throws Exception {
        String path = "C:/Users/rnser/IdeaProjects/JavaForBeginers/src/main/resources/home17.txt";
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
        Scanner in = new Scanner(System.in);
        int i = 1;

        System.out.println("Вот все строки, которые храняться в файле:");
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
            i++;
        }

        fr.close();

        System.out.println("Что хочешь заменить? Напиши содержимое строки:");
        String searchWord = in.nextLine();
        System.out.println("На что меняем?");
        String changeWord = in.nextLine();

        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {
            String strLine;
            while ((strLine = br.readLine()) != null) {
                sb.append(strLine.replace(searchWord, changeWord)).append("\r\n");
                i++;
            }
        }

        try (FileWriter fileWriter = new FileWriter(path)) {
            fileWriter.write(sb.toString());
        }
    }
}