package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class getAllLinks {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
            driver.get("http://www.ebay.com");
//anchore tags
 List<WebElement>links= driver.findElements(By.tagName("a"));
         System.out.println(links.size());
//implementing loops value of links href attribute
for(WebElement Links:links)
{String str=Links.getAttribute("href");
    System.out.println(str); }
}}

