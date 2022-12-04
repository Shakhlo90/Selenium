package SeleniumClass04;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonTest {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.MINUTES);
        driver.get("https://Amazon" +
                ".com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).sendKeys("Amazon Fresh", Keys.ENTER);
        WebElement dropdowns = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        List<WebElement> list = driver.findElements(By.cssSelector("select[id='searchDropdownBox'] option"));

        System.out.println(list.size());
        Dimension number = dropdowns.getSize();
        for (int i=0; i<= list.size(); i++) {

            dropdowns.isSelected();
            if(list.size()== list.size()) {
                System.out.println(dropdowns.getText());
                break;

            }

           }
        }
    }

        /*System.out.println(dropdowns.getText());
        driver.findElement(By.xpath("//option[text()='Alexa Skills']")).click();
        driver.findElement(By.xpath("//option[text()='Amazon Devices']")).click();
        System.out.println("-----------------------");
        System.out.println(driver.getTitle());
        Select drop= new Select(dropdowns);

       drop.selectByIndex(5);
        System.out.println(drop.getFirstSelectedOption());

        System.out.println(drop.getFirstSelectedOption());
       drop.selectByVisibleText("Baby");
        System.out.println(drop.getFirstSelectedOption());
        driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).sendKeys("Amazon Fresh");
        System.out.println(   driver.findElement(By.tagName("a")).getSize());


    }



    }*/
