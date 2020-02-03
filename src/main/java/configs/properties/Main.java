package configs.properties;

import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(new File("src\\main\\resources\\config\\application.properties"));
        properties.load(inputStream);
        System.out.println(properties.getProperty("application.save-cache"));
    }
}
