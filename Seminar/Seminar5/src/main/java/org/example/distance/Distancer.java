package org.example.distance;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Distancer {
    private final List<CSVRecord> csvRecords;
    private final Distance distance;

    public Distancer(String csvFilePath, Distance distance) throws IOException {
        csvRecords = parseCSVFile(csvFilePath);
        this.distance = distance;
    }

    private List<CSVRecord> parseCSVFile(String csvFilePath) throws IOException {
        List<CSVRecord> records = new ArrayList<>();
        FileReader fileReader = new FileReader(csvFilePath);
        CSVParser csvParser = CSVFormat.DEFAULT
                .withFirstRecordAsHeader()
                .parse(fileReader);

        for (CSVRecord record : csvParser) {
            records.add(record);
        }

        return records;
    }

    public String findWord(String wordToFind) {
        String bestMatch = "";
        double bestDistance = Double.MAX_VALUE;

        for (CSVRecord record : csvRecords) {
            String qText = record.get("qtext").toLowerCase();
            double distance = this.distance.compute(wordToFind, qText);

            if (distance < bestDistance) {
                bestDistance = distance;
                bestMatch = qText;
            }
        }

        return bestMatch;
    }

    public String findText(String textToFind) {
        String bestMatch = "";
        double bestDistance = Double.MAX_VALUE;

        for (CSVRecord record : csvRecords) {
            String aText = record.get("aText").toLowerCase();
            double distance = this.distance.compute(textToFind, aText);

            if (distance < bestDistance) {
                bestDistance = distance;
                bestMatch = aText;
            }
        }

        return bestMatch;
    }
}

