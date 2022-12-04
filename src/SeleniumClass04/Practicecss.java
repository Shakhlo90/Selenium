package SeleniumClass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicecss {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            Thread.sleep(2500);
            driver.manage().window().maximize();
            driver.get("https://www.salesforce.com/login");

        //driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Hello");
      // driver.findElement(By.cssSelector(" input[id='password']")).sendKeys("pass234");
        //System.out.println(driver.getTitle());
driver.findElement(By.xpath("//div{@id =username_container']/div/div/input")).sendKeys("Hello");
      // driver.findElement(By.cssSelector("input[type='submit']")).click();
       // System.out.println(driver.getTitle());
    }
}
