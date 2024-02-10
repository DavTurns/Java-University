package log_parser_factory.xml;

import log_parser_factory.LogParserFactory;

public class XMLLogParserFactory implements LogParserFactory {
    @Override
    public XMLLogParser createLogParser() {
        return XMLLogParser.getInstance();
    }
}
