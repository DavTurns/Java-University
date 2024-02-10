package log_parser_factory.csv;

import log_parser_factory.ILogParser;
import logs.Log;
import logs.Message;
import logs.Severity;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CSVLogParser implements ILogParser {
    private static CSVLogParser instance;

    private CSVLogParser() {
        // Private constructor to enforce Singleton pattern
    }

    public static CSVLogParser getInstance() {
        if (instance == null) {
            instance = new CSVLogParser();
        }
        return instance;
    }

    public ArrayList<Log> parseLogFile(String path) throws IOException {
        ArrayList<Log> logs = new ArrayList<>();

        try (Reader reader = Files.newBufferedReader(Paths.get(path));
             CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader())) {
            for (CSVRecord csvRecord : csvParser) {
                String timestamp = csvRecord.get("timestamp");
                String severity = csvRecord.get("severity");
                String messageText = csvRecord.get("message_text");
                String messageFile = csvRecord.get("message_file");
                String[] visibilityArray = {
                        csvRecord.get("visibility_0"),
                        csvRecord.get("visibility_1"),
                };
                List<String> visibility = Arrays.asList(visibilityArray);

                Message message = new Message(messageFile, messageText);
                Log log = new Log(timestamp, visibility, Severity.valueOf(severity), message);

                // Split the visibility field into a list

                logs.add(log);
            }
        }

        return logs;
    }
}
