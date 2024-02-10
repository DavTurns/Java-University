package log_parser_factory.xml;

import log_parser_factory.ILogParser;
import logs.Log;
import logs.Message;
import logs.Severity;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class XMLLogParser implements ILogParser {
    private static XMLLogParser instance;

    private XMLLogParser() {
        // Private constructor to enforce Singleton pattern
    }

    public static XMLLogParser getInstance() {
        if (instance == null) {
            instance = new XMLLogParser();
        }
        return instance;
    }

    public ArrayList<Log> parseLogFile(String path) throws Exception {

        ArrayList<Log> logs = new ArrayList<>();
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(path));

        NodeList logNodes = document.getElementsByTagName("log");

        for (int i = 0; i < logNodes.getLength(); i++) {
            Element logElement = (Element) logNodes.item(i);

            Element messageElement = (Element) logElement.getElementsByTagName("message").item(0);
            Node file = messageElement.getElementsByTagName("file").item(0);
            Node text = messageElement.getElementsByTagName("text").item(0);
            String fileText = null;
            String textText = null;

            if (file != null) {
                fileText = file.getTextContent();
            }

            if (text != null) {
                textText = text.getTextContent();
            }
            Message message = new Message(fileText, textText);

            List<String> visibility = new ArrayList<>();
            Node visibility1 = logElement.getElementsByTagName("visibility").item(0);
            Node visibility2 = logElement.getElementsByTagName("visibility").item(1);

            if (visibility1 != null) {
                visibility.add(visibility1.getTextContent());
            }
            if (visibility2 != null) {
                visibility.add(visibility2.getTextContent());
            }

            String timestamp = logElement.getElementsByTagName("timestamp").item(0).getTextContent();
            String severity = logElement.getElementsByTagName("severity").item(0).getTextContent();
            Log log = new Log(timestamp, visibility, Severity.valueOf(severity), message);

            logs.add(log);
        }

        return logs;
    }
}
