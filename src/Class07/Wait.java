package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// goto gmail page
        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        WebElement startbtn=driver.findElement(By.id("startButton"));
        startbtn.click();
WebElement name=driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
String string=name.getText();
        System.out.println(string);




    }
}
