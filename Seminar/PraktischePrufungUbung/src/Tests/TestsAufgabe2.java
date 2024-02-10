package Tests;

import Aufgabe2.CelsiusStrategy;
import Aufgabe2.Controller;
import Aufgabe2.Stadt;
import Aufgabe2.Temperatur;

import java.util.ArrayList;
import java.util.List;

public class TestsAufgabe2 {

    public static void testAddTemperatures(){
        Controller controller = new Controller(new CelsiusStrategy());

        List<Temperatur> temps = new ArrayList<>(
                List.of(new Temperatur(2,"C",1),
                        new Temperatur(3,"C",2)));

        controller.addTemperatures(
                new Stadt("cluj","Ro", new ArrayList<>()),
                temps
        );
        List<Stadt> stadtList = controller.getTemps();
        assert stadtList.size() == 1;
        assert stadtList.get(0).getTemperaturList().size() == 2;
        assert stadtList.get(0).getTemperaturList().equals(temps);
        System.out.println("TEST PASSED");
    }
}
