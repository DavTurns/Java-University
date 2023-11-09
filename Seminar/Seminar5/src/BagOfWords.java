import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BagOfWords {

    public List<String> vocab = new ArrayList<String>();

    public HashMap<String, Double> wordMap = new HashMap<String, Double>();

    public BagOfWords(List<String> sentences) {
        for (String sentence : sentences) {
            for (String word : sentence.split(" ")) {
                wordMap.put(word, wordMap.getOrDefault(word, 0.0)+1.0);
            }
        }
    }
}

