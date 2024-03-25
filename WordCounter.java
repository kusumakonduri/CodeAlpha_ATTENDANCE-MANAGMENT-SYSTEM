import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence:");
        sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        
        System.out.println("Number of words: " + wordCount);
        
        int charWithSpaces = sentence.length();
        System.out.println("Number of characters (with spaces): " + charWithSpaces);
        
        int charWithoutSpaces = sentence.replace(" ", "").length();
        System.out.println("Number of characters (without spaces): " + charWithoutSpaces);
        
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
