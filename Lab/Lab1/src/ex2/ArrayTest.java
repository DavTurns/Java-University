package ex2;

public class ArrayTest {

    public static void arrayTest() {
        //Here are all tests as they're not that complex

        ArrayProcessor ap = new ArrayProcessor();

        int[] numbers = new int[]{4, 8, 3, 10, 17};

        assert ap.getMax(numbers) == 17;
        assert ap.getMin(numbers) == 3;
        assert ap.maxSum(numbers) == 39;
        assert ap.minSum(numbers) == 25;

        //unexpected tests
        numbers = new int[0];
        assert ap.getMax(numbers) == -1;
        assert ap.getMin(numbers) == -1;
        assert ap.maxSum(numbers) == -1;
        assert ap.minSum(numbers) == -1;

        numbers = new int[]{4, -5, 3, 10, 17};
        assert ap.getMax(numbers) == -1;
        assert ap.getMin(numbers) == -1;
        assert ap.maxSum(numbers) == -1;
        assert ap.minSum(numbers) == -1;

        System.out.println("Ex 2: All tests passed");
    }


}
