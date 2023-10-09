import ex1.GradeTest;
import ex2.ArrayTest;
import ex3.ArrayNumberTest;

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
        ArrayNumberTest.addTest();
        ArrayNumberTest.subtractTest();
        ArrayNumberTest.multiplyTest();
        ArrayNumberTest.divideTest();
    }
}
