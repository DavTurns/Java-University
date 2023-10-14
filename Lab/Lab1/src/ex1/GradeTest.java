package ex1;

public class GradeTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";

    public static void addToArrayTest() {
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{10, 20, 30};

        int newElement = 50;

        int[] result = gradesProcessor.addToArray(grades, newElement);

        assert grades[0] == result[0] : SHOULD_BE_EQUAL;
        assert grades[1] == result[1] : SHOULD_BE_EQUAL;
        assert grades[2] == result[2] : SHOULD_BE_EQUAL;
        assert result[3] == newElement : SHOULD_BE_EQUAL;

        //unexpected test
        grades = new int[0];
        newElement = -2;
        try {
            result = gradesProcessor.addToArray(grades, newElement);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 1: addToArray Test passed");
    }

    public static void roundTest() {
        Grades gradesProcessor = new Grades();

        assert gradesProcessor.round(20) == 20;
        assert gradesProcessor.round(34) == 34;
        assert gradesProcessor.round(53) == 55;
        assert gradesProcessor.round(38) == 40;
        assert gradesProcessor.round(62) == 62;

        //unexpected test
        try {
            gradesProcessor.round(-2);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 1: round Test passed");
    }

    public static void dissatisfyingGradesTest() {
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{12, 22, 38, 50};

        int[] dissatisfyingGrades = gradesProcessor.dissatisfyingGrades(grades);

        assert dissatisfyingGrades.length == 2;
        assert dissatisfyingGrades[0] == 12;
        assert dissatisfyingGrades[1] == 22;

        //unexpected case
        grades = new int[0];
        dissatisfyingGrades = gradesProcessor.dissatisfyingGrades(grades);

        assert dissatisfyingGrades.length == 0;

        grades = new int[]{50, 40, 30, -4};
        try {
            dissatisfyingGrades = gradesProcessor.dissatisfyingGrades(grades);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 1: dissatisfyingGrades Test passed");
    }

    public static void getAverageTest() {
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{12, 23, 38, 50};

        assert gradesProcessor.getAverage(grades) == 31;

        //unexpected tests
        try {
            grades = new int[]{12, 23, -6, 44};
            gradesProcessor.getAverage(grades);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            grades = new int[0];
            gradesProcessor.getAverage(grades);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 1: getAverage Test passed");
    }

    public static void convertToRoundedGradesTest() {
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{12, 23, 38, 50, 52, 54};

        grades = gradesProcessor.convertToRoundedGrades(grades);

        assert grades[0] == 12;
        assert grades[1] == 23;
        assert grades[2] == 40;
        assert grades[3] == 50;
        assert grades[4] == 52;
        assert grades[5] == 55;

        //unexpected tests
        try {
            grades = new int[]{22, -5};
            gradesProcessor.convertToRoundedGrades(grades);
            assert false;
        } catch (RuntimeException ignored) {
        }

        grades = new int[0];
        grades = gradesProcessor.convertToRoundedGrades(grades);
        assert grades.length == 0;

        System.out.println("Ex 1: convertToRoundedGrades Test passed");
    }

    public static void getMaxRoundedGradeTest() {
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{12, 23, 38, 50, 52, 54};

        assert gradesProcessor.getMaxRoundedGrade(grades) == 55;

        try {
            grades = new int[]{22, -5};
            gradesProcessor.getMaxRoundedGrade(grades);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 1: getMaxRoundedGrade Test passed");
    }
}
