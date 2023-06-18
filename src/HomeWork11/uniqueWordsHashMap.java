package HomeWork11;

import java.util.HashMap;

public class uniqueWordsHashMap {
    public static void main(String[] args) {
        String text = "test Test test Text TeXt LOL ll lol My mY way";

        String[] words = text.replaceAll("[^a-zA-Z ]", "").split("\\s+");

        HashMap<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {

            String lowercaseWord = word.toLowerCase();

            int frequency = wordFrequency.getOrDefault(lowercaseWord, 0);
            frequency++;

            wordFrequency.put(lowercaseWord, frequency);
        }

        for (String word : wordFrequency.keySet()) {
            int frequency = wordFrequency.get(word);
            System.out.println("Word: " + word + ", Frequency: " + frequency);
        }
    }
}

