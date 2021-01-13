import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args) {

        File file = new File("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        //това, което ще направим по-долу се нарича BFS - ТЪРСЕНЕ В ШИРОЧИНА, намира и подпапките
        Deque<File> deque = new ArrayDeque<>();

        deque.add(file);

        int count = 0;
        while (!deque.isEmpty()){
            File f = deque.poll();
            count++;
            System.out.println(f.getName());
            File[] files = f.listFiles();
            for (File innerFile: files) {
                if (innerFile.isDirectory()){
                    deque.offer(innerFile);
                }
            }
        }
        System.out.println(count + " folders");
    }
}
