package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestUnited {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://united.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        driver.manage().window().maximize();

  WebElement element= driver.findElement(By.xpath("//span[text()='One-way']"));
        element.click();
//driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//driver.get("https://priceline.com");
        //System.out.println(driver.findElement(By.cssSelector("[for='add-a-flight-checkbox']")).getSize());
       // System.out.println(driver.findElement(By.tagName("a")).getSize());
driver.findElement(By.xpath("//button[@aria-haspopup='dialog' and @aria-labelledby='stuff']")).click();
WebElement adult= driver.findElement(By.xpath("//button[@aria-label='Substract one Adult']"));

for(int i=1; i<5; i++) {
    adult.click();
}
        System.out.println(adult.getText());
driver.findElement(By.xpath("(//p[contains(@class,'app-components-PassengerSelector')])[2]")).click();



    }
}
