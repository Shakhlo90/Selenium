package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
// Enter valid username and password
        WebElement username=driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        // click submit button
        WebElement submit= driver.findElement(By.cssSelector("input[type='submit']"));
        submit.click();
        //to get text
        String text=  driver.findElement(By.id("welcome")).getText();
        System.out.println(text);
    }
}
