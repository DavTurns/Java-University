package Tests;

import Aufgabe1.Contryconverter;
import Aufgabe1.Country;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestsAufgabe1 {

    public static void testAll(){
        testConvertToListFromString();
        testFilterCountries();
        System.out.println("All tests passed");
    }

    public static void testConvertToListFromString(){
        String content ="Afghanistan Asien 652230 25500100 Kabul\n" +
                "Albanien Europa 28748 2821977 Tirana\n";

        List<Country> countries = Contryconverter.convertToListFromString(content);
        assert countries.size() == 2;
        assert Objects.equals(countries.get(0), new Country("Afghanistan", "Asien", 652230L, 25500100L, "Kabul"));
        assert Objects.equals(countries.get(1), new Country("Albanien", "Europa", 28748L, 2821977L, "Tirana"));
    }

    public static void testFilterCountries(){
        List<Country> countries = new ArrayList<>(List.of(
                new Country("Afghanistan", "Asien", 652230L, 25500100L, "Kabul"),
                new Country("Albanien", "Europa", 28748L, 2821977L, "Tirana"),
                new Country("Malbanien", "Europa", 9999L, 2821977L, "Tirana"),
                new Country("Malta", "Europa", 28748L, 2821977L, "Tirana")
        ));

        List<Country> filteredCountries = Contryconverter.filterCountries(countries);

        assert filteredCountries.size() == 1;
        assert filteredCountries.get(0).equals(new Country("Malta", "Europa", 28748L, 2821977L, "Tirana"));
    }
}
