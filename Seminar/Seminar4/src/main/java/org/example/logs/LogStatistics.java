package logs;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LogStatistics {
    Comparator<Log> logComparator = new Comparator<Log>() {
        @Override
        public int compare(Log log1, Log log2) {
            int comparisonResult = log1.getSeverity().compareTo(log2.getSeverity());

            // Reverse it
            return comparisonResult * -1;
        }
    };

    public void displayLogs(List<Log> logs) {
        for (Log log : logs) {
            System.out.println(log);
        }
    }

    public List<Log> sortLogsBySeverity(List<Log> logs) {
        // Sort the list of logs using the custom comparator
        logs.sort(logComparator);
        return logs;
    }
}
