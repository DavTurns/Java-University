package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void aufgabe1() {

        List<Auto> autos = new ArrayList<>(List.of(
                new Auto("Dacia", "Papuc", 1995),
                new Auto("Kia", "None", 1908),
                new Auto("Ford", "Fiesta", 1997),
                new Auto("VW", "Lupo", 1999)
        ));
        autos.stream().filter(auto -> !auto.getModell().equals("None")).forEach(auto -> System.out.println(auto.getModell()));
        Map<Integer, List<String>> baujahrModelle = autos.stream().filter(auto -> auto.getMarke().equals("Dacia")).collect(Collectors.groupingBy(Auto::getBaujahr, Collectors.mapping(Auto::getModell, toList())));
    }

    public static void aufgabe2() {
        /*Gegeben sei ein Text als String. Gehen Sie die Wörter durch und geben Sie sie jeweils in einer separaten Zeile mit
zwei Leerzeichen vor jedem Wort aus. Die "map"-Methode dürft ihr nicht verwenden!*/
        String satz = "Ana are mere ma.";
        List<String> temp = new ArrayList<>();

        Arrays.stream(satz.split(" ")).forEach(word -> temp.add("\n  " + word));
        String newSatz = temp.stream().collect(Collectors.joining());
        System.out.println(newSatz);
    }


    public static void aufgabe3() {
        /* Gegeben sei ein Text als String.
        Geben Sie sich alle Wörter aus, für die der erste Buchstabe groß ist.
        */

        String text = "Hallo balo Mallo Rallo";
        List.of(text.split(" ")).stream().filter(word -> Character.isUpperCase(word.charAt(0))).forEach(System.out::println);
    }

    public static String readFromFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()){
            String zeile = scanner.nextLine();
            sb.append(zeile);
            sb.append("\n");
        }
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

    public static void aufgabe4() throws FileNotFoundException {
        /*Gegeben sei eine Datei mit Wörtern.
        Geben Sie aus (in Uppercase und mit ! and Ende) alle Wörter die “ete” und
        “ar” enthalten. Die Wörter müssen sortiert werden.
        */

        String content = readFromFile("fil.txt");
        content = List.of(content.split("\n")).stream().collect(Collectors.joining(" "));
        String[] convertedContent = List.of(content.split(" ")).stream().filter(word -> word.contains("ar") || word.contains("ete")).sorted().map(word -> word.toUpperCase() + "!").toArray(String[]::new);
        System.out.println(content);
        System.out.println(convertedContent);
    }

    public static void aufgabe5() {
        String text = "Ana are mere Mare OPOP Qlll qwe";
        String final1 = "";
        System.out.println(List.of(text.split(" ")).stream()
                .map(w -> w.length() < 4 ? w.toUpperCase() : w)
                .filter(w -> w.contains("E")).collect(Collectors.joining(" ")));


        System.out.println(Arrays.stream(text.split(" "))
                .map(w -> w.length() < 4 ? w.toUpperCase() : w)
                .filter(w -> w.contains("Q")).collect(Collectors.joining(", ", "Start: ", " :End"))
        );

        //wichtig

        //System.out.println(final1);
    }

    public static void aufgabe9() {
        /*Implementieren Sie einen Kennwortüberprüfer (Password checker), die überprüft, ob die Kennwortlänge größer
        als 8 ist und mindestens eine Zahl, mindestens einen Großbuchstaben und mindestens eines der folgenden Symbole
        enthält:! @ # $% ^ & * (). Gegeben sei eine Liste von Passwords. Drucken Sie alle Passwörter und ob sie gültig sind
        oder nicht.*/

        List.of("asdfgh", "asdfghjk", "asdfKghj", "asdfKg4j", "as(dfKg4j").stream()
                .forEach(
                        pw -> {
                            if (pw.chars().anyMatch(
                                    chr -> Character.isUpperCase(chr)) &&
                                    pw.chars().anyMatch(
                                            chr -> Character.isDigit(chr)) &&
                                    pw.chars().anyMatch(
                                            chr -> "!@#$%^&*()".contains(Character.toString(chr))))
                                System.out.println(pw + " valid");
                            else System.out.println(pw + " invalid");
                        }

                );


    }




    public static void main(String[] args) throws FileNotFoundException {
        //aufgabe1();
        aufgabe9();

        //10
        List.of(readFromFile("eink.csv").split("\n"))
                .stream().map(Line::parseFromCSVLine)
                .forEach(line -> System.out.println(line.toString()));

        Internet internet = new ProxyInternet(List.of("ph.com", "redTube.com"));
        internet.connectingTo("google.com");
        internet.connectingTo("ph.com");



    }
}