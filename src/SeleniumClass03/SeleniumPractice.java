package SeleniumClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Shakhlo");
driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("gmail.com");
driver.findElement(By.xpath("//textarea[@ placeholder='Current Address']")).sendKeys("Hello");
driver.findElement(By.xpath("//textarea[starts-with(@id,'permanentAddress')]")).sendKeys("Hello");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[starts-with(text(),'Simple')][contains(@class,'group')]")).click();



    }
}