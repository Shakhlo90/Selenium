package SeleniumClass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Class3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://syntaxprojects.com/");



        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[starts-with(@class,'form')]")).sendKeys("Selenium");
        Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
//driver.close();



    }
}
/*driver.get("https://syntaxprojects.com/%22);



        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[starts-with(@class,'form')]")).sendKeys("Selenium");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
        //driver.close();

        }

        }*/