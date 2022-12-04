import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //use required website
        driver.get("https://syntaxprojects.com/");
        Thread.sleep(2000);


        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[contains(@id,'btn')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@class, 'list')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@class,'list']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
//driver.close();


    }
}