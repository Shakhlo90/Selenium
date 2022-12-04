package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://chercher.tech/practice/frames");
        WebElement id = driver.findElement(By.cssSelector("iframe[id='frame1']"));
        driver.switchTo().frame(id);
        WebElement element = driver.findElement(By.xpath("//input"));
        element.sendKeys("Hello");
        WebElement frame3 = driver.findElement(By.cssSelector("iframe[id='frame3']"));
        driver.switchTo().frame(frame3);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='animals']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Baby Cat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        element.clear();
        element.sendKeys("DONE");
    }
}
