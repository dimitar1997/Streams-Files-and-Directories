import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
int sum = 0;
        String line = in.readLine();
        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                sum = sum + symbol;
            }
            System.out.println(sum);
            sum = 0;
            line = in.readLine();
        }
    }
}
