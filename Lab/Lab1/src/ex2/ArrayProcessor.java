package ex2;

public class ArrayProcessor {

    public boolean verifyIfArrayIsExpectedInput(int[] numbers){

        if(numbers.length == 0) return false;

        for(int number: numbers) {
            if (number <= 0) return false;
        }
        return true;
    }
    public int getMax(int[] numbers) {
        //returns -1 if input is wrong
        if(!verifyIfArrayIsExpectedInput(numbers)) return -1;

        int maxnumb = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxnumb) maxnumb = numbers[i];
        }
        return maxnumb;
    }

    public int getMin(int[] numbers) {
        //returns -1 if input is wrong
        if(!verifyIfArrayIsExpectedInput(numbers)) return -1;

        int minnumb = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minnumb) minnumb = numbers[i];
        }
        return minnumb;
    }

    public int maxSum(int[] numbers) {
        //returns -1 if input is wrong
        if(!verifyIfArrayIsExpectedInput(numbers)) return -1;

        int minnumb = getMin(numbers);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) sum += numbers[i];

        return sum - minnumb;
    }

    public int minSum(int[] numbers) {
        //returns -1 if input is wrong
        if(!verifyIfArrayIsExpectedInput(numbers)) return -1;

        int maxnumb = getMax(numbers);
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) sum += numbers[i];

        return sum - maxnumb;
    }

}
