package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Checkbox {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
            driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
WebElement checkbox=driver.findElement(By.id("isAgeSelected"));
checkbox.click();
//find elements of checkboxes
        List<WebElement>checkboxlist=driver.findElements(By.xpath("//input[@class='cb1-element']"));
        //treverse loop
        System.out.println(checkboxlist.size());
        for (WebElement checkboxeslists:checkboxlist){
            // get attribute value
            String options= checkboxeslists.getAttribute("value");
            if (options.equalsIgnoreCase("Option-2")){
                checkboxeslists.click();
            }
        }

    }
}
