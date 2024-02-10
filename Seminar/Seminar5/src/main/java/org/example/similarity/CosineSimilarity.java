package org.example.similarity;

import vectorizer.Vectorizer;

import java.util.List;

public class CosineSimilarity implements Similarity {
    Vectorizer encoder;

    public CosineSimilarity(Vectorizer encoder) {
        this.encoder = encoder;
    }

    @Override
    public double similarity(String a, String b) {
        List<Double> vector1 = encoder.transform(a);
        List<Double> vector2 = encoder.transform(b);

        // Calculate the dot product of the two vectors
        double dotProduct = 0.0;
        double magnitudeVector1 = 0.0;
        double magnitudeVector2 = 0.0;

        int n = Math.min(vector1.size(), vector2.size());

        for (int i = 0; i < n; i++) {
            dotProduct += vector1.get(i) * vector2.get(i);
            magnitudeVector1 += vector1.get(i) * vector1.get(i);
            magnitudeVector2 += vector2.get(i) * vector2.get(i);
        }

        magnitudeVector1 = Math.sqrt(magnitudeVector1);
        magnitudeVector2 = Math.sqrt(magnitudeVector2);

        if (magnitudeVector1 == 0 || magnitudeVector2 == 0) {
            return 0.0; // Handle division by zero
        }

        return dotProduct / (magnitudeVector1 * magnitudeVector2);
    }
}
