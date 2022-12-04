package SeleniumTestDrive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2SiliniumClass2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
driver.findElement(By.name("firstname")).sendKeys("Shakhlo");
driver.findElement(By.name("lastname")).sendKeys("Tukhtaeva");
Thread.sleep(2000);
driver.findElement(By.name("reg_email__")).sendKeys("tukhtaevashakhlo2@gmail.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("tukhtaevashakhlo2@gmail.com");
driver.findElement(By.id("password_step_input")).sendKeys("Password123!");
Thread.sleep(2000);
driver.findElement(By.id("month")).sendKeys("August");

driver.findElement(By.id("day")).sendKeys("18");
driver.findElement(By.id("year")).sendKeys("1990");
//Thread.sleep(2000);
//driver.findElement(By.xpath("//label[@class='_58mt']")).click();
Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png']")).click();
//driver.close();
//driver.quit();


driver.findElement(By.name("websubmit")).click();







    }
}
