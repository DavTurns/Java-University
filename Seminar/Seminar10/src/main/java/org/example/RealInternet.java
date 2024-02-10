package org.example;

public class RealInternet implements Internet{

    @Override
    public void connectingTo(String site) {
        System.out.println("Connecting to: " + site);
    }
}
