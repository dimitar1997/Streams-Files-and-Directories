import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream getFile = new FileInputStream(path);
        FileOutputStream out = new FileOutputStream("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT");
        
        int currentByte = getFile.read();
        while (currentByte > -1){
            String digits = String.valueOf(currentByte);
            if (digits.equals("32") || digits.equals("10")) {
                out.write(currentByte);
            }else {
                for (int i = 0; i < digits.length() ; i++) {
                    out.write(digits.charAt(i));
                }
            }
            currentByte = getFile.read();
        }

    }
}
