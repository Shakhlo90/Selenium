package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        goto amazon.com
        driver.get("https://jqueryui.com/droppable/");
driver.switchTo().frame(0);
WebElement drop=driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement dropable =driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action= new Actions(driver);
//action.dragAndDrop(drop,dropable).perform();
action.clickAndHold(drop).moveToElement(dropable).release().build().perform();
    }
}