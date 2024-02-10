package log_parser_factory.csv;

import log_parser_factory.LogParserFactory;

public class CSVLogParserFactory implements LogParserFactory {
    @Override
    public CSVLogParser createLogParser() {
        return CSVLogParser.getInstance();
    }
}
