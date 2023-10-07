import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Grades notenProcessor = new Grades();
        int[] grades = new int[]{10,20,30,38,39,40,50,60};
        System.out.println("Grades: " + Arrays.toString(grades));
        System.out.println("Not sufficient grades: " + Arrays.toString(notenProcessor.dissatisfyingGrades(grades)));
        System.out.println("Average: " + Integer.toString(notenProcessor.getAverage(grades)));

    }
}