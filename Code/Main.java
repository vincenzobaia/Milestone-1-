import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\lukas\\IdeaProjects\\PGWorkshopLab\\src\\Articles\\RookieQB.txt"; // Path to article
        String stopWordsPath = "C:\\Users\\lukas\\IdeaProjects\\PGWorkshopLab\\src\\stopwords.txt";    // Path to stopwords

        // Create instances of the handler and stopWords classes
        FileHandler fileHandler = new FileHandler();
        List<String> stopWords = fileHandler.readStopWords(stopWordsPath);
        TextProcessor textProcessor = new TextProcessor(fileHandler.readStopWords(stopWordsPath));

        // FileAnalyzer to read the text
        FileAnalyzer fileAnalyzer = new FileAnalyzer();

        // Print the filtered article
        System.out.println("Filtered Article A:");
        System.out.println("===================================");
        List<String> articleLines = fileHandler.readFile(filePath);
        List<String> cleanedLines = textProcessor.removeStopWords(articleLines);
        for (String line : cleanedLines) {
            System.out.println(line);
        }
        //Showing statistics for Article A
        int wordCount = fileAnalyzer.countWords(articleLines);
        System.out.println("Word Count: " + wordCount);

        int statementCount = fileAnalyzer.countStatements(articleLines);
        System.out.println("Number of Statements: " + statementCount);

        System.out.println("Word Frequencies: ");
        fileAnalyzer.rankWordsByFrequency(cleanedLines);

        // Print the second filtered article
        filePath = "C:\\Users\\lukas\\IdeaProjects\\PGWorkshopLab\\src\\Articles\\Gus Bradley_ Colts must take 'shared responsibility' to fix atrocious run defense.txt";

        System.out.println("Filtered Article B:");
        System.out.println("===================================");
        List<String> articleLinesB = fileHandler.readFile(filePath);
        List<String> cleanedLinesB = textProcessor.removeStopWords(articleLinesB);
        for (String line : cleanedLinesB) {
            System.out.println(line);
        }
        // Show statistics for Article B
        wordCount = fileAnalyzer.countWords(articleLinesB);
        System.out.println("Word Count: " + wordCount);

        statementCount = fileAnalyzer.countStatements(articleLinesB);
        System.out.println("Number of Statements: " + statementCount);

        System.out.println("Word Frequencies: ");
        fileAnalyzer.rankWordsByFrequency(cleanedLinesB);

        // Print the third filtered article
        filePath = "C:\\Users\\lukas\\IdeaProjects\\PGWorkshopLab\\src\\Articles\\Aaron Rodgers on Patriots_ A 'little weird' to face coaches you've played against.txt";

        System.out.println("Filtered Article C:");
        System.out.println("==================================");
        List<String> articleLinesC = fileHandler.readFile(filePath);
        List<String> cleanedLinesC = textProcessor.removeStopWords(articleLinesC);
        for (String line: cleanedLinesC) {
            System.out.println(line);
        }
        // Show statistics for Article C
        wordCount = fileAnalyzer.countWords(articleLinesC);
        System.out.println("Word Count: " + wordCount);

        statementCount = fileAnalyzer.countStatements(articleLinesC);
        System.out.println("Number of Statements: " + statementCount);

        System.out.println("Word Frequencies: ");
        fileAnalyzer.rankWordsByFrequency(cleanedLinesC);

    }
}
