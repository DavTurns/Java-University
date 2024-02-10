package org.example.similarity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JaccardSimilarity implements Similarity {

    public static Set<String> tokenize(String text) {
        // Split the text into words and store them in a set
        String[] words = text.split("\\s+");
        return new HashSet<>(Arrays.asList(words));
    }

    @Override
    public double similarity(String a, String b) {
        Set<String> set1 = tokenize(a);
        Set<String> set2 = tokenize(b);

        if (set1.isEmpty() && set2.isEmpty()) {
            return 1.0; // Both sets are empty, so they are identical
        }

        // Calculate the intersection size
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        int intersectionSize = intersection.size();

        // Calculate the union size
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        int unionSize = union.size();

        // Calculate the Jaccard similarity
        return (double) intersectionSize / unionSize;
    }
}
