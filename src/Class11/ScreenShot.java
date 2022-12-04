package Class11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        goto amazon.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.name("ctl00$MainContent$username"));
        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        username.sendKeys("Tester", Keys.TAB);
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot ss = (TakesScreenshot) driver;
        File sourceFile = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File("sceenshots/SmartBear/adminLogin1.png"));


//C:\Users\tukht\OneDrive\Desktop\ScreenShot
    }}