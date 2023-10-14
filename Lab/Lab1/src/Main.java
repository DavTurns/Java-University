import ex1.Grades;
import ex2.ArrayProcessor;
import ex3.ArrayNumberProcessor;
import ex4.ElectronicsStore;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //EX1
        Grades notenProcessor = new Grades();
        int[] grades = new int[]{10, 20, 30, 38, 67, 98, 39, 40, 88, 56};

        System.out.println("\n\n\nEx 1\n");
        System.out.println("Input grades: " + Arrays.toString(grades));
        System.out.println("Not sufficient grades: " + Arrays.toString(notenProcessor.dissatisfyingGrades(grades)));
        System.out.println("Average: " + Integer.toString(notenProcessor.getAverage(grades)));
        System.out.println("Rounded grades: " + Arrays.toString(notenProcessor.convertToRoundedGrades(grades)));
        System.out.println("Max rounded grade: " + Integer.toString(notenProcessor.getMaxRoundedGrade(grades)));

        //EX2
        ArrayProcessor ap = new ArrayProcessor();
        int[] array = new int[]{10, 66, 33, 4, 7, 34};

        System.out.println("\n\n\nEx 2\n");
        System.out.println("Input array: " + Arrays.toString(array));
        System.out.println("Max number: " + Integer.toString(ap.getMax(array)));
        System.out.println("Min number: " + Integer.toString(ap.getMin(array)));
        System.out.println("Max sum: " + Integer.toString(ap.maxSum(array)));
        System.out.println("Min sum: " + Integer.toString(ap.minSum(array)));

        //EX3
        ArrayNumberProcessor anp = new ArrayNumberProcessor();
        int[] array1 = new int[]{6, 8, 0, 0};
        int[] array2 = new int[]{6, 7, 4, 0};
        int number = 4;

        System.out.println("\n\n\nEx 3\n");

        System.out.println("Input array1: " + Arrays.toString(array1));
        System.out.println("Input array2: " + Arrays.toString(array2));
        System.out.println("Input number: " + Integer.toString(number) + "\n");
        System.out.println("array1 + array2 =  " + Arrays.toString(anp.add(array1, array2)));
        System.out.println("array1 - array2 =  " + Arrays.toString(anp.subtract(array1, array2)));
        System.out.println("array1 * number: " + Arrays.toString(anp.multiply(array1, number)));
        System.out.println("array2 / number: " + Arrays.toString(anp.divide(array2, number)));

        //EX4

        int[] usbDrivePrices = new int[]{10, 20, 15};
        int[] keyboardPrices = new int[]{5, 15, 40, 25};
        int budget = 30;
        ElectronicsStore es = new ElectronicsStore(usbDrivePrices, keyboardPrices);

        System.out.println("\n\n\nEx 4\n");
        System.out.println("Input usb drive prices: " + Arrays.toString(usbDrivePrices));
        System.out.println("Input keyboard prices: " + Arrays.toString(keyboardPrices));
        System.out.println("Input Budget: " + Integer.toString(budget) + "\n");
        System.out.println("Cheapest keyboard: " + Integer.toString(es.getCheapestKeyboard()));
        System.out.println("Most expensive keyboard/usb drive: " + Integer.toString(es.getMostExpensivePrice()));
        System.out.println("Most expensive affordable usb drive: " + Integer.toString(es.getMostExpensiveAffordableUsbDrive(budget)));
        System.out.println("Most expensive affordable combination of keyboard and usb drive: " + Integer.toString(es.getMostExpensiveAffordableCombination(budget)));


    }
}