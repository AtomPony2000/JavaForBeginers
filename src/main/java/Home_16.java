import java.io.FileReader;
import java.util.Scanner;

public class Home_16 {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("C:/Users/rnser/IdeaProjects/JavaForBeginers/src/main/resources/home16");
        Scanner scan = new Scanner(fr);

        int i = 1;

        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        fr.close();
    }
}
