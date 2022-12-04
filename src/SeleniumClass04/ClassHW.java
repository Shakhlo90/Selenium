package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ClassHW {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();

driver.findElement(By.xpath("//a[@href='basic-first-form-demo.php' and @class='list-group-item']")).click();

driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("I am so confused");

driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("7");
driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("7");
driver.findElement(By.xpath("//button[text()='Get Total']")).click();
driver.findElement(By.xpath("//a[text()='Alerts & Modals']")).click();
driver.findElement(By.xpath("//a[text()='Bootstrap Alerts']")).click();
    }
}
