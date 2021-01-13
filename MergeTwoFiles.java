import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader in1 = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt"));
        BufferedReader in2 = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt"));

        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));

   String line1 = in1.readLine();
          while (line1 != null){
              out.println(line1);
              line1 = in1.readLine();
          }

          String line2 = in2.readLine();
          while (line2 != null){
              out.println(line2);
              line2 = in2.readLine();
          }
          out.close();
    }
}
