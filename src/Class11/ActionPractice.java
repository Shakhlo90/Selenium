package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionPractice {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            // create a WebDriver instance
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //        goto amazon.com
            driver.get("http://amazon.com");
        WebElement enHover=driver.findElement(By.xpath("//div[text()='EN']/preceding-sibling::span"));
        WebElement radiobtn=driver.findElement(By.xpath("//span[text()='español']"));
        Actions actions= new Actions(driver);
        actions.moveToElement(enHover).perform();
       // radiobtn.click();
    }
}
