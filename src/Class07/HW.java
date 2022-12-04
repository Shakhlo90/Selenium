package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// goto gmail page
        driver.get("http://accounts.google.com/signup");
        String parent = driver.getWindowHandle();
        WebElement helpbtn = driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement privacy = driver.findElement(By.xpath("//a[text()='Privacy']"));
        helpbtn.click();
        privacy.click();
        Set<String> handlers = driver.getWindowHandles();
        for (String handler : handlers) {
            driver.switchTo().window(handler);
            String title = driver.getTitle();
            System.out.println(title);
            if (title.equalsIgnoreCase("Google Account Help")) {
                WebElement community = driver.findElement(By.xpath("//a[text()='Community']"));
                community.click();
                break;
            }
        }
        driver.switchTo().window(parent);
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("Abcgefghjk");
    }
}
