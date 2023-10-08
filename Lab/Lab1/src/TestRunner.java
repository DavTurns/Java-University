import ex1.GradeTest;
import ex2.ArrayTest;

public class TestRunner {
    public static void main(String[] args) {
        GradeTest gradeTest = new GradeTest();

        gradeTest.addToArrayTest();
        gradeTest.roundTest();
        gradeTest.dissatisfyingGradesTest();
        gradeTest.getAverageTest();
        gradeTest.convertToRoundedGradesTest();
        gradeTest.getMaxRoundedGradeTest();

        ArrayTest.arrayTest();

    }
}
