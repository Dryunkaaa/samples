package configs.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        Properties properties = new Properties();
        File configFile = new File("src\\main\\resources\\config\\settings.xml");
        InputStream inputStream = new FileInputStream(configFile);
        properties.loadFromXML(inputStream);
        String saveCacheString = properties.getProperty("save-cache");
        Settings settings = new Settings(Boolean.parseBoolean(saveCacheString));
        settings.saveCache();

        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src\\main\\resources\\config\\prop.xml"));
        Element element = document.getDocumentElement();

        NodeList nodeList = element.getElementsByTagName("settings");

        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                Element element2 = (Element) nodeList.item(i);
                System.out.println(element2.getTextContent().trim());
            }
        }
    }
}
