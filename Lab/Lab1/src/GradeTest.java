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

        System.out.println("addToArrayTest passed");
    }

    public static void roundTest() {
        Grades gradesProcessor = new Grades();

        assert gradesProcessor.round(20) == 20;
        assert gradesProcessor.round(34) == 34;
        assert gradesProcessor.round(53) == 55;
        assert gradesProcessor.round(38) == 40;
        assert gradesProcessor.round(62) == 62;

        System.out.println("roundTest passed");

    }

    public static void dissatisfyingGradesTest() {
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{12, 22, 38, 50};

        int[] dissatisfyingGrades = gradesProcessor.dissatisfyingGrades(grades);

        assert dissatisfyingGrades.length == 2;
        assert dissatisfyingGrades[0] == 12;
        assert dissatisfyingGrades[1] == 22;

        System.out.println("dissatisfyingGradesTest passed");
    }

    public static void getAverageTest(){
        Grades gradesProcessor = new Grades();

        int[] grades = new int[]{12, 23, 38, 50};

        assert gradesProcessor.getAverage(grades) == 31;
        System.out.println("getAverageTest passed");
    }
}
