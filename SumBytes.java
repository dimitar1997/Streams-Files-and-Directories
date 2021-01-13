import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        long sum = 0;
        String line = in.readLine();
        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);

                sum = sum + (byte) symbol;
            }
            line = in.readLine();
        }
        System.out.println(sum);
    }
}
