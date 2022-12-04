package ReviewPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class United {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.united.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        WebElement oneway=driver.findElement(By.cssSelector(" input[id='oneway']"));
        WebElement withmiles=driver.findElement(By.xpath("//span[text()='Book with miles']"));
        WebElement dateflex=driver.findElement(By.xpath("//span[contains(text(), 'Flexible ')]"));
        WebElement departure=driver.findElement(By.xpath("//input[@aria-owns='bookFlightOriginInput-menu']"));
        WebElement destination=driver.findElement(By.xpath(" //input[@id= 'bookFlightDestinationInput']"));
        sleep(3000);
        WebElement month=driver.findElement(By.xpath("//button[@aria-haspopup='listbox']"));
month.click();

        oneway.click();
        dateflex.click();

      /*  departure.clear();
        departure.sendKeys("New York");
        departure.sendKeys(Keys.ARROW_DOWN);
        departure.sendKeys(Keys.ENTER);
        destination.click();
        destination.sendKeys("Dallas");
        destination.sendKeys(Keys.ARROW_DOWN);
        destination.sendKeys(Keys.ENTER);
*/





    }
}
