package Class9;

import Selenium8.HRC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
class PP{
public static String getProperty(String key) throws IOException {
        String path="C:\\Users\\tukht\\IdeaProjects\\SeliniumBatch14\\Data\\HR.properties";
        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        return getProperty(key);}}
public class DynamicTable2 {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
//http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        WebElement user = driver.findElement(By.id("txtUsername"));
        user.sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
////table[@id='resultTable']/tbody/tr[1]/td[2]
        List<WebElement> idlist = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
        for (int i = 0; i < idlist.size(); i++) {

            String num = idlist.get(i).getText();
            System.out.println(num);
            if (num.equalsIgnoreCase("45137A")||num.equalsIgnoreCase("45022A")) {
                WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkbox.click();
            }}






        }
    }
