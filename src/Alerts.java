import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// goto gmail page
        driver.get("https://demoqa.com/alerts");
       WebElement alert= driver.findElement(By.id("alertButton"));
alert.click();
Thread.sleep(2000);
Alert btn=driver.switchTo().alert();
btn.accept();
WebElement alerttext=driver.findElement(By.id("promtButton"));
alerttext.click();
Thread.sleep(2000);
btn.sendKeys("Keysend");
btn.accept();

    }
}