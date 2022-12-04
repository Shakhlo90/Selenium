package SeleniumTestDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GetTest {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
        //driver.findElement(By.cssSelector("input[placeholder*='enter your'")).sendKeys("Hello everyone");
        //to find webElement
        WebElement element = driver.findElement(By.xpath("//div[text()='Single Input Field']"));
//get textname
        String title=element.getText();

        System.out.println(title)
        ;
   String attribute=     element.getAttribute("class");
        System.out.println(attribute);
    }
}
