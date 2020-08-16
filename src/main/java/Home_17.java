import java.io.*;

public class Home_17 extends Home_9 {
    public static void main(String[] args) {


        String outputFileName = "C:/Users/rnser/IdeaProjects/JavaForBeginers/src/main/resources/home17.txt";
        System.out.println("Сейчас мы будем вводить данные в документ построчно\n" +
                "в вот этот документ ---> " +
                "C:/Users/rnser/IdeaProjects/JavaForBeginers/src/main/resources/home17.txt\n" +
                "ВАЖНО! ЧТОБЫ ЭТО ПРЕКРАТИТЬ НАПИШИ 'STOP'");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("STOP")) {
                    String randomMotivation = motivation[(int) (Math.random() * motivation.length)];
                    System.out.println(randomMotivation);
                    writter.write(line + "\r\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}