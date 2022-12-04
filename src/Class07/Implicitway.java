package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Implicitway {
    public static void main(String[] args) throws InterruptedException {



            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
// goto gmail page
           driver.get("https://www.facebook.com");
        WebElement creatbtn=driver.findElement(By.cssSelector("a[ajaxify='/reg/spotlight/']"));
        creatbtn.click();

        WebElement firstname=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstname.sendKeys("Shakhlo");
    }
}
