package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.name("txtPassword"));
        password.sendKeys(" ");
        WebElement submit= driver.findElement(By.cssSelector("input[type='submit']"));
        submit.click();
        WebElement message=driver.findElement(By.id("spanMessage"));
        //WebElement message = driver.findElement(By.id("spanMessage"));
        String display = message.getText();
        System.out.println(display);
       // boolean display=message.isDisplayed();
if(display.equalsIgnoreCase("Invalid credentials")) {
    System.out.println("Password can not be empty "+message.getText());
}
else {
            System.out.println("Password can  be empty " +display);}

WebElement xp=driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/div[2]"));
String t=xp.getText();
        System.out.println(t);
    }
}
