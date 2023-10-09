package ex3;

public class ArrayNumberProcessor {

    public int[] add(int[] summand1, int[] summand2) {
        /*
        Adds two natural numbers, represented as arrays
         */

        int ArraysLength = summand1.length;
        int[] result = new int[ArraysLength];
        int carry = 0;
        for (int i = ArraysLength - 1; i >= 0; i--) {
            int sum = summand1[i] + summand2[i] + carry;
            carry = sum / 10;
            result[i] = sum % 10;
        }
        if (carry != 0) {
            //insert carry to the front
            int[] newarray = new int[ArraysLength + 1];

            for (int i = 0; i < ArraysLength; i++) {
                newarray[i + 1] = result[i];
            }
            newarray[0] = carry;
            result = newarray;
        }
        return result;
    }

    public int[] subtract(int[] minuend, int[] subtrahend) {
        /*
        Subtracts two natural numbers, represented as arrays (not negative difference)
         */

        int ArraysLength = minuend.length;
        int[] result = new int[ArraysLength];
        int carry = 0;

        for (int i = ArraysLength - 1; i >= 0; i--) {
            int difference = minuend[i] - subtrahend[i] - carry;

            if (difference < 0) {
                difference += 10;
                carry = 1;
            } else carry = 0;

            result[i] = difference % 10;
        }
        return result;
    }

    public int[] multiply(int[] factorArray, int factorInt) {
        /*
        Multiplies Array with single digit int
         */

        int ArraysLength = factorArray.length;
        int[] result = new int[ArraysLength];
        int carry = 0;
        for (int i = ArraysLength - 1; i >= 0; i--) {
            int sum = factorArray[i] * factorInt + carry;
            carry = sum / 10;
            result[i] = sum % 10;
        }
        if (carry != 0) {
            //insert carry to the front
            int[] newarray = new int[ArraysLength + 1];

            for (int i = 0; i < ArraysLength; i++) {
                newarray[i + 1] = result[i];
            }
            newarray[0] = carry;
            result = newarray;
        }
        return result;
    }

    public int[] divide(int[] dividendArray, int divisorInt) {
        /*
        Divides Array with single digit int
         */

        int ArraysLength = dividendArray.length;
        int[] result = new int[ArraysLength];
        int carry = 0;

        for (int i = 0; i < ArraysLength; i++) {
            result[i] = (carry * 10 + dividendArray[i]) / divisorInt;
            carry = dividendArray[i] % divisorInt;
        }
        return result;
    }

}
