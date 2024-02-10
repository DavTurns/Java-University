package log_parser_factory;

import logs.Log;

import java.io.IOException;
import java.util.List;

public interface ILogParser {
    List<Log> parseLogFile(String path) throws Exception;
}
