package ex4;

public class ElectronicsStore {
    private int[]usbDrivePrices;
    private int[]keyboardPrices;

    public ElectronicsStore(int[] usbDrivePrices, int[] keyboardPrices) {
        this.usbDrivePrices = usbDrivePrices;
        this.keyboardPrices = keyboardPrices;
    }

    public int getCheapestKeyboard(){
        int cheapestKeyboard = keyboardPrices[0];
        for(int i = 1; i<keyboardPrices.length;i++){
            if(keyboardPrices[i] < cheapestKeyboard) cheapestKeyboard = keyboardPrices[i];
        }
        return cheapestKeyboard;
    }

    public int getMostExpensivePrice(){
        int mostExpensivePrice = 0;

        for (int keyboardPrice : keyboardPrices) {
            if (keyboardPrice > mostExpensivePrice) mostExpensivePrice = keyboardPrice;
        }

        for (int usbDrivePrice : usbDrivePrices) {
            if (usbDrivePrice > mostExpensivePrice) mostExpensivePrice = usbDrivePrice;
        }
        return mostExpensivePrice;
    }

    public int getMostExpensiveAffordableKeyboard(int budget) {
        int mostExpensivePrice = 0;

        for (int keyboardPrice : keyboardPrices) {
            if (keyboardPrice > mostExpensivePrice && keyboardPrice <= budget) mostExpensivePrice = keyboardPrice;
        }
        return mostExpensivePrice;
    }

    public int getMostExpensiveAffordableCombination(int budget) {
        int mostExpensivePrice = -1;
        int currentPrice;

        for(int keyboardPrice : keyboardPrices) {
            for(int usbDrivePrice : usbDrivePrices) {
                currentPrice = keyboardPrice + usbDrivePrice;
                if(currentPrice <= budget && currentPrice > mostExpensivePrice) {
                    mostExpensivePrice = currentPrice;
                }
            }
        }
        return mostExpensivePrice;
    }

}
