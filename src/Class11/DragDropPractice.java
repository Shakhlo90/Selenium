package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DragDropPractice {
    public static void main(String[] args) throws IOException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        goto amazon.com
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement dragbtn=driver.findElement(By.id("draggable"));
        WebElement dropbtn=driver.findElement(By.id("droppable"));

        Actions actions= new Actions(driver);
      //  actions.dragAndDrop(dragbtn,dropbtn).perform();
actions.clickAndHold(dragbtn).moveToElement(dropbtn).release().build().perform();
        TakesScreenshot ss=(TakesScreenshot)driver;
   File source=ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("sceenshots/SmartBear/dropdown.png"));
    }
}