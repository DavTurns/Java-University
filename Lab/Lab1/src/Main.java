import ex1.Grades;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Grades notenProcessor = new Grades();
        int[] grades = new int[]{10, 20, 30, 38, 67, 98, 39, 40, 88, 56};
        System.out.println("ex1.Grades: " + Arrays.toString(grades));
        System.out.println("Not sufficient grades: " + Arrays.toString(notenProcessor.dissatisfyingGrades(grades)));
        System.out.println("Average: " + Integer.toString(notenProcessor.getAverage(grades)));
        System.out.println("Rounded grades: " + Arrays.toString(notenProcessor.convertToRoundedGrades(grades)));
        System.out.println("Max rounded grade: " + Integer.toString(notenProcessor.getMaxroundedGrade(grades)));
    }
}