package ex2;

public class ArrayProcessor {

    public int getMax(int[] numbers) {

        int maxnumb = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxnumb) maxnumb = numbers[i];
        }
        return maxnumb;
    }

    public int getMin(int[] numbers) {

        int minnumb = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minnumb) minnumb = numbers[i];
        }
        return minnumb;
    }

    public int maxSum(int[] numbers) {

        int minnumb = getMin(numbers);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) sum += numbers[i];

        return sum - minnumb;
    }

    public int minSum(int[] numbers) {

        int maxnumb = getMax(numbers);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) sum += numbers[i];

        return sum - maxnumb;
    }

}
