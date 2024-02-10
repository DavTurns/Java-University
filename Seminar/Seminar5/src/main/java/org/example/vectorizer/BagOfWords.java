package vectorizer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class BagOfWords implements Vectorizer {
    private final LinkedHashMap<String, Integer> wordFrequency;
    private final String splitRegex = "([.,!?:;'\"-]|\\s)+"; // Split by whitespace or punctuation

    public BagOfWords(List<String> corpus) {
        this.wordFrequency = new LinkedHashMap<>();
        // Count word frequencies in the corpus
        for (String text : corpus) {
            String[] words = text.split(splitRegex);
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : wordFrequency.keySet()) {
            System.out.println(word + ": " + wordFrequency.get(word));
        }
    }

    public List<Double> transform(String inputText) {
        List<Double> result = new ArrayList<>();
        // Count word frequencies in the input text
        String[] words = inputText.split(splitRegex); // Split words
        for (String uniqueWord : wordFrequency.keySet()) {
            int frequency = 0;
            for (String word : words) {
                if (word.equals(uniqueWord)) {
                    frequency++;
                }
            }
            result.add((double) frequency);
        }
        return result;
    }
}
