package log_parser_factory.json;

import log_parser_factory.LogParserFactory;

public class JsonLogParserFactory implements LogParserFactory {
    @Override
    public JsonLogParser createLogParser() {
        return JsonLogParser.getInstance();
    }
}
