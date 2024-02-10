import Aufgabe1.Contryconverter;
import Aufgabe1.Country;
import Tests.TestsAufgabe1;
import Tests.TestsAufgabe2;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void aufgabe1() {
        TestsAufgabe1.testAll();
        List<Country> countries = Contryconverter.convertToListFromString("Afghanistan Asien 652230 25500100 Kabul\n" +
                "Albanien Europa 28748 2821977 Tirana\n"+
                "Malta Europa 28748 2821977 Tirana");
        List<Country> filtered_countries = Contryconverter.filterCountries(countries);
        Contryconverter.writeToCSV(filtered_countries);


    }

    public static void main(String[] args) {
        //aufgabe1();
        //TestsAufgabe2.testAddTemperatures();

    }
}