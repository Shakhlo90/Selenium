package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Multydrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement dd=driver.findElement(By.id("multi-select"));
        Select select= new Select(dd);
        select.selectByIndex(3);
        select.selectByVisibleText("Texas");
        Thread.sleep(3000);
// deselect by index
        select.deselectByIndex(3);

        // select all options
        List<WebElement> options= select.getOptions();

        for(int i=0; i<options.size();i++){
            select.selectByIndex(i);
        }
select.deselectAll();

        // how to check dropdown is multy select or
       boolean multyselect=select.isMultiple();
        System.out.println(multyselect);


        }
    }

