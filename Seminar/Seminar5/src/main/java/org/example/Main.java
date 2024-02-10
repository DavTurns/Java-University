import org.example.distance.Levenshtein;
import org.example.distance.Distancer;
import org.example.similarity.CosineSimilarity;
import org.example.similarity.JaccardSimilarity;
import org.example.similarity.Similarity;

import test.TestBuilder;
import vectorizer.BagOfWords;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String ex1 = "This is a sample text meant for something else.";
        String ex2 = "Sample text is for demonstration purposes.";
        List<String> corpus = List.of(ex1, ex2);
        BagOfWords bagOfWordsVectorizer = new BagOfWords(corpus);
        Similarity cosine = new CosineSimilarity(bagOfWordsVectorizer);
        Similarity jaccard = new JaccardSimilarity();
        Distancer distancer = new Distancer("train_all.csv", new Levenshtein());

        String inputText = "This is a sample text and it is meant for demonstration.";
        List<Double> vectorizedData = bagOfWordsVectorizer.transform(inputText);

        System.out.println("Vectorized Data: " + vectorizedData);
        System.out.println("Cosine Similarity between\n" + ex1 + "\n" + ex2 + "\nis: " + cosine.similarity(ex1, ex2));
        System.out.println();
        System.out.println("Jaccard Similarity between\n" + ex1 + "\n" + ex2 + "\nis: " + jaccard.similarity(ex1, ex2));
        System.out.println();
        System.out.println("Distancer find Word: " + distancer.findWord("photosynthesis"));
        System.out.println("Distancer find text: " + distancer.findText("photosynthesis"));

        new TestBuilder().describe("Test Similarity").expect(0.4082482904638631).equal().to(cosine.similarity(ex1, ex2));
    }
}