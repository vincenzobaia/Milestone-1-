import java.io.*;
import java.util.*;

public class FileHandler {
    // Create ArrayList to read file
    public List<String> readFile(String filePath) throws IOException {
        List<String> fileText = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileText.add(line);
            }
        }
        return fileText;
    }
    // Read stopWord list
    public List<String> readStopWords(String stopWordsPath) throws IOException {
        List<String> stopWords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(stopWordsPath))) {
            String stopWord;
            while ((stopWord = reader.readLine()) != null) {
                stopWords.add(stopWord.trim().toLowerCase());
            }
        }
        return stopWords;
    }
}
