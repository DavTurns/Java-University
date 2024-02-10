package Aufgabe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void main() {
        while (true) {
            addTemps();
        }

    }

    public void addTemps() {
        // input temperaturen
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter StadtName: ");
        String stadtName = scanner.nextLine();

        System.out.print("Enter Land: ");
        String land = scanner.nextLine();

        //temperaturen

        List<Temperatur> temps = new ArrayList<>();

        float temperatur;
        int monat;
        String einheit;
        do {
            temperatur = scanner.nextFloat();
            monat = scanner.nextInt();
            einheit = scanner.nextLine();
            try {
                temps.add(new Temperatur(temperatur, einheit, monat));
            } catch (Exception e) {
                e.getMessage();
            }
            System.out.println("möchtest du noch eine temperatur hinzufügen? (J/N)");
        } while (!scanner.nextLine().equals("N"));

        controller.addTemperatures(new Stadt(stadtName, land, new ArrayList<>()), temps);
    }

    public void viewTemperatures(String mode) {
        if (mode.equals("C")) {
            controller.setStrategy(new CelsiusStrategy());
            controller.getTemps().stream().forEach(System.out::println);
        } else if (mode.equals("F")) {
            controller.setStrategy(new FahrenheitStrategy());
            controller.getTemps().stream().forEach(System.out::println);
        } else {
            System.out.println("Wrong mode");
        }

    }


}
