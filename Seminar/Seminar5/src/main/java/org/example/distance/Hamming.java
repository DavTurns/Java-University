package org.example.distance;

class Hamming implements Distance {
    @Override
    public double compute(String str1, String str2) {
        if (str1.length() != str2.length()) {
            throw new IllegalArgumentException("Strings must have equal length for Hamming distance calculation.");
        }

        int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }

        return (double) distance;
    }
}
