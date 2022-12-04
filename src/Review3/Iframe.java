package Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// goto gmail page
        driver.get("https://chercher.tech/practice/frames");
// switch the focus of the driver
        driver.switchTo().frame("frame1");
driver.switchTo().frame(0);
WebElement checkbox=driver.findElement(By.id("a"));
checkbox.click();





    }
}