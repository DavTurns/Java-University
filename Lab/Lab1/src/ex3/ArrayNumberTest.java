package ex3;

import java.util.Arrays;

public class ArrayNumberTest {


    public static void compressArrayTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        assert Arrays.equals(p1.compressArray(new int[]{0, 0, 3, 2}), new int[]{3, 2});
        assert Arrays.equals(p1.compressArray(new int[]{3, 2}), new int[]{3, 2});
        assert Arrays.equals(p1.compressArray(new int[]{0, 3, 2}), new int[]{3, 2});
        assert Arrays.equals(p1.compressArray(new int[]{0, 0, 0, 0, 0, 0}), new int[]{0});

        System.out.println("Ex 3: compressArrayTest passed");
    }

    public static void addTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //without carry
        assert Arrays.equals(p1.add(new int[]{1, 0, 5, 1, 2}, new int[]{2, 4, 2, 3, 6}), new int[]{3, 4, 7, 4, 8});
        //using carry
        assert Arrays.equals(p1.add(new int[]{9, 7, 5, 7}, new int[]{2, 4, 2, 6}), new int[]{1, 2, 1, 8, 3});

        //unexpected tests
        try {
            p1.add(new int[0], new int[0]);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.add(new int[]{5, 1, 6}, new int[]{3, 4});
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.add(new int[]{0, 0, 6}, new int[]{3, 4, 1});
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.add(new int[]{5, 4, 3}, new int[]{4, -7, 1});
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 3: addTest passed");
    }

    public static void subtractTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //without carry
        assert Arrays.equals(p1.subtract(new int[]{6, 5, 4, 7}, new int[]{2, 4, 1, 3}), new int[]{4, 1, 3, 4});

        //using carry without negative difference
        assert Arrays.equals(p1.subtract(new int[]{9, 2, 2, 6}, new int[]{8, 4, 5, 6}), new int[]{7, 7, 0});

        //using carry with negative difference
        assert Arrays.equals(p1.subtract(new int[]{4, 2, 2, 6}, new int[]{8, 4, 5, 6}), new int[]{-4, 2, 3, 0});

        //using carry with negative difference with less digits
        assert Arrays.equals(p1.subtract(new int[]{9, 9, 8}, new int[]{9, 9, 9}), new int[]{-1});

        //unexpected tests
        try {
            p1.subtract(new int[0], new int[0]);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.subtract(new int[]{5, 1, 6}, new int[]{3, 4});
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.subtract(new int[]{0, 0, 6}, new int[]{3, 4, 1});
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.subtract(new int[]{5, 4, 3}, new int[]{4, -7, 1});
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 3: subtractTest passed");
    }

    public static void multiplyTest() {
        ArrayNumberProcessor p1 = new ArrayNumberProcessor();

        //without carry
        assert Arrays.equals(p1.multiply(new int[]{2, 3, 4, 4}, 2), new int[]{4, 6, 8, 8});

        //using carry
        assert Arrays.equals(p1.multiply(new int[]{6, 3, 4, 4}, 5), new int[]{3, 1, 7, 2, 0});

        //using carry + negative factor
        assert Arrays.equals(p1.multiply(new int[]{2, 3, 4, 4}, -5), new int[]{-1, 1, 7, 2, 0});

        //using carry + negative factor
        assert Arrays.equals(p1.multiply(new int[]{-2, 3, 4, 4}, 5), new int[]{-1, 1, 7, 2, 0});


        //unexpected tests
        try {
            p1.multiply(new int[0], 3);
            assert false;
        } catch (RuntimeException ignored) {
        }

        assert Arrays.equals(p1.multiply(new int[]{5, 1, 6}, 0), new int[]{0});

        try {
            p1.multiply(new int[]{6, 5}, 33);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.multiply(new int[]{5, 4, 3}, -13);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.multiply(new int[]{0, 0, 6, 5}, 3);
            assert false;
        } catch (RuntimeException ignored) {
        }

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

        //SAME BUT WITH NEGATIVE NUMBERS
        //simple division without carry
        assert Arrays.equals(p1.divide(new int[]{6, 8, 4, 0}, -2), new int[]{-3, 4, 2, 0});

        //division with carry
        assert Arrays.equals(p1.divide(new int[]{-7, 8, 4, 0}, 2), new int[]{-3, 9, 2, 0});

        //division with carry at the beginning
        assert Arrays.equals(p1.divide(new int[]{-6, 8, 4, 0}, -2), new int[]{3, 4, 2, 0});

        //unexpected tests
        try {
            p1.divide(new int[0], 3);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.divide(new int[]{5, 1, 6}, 0);
        } catch (RuntimeException ignored) {
        }

        try {
            p1.divide(new int[]{6, 5}, 33);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.divide(new int[]{5, 4, 3}, -13);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            p1.divide(new int[]{0, 0, 6, 5}, 3);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 3: divideTest passed");
    }
}
