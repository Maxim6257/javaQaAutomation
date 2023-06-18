package HomeWork11;

import java.util.HashSet;

public class uniqueWordsHashSet {
    public static void main(String[] args) {
        String text = "First first";

        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }
    }
}
