import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("D:\\Coding src\\Streams, Files and Directories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("D:\\Coding src\\Streams, Files and Directories\\unput1.TXT"));
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        String line = in.readLine();
        while (line != null){
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);

               if (symbol == 'a' || symbol == 'e' || symbol == 'i'
               || symbol == 'o' || symbol == 'u'){
                   vowels++;
               }else if (symbol == '!' || symbol == ','
               || symbol == '.' || symbol == '?'){
                   punctuation++;
               }else if (symbol == ' ') {
                   continue;
               } else {
                   consonants++;
               }

            }
            line = in.readLine();
        }
        out.println("Vowels: " + vowels);
        out.println("Consonants: " + consonants);
        out.print("Punctuation: " + punctuation);

        out.close();

    }
}
