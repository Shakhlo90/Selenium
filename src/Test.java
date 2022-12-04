import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static String getpro(String key) throws IOException {
        String path="C:\\Users\\tukht\\IdeaProjects\\SeliniumBatch14\\Data\\HR.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        return key;
    }

    public static void main(String[] args) throws IOException {
   String user=    Test.getpro("userName");
        System.out.println(user);
    }
}
