import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));

        String line = in.readLine();

        int count = 0;
        while (line != null){
            count++;
            out.println(count + ". " + line);
            line = in.readLine();
        }
        out.close();
    }
}
