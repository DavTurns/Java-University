package ex4;

public class ElectronicsStoreTest {

    public static void constructorTest() {
        //unexpected case

        try {
            ElectronicsStore es = new ElectronicsStore(new int[]{15, 20, 10, 45}, new int[]{5, 20, 25, -5});
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            ElectronicsStore es = new ElectronicsStore(new int[]{15, 20, -10, 45}, new int[]{5, 20, 25, -5});
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 4: constructorTest passed");

    }

    public static void getCheapestKeyboardTest() {
        ElectronicsStore es = new ElectronicsStore(new int[]{15, 20, 10, 45}, new int[]{5, 20, 25, 50});

        assert es.getCheapestKeyboard() == 5;

        System.out.println("Ex 4: getCheapestKeyboardTest passed");
    }

    public static void getMostExpensivePriceTest() {
        ElectronicsStore es = new ElectronicsStore(new int[]{15, 20, 10, 45}, new int[]{5, 20, 25, 50});

        assert es.getMostExpensivePrice() == 50;

        System.out.println("Ex 4: getMostExpensivePriceTest passed");
    }

    public static void getMostExpensiveAffordableKeyboardTest() {
        ElectronicsStore es = new ElectronicsStore(new int[]{15, 20, 10, 45}, new int[]{5, 20, 25, 50});

        assert es.getMostExpensiveAffordableUsbDrive(15) == 5;
        assert es.getMostExpensiveAffordableUsbDrive(27) == 25;
        assert es.getMostExpensiveAffordableUsbDrive(49) == 25;

        //unexpected case
        try {
            es.getMostExpensiveAffordableUsbDrive(-40);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            es.getMostExpensiveAffordableUsbDrive(0);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 4: getMostExpensiveAffordableKeyboardTest passed");
    }

    public static void getMostExpensiveAffordableCombinationTest() {
        ElectronicsStore es = new ElectronicsStore(new int[]{15, 20, 10, 45}, new int[]{5, 20, 25, 50});

        assert es.getMostExpensiveAffordableCombination(40) == 40;
        assert es.getMostExpensiveAffordableCombination(3) == -1;
        assert es.getMostExpensiveAffordableCombination(35) == 35;
        assert es.getMostExpensiveAffordableCombination(49) == 45;

        //unexpected case
        try {
            es.getMostExpensiveAffordableCombination(-40);
            assert false;
        } catch (RuntimeException ignored) {
        }

        try {
            es.getMostExpensiveAffordableCombination(0);
            assert false;
        } catch (RuntimeException ignored) {
        }

        System.out.println("Ex 4: getMostExpensiveAffordableCombinationTest passed");
    }
}
