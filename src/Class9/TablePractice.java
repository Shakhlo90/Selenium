package Class9;

import Selenium8.HRC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePractice {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.name("ctl00$MainContent$login_button")).click();

        List<WebElement>colm=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        for (int j=0;j<colm.size();j++) {

           String text=colm.get(j).getText();
            System.out.println(text);
           if (text.equalsIgnoreCase("FamilyAlbum")){
        WebElement checkbox=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+ (j+2)+"]/td[1]"));
           checkbox.click();


           }
        }


    }
}
