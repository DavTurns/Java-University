package ex3;

import java.util.Arrays;

public class ArrayNumberTest {

    public static void addTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //without carry
        assert Arrays.equals(p1.add(new int[]{0, 0, 5, 1, 2}, new int[]{2, 4, 2, 3, 6}), new int[]{2, 4, 7, 4, 8});
        //using carry
        assert Arrays.equals(p1.add(new int[]{9, 7, 5, 7}, new int[]{2, 4, 2, 6}), new int[]{1, 2, 1, 8, 3});

        System.out.println("Ex 3: addTest passed");
    }

    public static void subtractTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //without carry
        assert Arrays.equals(p1.subtract(new int[]{6, 5, 4, 7}, new int[]{2, 4, 1, 3}), new int[]{4, 1, 3, 4});

        //using carry without negative difference
        assert Arrays.equals(p1.subtract(new int[]{9, 2, 2, 6}, new int[]{8, 4, 5, 6}), new int[]{0, 7, 7, 0});

        //using carry with negative difference
        //assert p1.subtract(new int[]{4,2,2,6}, new int[]{8,4,5,6}) == new int[]{-4,2,3,0};

        System.out.println("Ex 3: subtractTest passed");
    }

    public static void multiplyTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //without carry
        assert Arrays.equals(p1.multiply(new int[]{2, 3, 4, 4}, 2), new int[]{4, 6, 8, 8});

        //using carry
        assert Arrays.equals(p1.multiply(new int[]{6, 3, 4, 4}, 5), new int[]{3, 1, 7, 2, 0});

        //using carry + negative factor
        //assert Arrays.equals(p1.multiply(new int[]{2, 3, 4, 4}, -5), new int[]{-1, 1, 7, 2, 0});

        System.out.println("Ex 3: multiplyTest passed");
    }

    public static void divideTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //simple division without carry
        assert Arrays.equals(p1.divide(new int[]{6, 8, 4, 0}, 2), new int[]{3, 4, 2, 0});

        //division with carry
        assert Arrays.equals(p1.divide(new int[]{7, 8, 4, 0}, 2), new int[]{3, 9, 2, 0});

        //division with carry at the beginning
        assert Arrays.equals(p1.divide(new int[]{6, 8, 4, 0}, 2), new int[]{3, 4, 2, 0});
        System.out.println("Ex 3: divideTest passed");
    }
}
