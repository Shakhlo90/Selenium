package Selenium8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HRC {

        public static String getProperty(String key) throws IOException {
            String path="C:\\Users\\tukht\\IdeaProjects\\SeliniumBatch14\\Data\\HR.properties";
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);
            return getProperty(key);
        }

    }
class TT{
    public static void main(String[] args) throws IOException {
        System.out.println(HRC.getProperty("password"));
    }
}