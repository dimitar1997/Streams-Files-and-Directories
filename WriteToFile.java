import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream getFile = new FileInputStream(path);
        FileOutputStream out = new FileOutputStream("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT");

        int currentByte = getFile.read();
        while (currentByte > -1){
           char ch = (char) currentByte;
            if (ch != ',' && ch != '.' && ch != '!' && ch != '?'){
                out.write(currentByte);
            }
            currentByte = getFile.read();
        }

        out.close();
    }
}
