import ex1.GradeTest;
import ex2.ArrayTest;
import ex3.ArrayNumberTest;
import ex4.ElectronicsStore;
import ex4.ElectronicsStoreTest;

public class TestRunner {
    public static void main(String[] args) {
        GradeTest gradeTest = new GradeTest();

        //ex 1:
        gradeTest.addToArrayTest();
        gradeTest.roundTest();
        gradeTest.dissatisfyingGradesTest();
        gradeTest.getAverageTest();
        gradeTest.convertToRoundedGradesTest();
        gradeTest.getMaxRoundedGradeTest();

        //ex 2:
        ArrayTest.arrayTest();

        //ex 3:
        ArrayNumberTest.compressArrayTest();
        ArrayNumberTest.addTest();
        ArrayNumberTest.subtractTest();
        ArrayNumberTest.multiplyTest();
        ArrayNumberTest.divideTest();

        //ex 4:
        ElectronicsStoreTest.getCheapestKeyboardTest();
        ElectronicsStoreTest.getMostExpensivePriceTest();
        ElectronicsStoreTest.getMostExpensiveAffordableKeyboardTest();
        ElectronicsStoreTest.getMostExpensiveAffordableCombinationTest();

        System.out.println("all tests passed");
    }
}
