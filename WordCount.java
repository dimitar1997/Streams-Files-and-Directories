import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt"));
        BufferedReader in2 = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));

        String[] tokens = in.readLine().split(" ");
        String first = tokens[0];
        String second = tokens[1];
        String third = tokens[2];
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        String[] words = in2.readLine().split("\\s+");

        for (int i = 0; i < words.length ; i++) {
            String word = words[i];
            if (word.equals(first)) {
                counter1++;
            } else if (word.equals(second)) {
                counter2++;
            } else if (word.equals(third)) {
                counter3++;
            }
        }
        out.println(first + " - " + counter1);
        out.println(second + " - " + counter2);
        out.println(third + " - " + counter3);
        out.close();
    }
}
