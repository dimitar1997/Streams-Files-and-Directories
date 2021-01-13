import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws IOException {

        String path = "D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        PrintWriter out = new PrintWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT");

        Scanner scanner = new Scanner(new FileInputStream(path));
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
        out.close();
    }
}
