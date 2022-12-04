package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClassPractice1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        //find the button click me for the alert and click on it;
WebElement simplealart=driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
simplealart.click();
// Handling the alert
        Alert simplealart1=driver.switchTo().alert();
simplealart1.accept();
//find the button for confermation button
        WebElement confbutton=driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']"));
        confbutton.click();
        Thread.sleep(3000);
        Alert confermAlaert=driver.switchTo().alert();
        confermAlaert.dismiss();
        //find promtalert element and click it;
        WebElement prompalert= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        prompalert.click();
        Thread.sleep(3000);
        // switch driver to alert
        Alert promt=driver.switchTo().alert();
        promt.sendKeys("Abcdafg");
        promt.accept();

    }
}
