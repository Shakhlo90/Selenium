package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.get("https://www.ebay.com");
        WebElement dropcat = driver.findElement(By.cssSelector("select[aria-label='Select a category for search']"));

        Select seldrop = new Select(dropcat);
        boolean test = seldrop.isMultiple();
        System.out.println(test);
        List<WebElement> list = seldrop.getOptions();


        for (int i = 0; i < list.size(); i++) {
            String options = list.get(i).getText();
            System.out.println(options);
            if (options.equalsIgnoreCase("Computers/Tablets & Networking")) {
                seldrop.selectByIndex(i);
            }
        }
        WebElement searchbutton = driver.findElement(By.cssSelector("input[value='Search']"));
        searchbutton.click();
        WebElement titleElement = driver.findElement(By.xpath("//span[contains(text(),'Computers, Tablets ')]"));
        String cattitle = driver.getTitle();
        System.out.println("**********************************************");
        System.out.println(cattitle);
    }
}
