import java.io.*;
import java.util.Scanner;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));

        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));

        String line = bufferedReader.readLine();

        int counter = 1;
        while (line != null){
         if (counter % 3 == 0){
             out.println(line);
             counter = 0;
         }
         counter++;
         line = bufferedReader.readLine();
        }
        out.close();
        bufferedReader.close();

    }
}
