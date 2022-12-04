package Class10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PROPERTY {
    public static String getKey(String key){
        String path="C:\\Users\\tukht\\IdeaProjects\\SeliniumBatch14\\Data\\HR.properties";
        FileInputStream file= null;
        try {
            file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties=new Properties();
        try {
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(getKey("userName"));
    }
}
