import java.io.*;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));

        String line = in.readLine();
        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));
        while (line != null){
            String line2 = line.toUpperCase();
            out.println(line2);
            line = in.readLine();
        }
        out.close();
    }
}
