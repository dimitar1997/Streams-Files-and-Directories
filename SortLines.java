import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path in = Paths.get("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));
        List<String> lines = Files.readAllLines(in);
          lines = lines.stream().filter(l ->
                  !l.isBlank()).collect(Collectors.toList());
        Collections.sort(lines);
        for (int i = 0; i < lines.size() ; i++) {
            String line = lines.get(i);
            out.println(line);
        }

        out.close();
    }
}
