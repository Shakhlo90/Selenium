package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxPractice {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");
        // get all links
 // find check box element
        WebElement elementcheck= driver.findElement(By.xpath("//*[@id='isAgeSelected']"));
elementcheck.click();
// get all checkbox list
    List<WebElement>checkboxes= driver.findElements(By.xpath("//input[@class='cb1-element']"));
// traverse throught list of checkboxes to find desiredone
        for(WebElement checks:checkboxes){
            // to get the attrubute value to check if this is right option to select
            String option=checks.getAttribute("value");
          //if (option.equalsIgnoreCase("Option-2")) {
              checks.click();
          }
        }




    }
