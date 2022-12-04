package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FramePractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://chercher.tech/practice/frames");
        //WebElement id = driver.findElement(By.cssSelector("iframe[id='frame1']"));
        // driver.switchTo().frame(id);
        driver.switchTo().frame("frame1");
       // driver.switchTo().frame("frame1");
//driver.switchTo().frame("frame3");
        driver.switchTo().frame("frame3");
WebElement checkbox=driver.findElement(By.xpath("//input[@id='a']"));
checkbox.click();
    }
}