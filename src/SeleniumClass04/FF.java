package SeleniumClass04;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

class FF{
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
            WebDriver driver= new ChromeDriver();
            driver.get("https://syntaxprojects.com");



                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

            driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();

            driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();

            driver.findElement(By.xpath("//a[starts-with(@class,'list']")).click();

            driver.findElement(By.xpath("//input[starts-with(@class,'form')]")).sendKeys("Selenium");

            driver.findElement(By.xpath("//button[contains(text(),'Show')]")).click();
//driver.close();



        }
    }

