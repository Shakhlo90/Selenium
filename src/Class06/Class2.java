package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        //driver.get("https://the-internet.herokuapp.com/basic_auth/");
//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
//driver.get("https://syntaxprojects.com/bootstrap-iframe.php");
driver.get("https://chercher.tech/practice/frames");
driver.switchTo().frame(1);
        WebElement element=driver.findElement(By.xpath("//b [text()='Animals :']"));
        String text=element.getText();
        System.out.println(text);
driver.switchTo().defaultContent();
driver.switchTo().frame("0");
        //driver.switchTo().frame("frame1");
driver.findElement(By.xpath("//input")).sendKeys("AFFDFDHHHH");
//WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(2);
WebElement element1=driver.findElement(By.cssSelector("//input[@id='a']"));
element1.click();
        //WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
       // driver.switchTo().frame(frame3);
    }
}
