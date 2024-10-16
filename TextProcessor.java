import java.util.*;

public class TextProcessor {
    private List<String> stopWords;

    // Create a constructor for our array of stop words
    public TextProcessor(List<String> stopWords) {
        this.stopWords = stopWords;
    }

    // Replace
    public String cleanText(String text) {
        return text.replaceAll("[^a-zA-Z]", " ").toLowerCase();
    }

    // Remove stop words from the
    public List<String> removeStopWords(List<String> textLines) {
        List<String> processedLines = new ArrayList<>();
        for (String line : textLines) {
            StringBuilder filteredLine = new StringBuilder();
            for (String word : line.split("\\s+")) {
                if (!stopWords.contains(word)) {
                    filteredLine.append(word).append(" ");
                }
            }
            processedLines.add(filteredLine.toString().trim());
        }
        return processedLines;
    }
}
