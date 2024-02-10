package Aufgabe1;

import Aufgabe1.Country;

import java.util.List;
import java.util.stream.Stream;

public class Contryconverter {

    public static List<Country> convertToListFromString(String content){
        return Stream.of(content.split("\n")).map(Country::parseFromString).toList();
    }

    public static List<Country> filterCountries(List<Country> countries){
        return countries.stream().filter(country -> country.getFläche()>10000 && country.getName().charAt(0) == 'M').toList();
    }

    public static void writeToCSV(List<Country> countries){
        countries.stream().forEach(country -> System.out.println(country.toCSV()));
    }
}
