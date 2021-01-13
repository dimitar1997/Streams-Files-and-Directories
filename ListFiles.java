import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
          //подаваме директорията
        File file = new File("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] files = file.listFiles();
        for (File f: files) {
           if (!f.isDirectory()){
               System.out.println(f.getName() + ":" + " " + "[" + f.length() + "]");
           }
        }
    }
}
