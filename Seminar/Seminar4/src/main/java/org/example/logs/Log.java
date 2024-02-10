package logs;

import java.util.List;

public class Log {
    private String timestamp;
    private List<String> visibility;
    private Severity severity;
    private Message message;

    public Log(String timestamp, List<String> visibility, Severity severity, Message message) {
        this.timestamp = timestamp;
        this.visibility = visibility;
        this.severity = severity;
        this.message = message;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<String> getVisibility() {
        return visibility;
    }

    public void setVisibility(List<String> visibility) {
        this.visibility = visibility;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Log{" +
                "timestamp=" + timestamp +
                ", visibility=" + visibility +
                ", severity=" + severity +
                ", message=" + message +
                '}';
    }
}
