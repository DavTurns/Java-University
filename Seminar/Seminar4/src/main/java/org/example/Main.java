package org.example;

import log_parser.LogParser;
import log_parser_factory.csv.CSVLogParser;
import log_parser_factory.csv.CSVLogParserFactory;
import log_parser_factory.json.JsonLogParser;
import log_parser_factory.json.JsonLogParserFactory;
import log_parser_factory.xml.XMLLogParser;
import log_parser_factory.xml.XMLLogParserFactory;
import logs.Log;
import logs.LogStatistics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String jsonLogFilePath = "log_file.json";
        String xmlLogFilePath = "log_file.xml";
        String csvLogFilePath = "log_file.csv";
        LogStatistics statistics = new LogStatistics();
        ArrayList<Log> logs;

        // Classic LogParser
        try {
            logs = LogParser.parseLogFile(jsonLogFilePath);
            statistics.displayLogs(statistics.sortLogsBySeverity(logs));
        } catch (Exception e) {
            System.out.println(e);
        }

        // Factory Pattern
        System.out.println("------------------------------------------");
        System.out.println("JSON");
        System.out.println("------------------------------------------");

        JsonLogParserFactory jsonLogParserFactory = new JsonLogParserFactory();
        JsonLogParser jsonLogParser = jsonLogParserFactory.createLogParser();

        try {
            logs = jsonLogParser.parseLogFile(jsonLogFilePath);
            statistics.displayLogs(statistics.sortLogsBySeverity(logs));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("------------------------------------------");
        System.out.println("XML");
        System.out.println("------------------------------------------");
        XMLLogParserFactory xmlLogParserFactory = new XMLLogParserFactory();
        XMLLogParser xmlLogParser = xmlLogParserFactory.createLogParser();

        try {
            logs = xmlLogParser.parseLogFile(xmlLogFilePath);
            statistics.displayLogs(statistics.sortLogsBySeverity(logs));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("------------------------------------------");
        System.out.println("CSV");
        System.out.println("------------------------------------------");
        CSVLogParserFactory csvLogParserFactory = new CSVLogParserFactory();
        CSVLogParser csvLogParser = csvLogParserFactory.createLogParser();

        try {
            logs = csvLogParser.parseLogFile(csvLogFilePath);
            statistics.displayLogs(statistics.sortLogsBySeverity(logs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}