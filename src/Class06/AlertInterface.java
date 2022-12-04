package Class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement button1=driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
        button1.click();
        Alert aler1=driver.switchTo().alert();
  String text=  aler1.getText();
        System.out.println(text);
        aler1.accept();
WebElement button3=driver.findElement(By.cssSelector("button[onclick='myPromptFunction()']"));
button3.click();
Alert alert3=driver.switchTo().alert();
String text2=alert3.getText();
        System.out.println(text);
        alert3.sendKeys("Hellooo evryone");
alert3.accept();
    }
}
