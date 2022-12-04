package SeleniumClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shakhlo");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lalapop");
//driver.findElement(By.xpath("//button[@name='login']")).click();
//driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();




    }
}