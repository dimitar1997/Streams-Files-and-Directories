import java.io.File;
import java.nio.file.Path;

public class GetFolderSize {
    public static void main(String[] args) {

        File folder = new File("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        long size = 0;


        for (File file : folder.listFiles()) {
            size = size + file.length();
        }

        System.out.println("Folder size: " + size);
    }
}
