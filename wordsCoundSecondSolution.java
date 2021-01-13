import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class wordsCoundSecondSolution {
    public static void main(String[] args) throws IOException {

        Path in = Path.of("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");

        List<String> lines = Files.readAllLines(in);

        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        for (String line: lines) {
            String[] words = line.split(" ");
            for (String word: words) {
                wordsCount.put(word, 0);
            }
        }
        BufferedReader in2 = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));

        String[] words = in2.readLine().split("\\s+");

        for (int i = 0; i < words.length ; i++) {
            String word = words[i];
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word,wordsCount.get(word) + 1);
            }
        }

        wordsCount.entrySet().stream().sorted((k,v) ->
                v.getValue().compareTo(k.getValue()))
                .forEach(e ->
                        out.println(e.getKey() + " - " + e.getValue()));

        out.close();
    }
}
