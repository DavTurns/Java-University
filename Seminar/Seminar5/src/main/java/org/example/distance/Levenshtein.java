package org.example.distance;

public class Levenshtein implements Distance {
    @Override
    public double compute(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // Create a matrix to store distances
        int[][] distanceMatrix = new int[len1 + 1][len2 + 1];

        // Initialize the matrix
        for (int i = 0; i <= len1; i++) {
            distanceMatrix[i][0] = i;
        }
        for (int j = 0; j <= len2; j++) {
            distanceMatrix[0][j] = j;
        }

        // Fill in the matrix
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                int cost = (str1.charAt(i - 1) == str2.charAt(j - 1)) ? 0 : 1;
                distanceMatrix[i][j] = Math.min(Math.min(
                                distanceMatrix[i - 1][j] + 1,
                                distanceMatrix[i][j - 1] + 1),
                        distanceMatrix[i - 1][j - 1] + cost
                );
            }
        }

        return (double) distanceMatrix[len1][len2];
    }
}
