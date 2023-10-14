package ex3;

public class ArrayNumberProcessor {

    private void verifyIfArrayRepresentsNumber(int[] array) {
        //helper function

        if (array.length == 0) throw new IllegalArgumentException("Array doesnt represent any number");
        boolean numberStarted = false;

        if (array[0] == 0)
            throw new IllegalArgumentException("Number has actually less digits than its array length, eg. 00023");

        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) throw new IllegalArgumentException("Array doesnt represent any number");
        }
    }

    public int[] compressArray(int[] array) {
        /*
        Removes additional 0s e.g. 00134 -> 134
         */
        int i = 0; // represents count of additional zeros
        while(array[i] == 0) {
            i++;
            if(i == array.length) return new int[]{0};
        }

        int[] newArray = new int[array.length - i];
        for(int j = 0; j < newArray.length; j++) {
            newArray[j] = array[j+i];
        }
        return newArray;
    }

    public int[] add(int[] summand1, int[] summand2) {
        /*
        Adds two natural numbers, represented as arrays
         */

        //verify input
        verifyIfArrayRepresentsNumber(summand1);
        verifyIfArrayRepresentsNumber(summand2);

        if (summand1[0] < 0) throw new IllegalArgumentException("Represented number is negative");
        if (summand2[0] < 0) throw new IllegalArgumentException("Represented number is negative");

        if (summand1.length != summand2.length) throw new IllegalArgumentException("Arrays have not the same length");


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

        //verify input
        verifyIfArrayRepresentsNumber(minuend);
        verifyIfArrayRepresentsNumber(subtrahend);

        if (minuend[0] < 0) throw new IllegalArgumentException("Represented number is negative");
        if (subtrahend[0] < 0) throw new IllegalArgumentException("Represented number is negative");

        if (minuend.length != subtrahend.length) throw new IllegalArgumentException("Arrays have not the same length");

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

        if (carry == 1) {
            result = subtract(subtrahend, minuend);
            for (int i = 0; i < result.length; i++) {
                if (result[i] != 0) {
                    result[i] *= -1;
                    break;
                }
            }
        }
        return compressArray(result);
    }

    public int[] multiply(int[] factorArray, int factorInt) {
        /*
        Multiplies Array with single digit int
        Negative Array and negative digit are allowed
         */

        int[] result;
        verifyIfArrayRepresentsNumber(factorArray);
        if (factorInt / 10 > 0) throw new IllegalArgumentException("Integer is not digit");

        if (factorInt < 0) {
            result = multiply(factorArray, -factorInt);
            result[0] *= -1;
            return result;
        }

        if (factorArray[0] < 0) {
            factorArray[0] *= -1;
            result = multiply(factorArray, factorInt);
            result[0] *= -1;
            return result;
        }

        int ArraysLength = factorArray.length;
        result = new int[ArraysLength];
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
        return compressArray(result);
    }

    public int[] divide(int[] dividendArray, int divisorInt) {
        /*
        Divides Array with single digit int
         */

        verifyIfArrayRepresentsNumber(dividendArray);
        if (divisorInt / 10 > 0) throw new IllegalArgumentException("Integer is not digit");

        int[] result;
        if (divisorInt < 0) {
            result = divide(dividendArray, -divisorInt);
            result[0] *= -1;
            return result;
        }

        if (dividendArray[0] < 0) {
            dividendArray[0] *= -1;
            result = divide(dividendArray, divisorInt);
            result[0] *= -1;
            return result;
        }

        int ArraysLength = dividendArray.length;
        result = new int[ArraysLength];
        int carry = 0;

        for (int i = 0; i < ArraysLength; i++) {
            result[i] = (carry * 10 + dividendArray[i]) / divisorInt;
            carry = (dividendArray[i] + carry*10) % divisorInt;
        }

        return compressArray(result);
    }

}
