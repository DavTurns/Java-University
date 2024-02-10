package log_parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import logs.Log;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;


public class LogParser {

    public LogParser() {
        // Private constructor to enforce Singleton pattern
    }

    public static ArrayList<Log> parseLogFile(String path) throws IOException {
        // Read the JSON file
        FileReader fileReader = new FileReader(path);
        String fileContent = Files.readString(Paths.get("file"));

        // Create the Jackson ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        // Parse JSON into a Java object using Jackson
        Log[] logEntries = objectMapper.readValue(fileContent, Log[].class);

        ArrayList<Log> logs = new ArrayList<>(Arrays.stream(logEntries).toList());

        fileReader.close();

        return logs;
    }
}
