package Class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ActionDemoPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        goto amazon.com
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        WebElement rightnext = driver.findElement(By.xpath("//span[text()='Edit']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        Thread.sleep(3000);
        rightnext.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(5000);
        WebElement doubleClickbtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(doubleClickbtn).perform();
        actions.doubleClick(doubleClickbtn).perform();
        alert.accept();


    }
}