package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Aufgabe1 {
    public static void convertCountries(String inputFile, String outputFile, boolean filteroption){
        try {
            File myObj = new File(inputFile);
            Scanner myReader = new Scanner(myObj);
            String finalString = "";

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                if(filteroption){
                    if(!(data.charAt(0) == 'M') || !(Long.parseLong(data.split(" ")[2]) > 10000) )
                        continue;
                }
                String convertedData = Stream.of(data.split(" ")).collect(Collectors.joining(";"));
                finalString += convertedData;
                finalString += "\n";


            }
            System.out.println(finalString);
            myReader.close();
            writeToFile(outputFile, finalString);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static private void writeToFile(String name, String content) {
        try {
            FileWriter myWriter = new FileWriter(name);
            myWriter.write(content);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
