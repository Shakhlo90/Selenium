package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
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
//check box that contains "screen saver as a product"
List<WebElement>secondcolunn= driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        for (int i = 0; i < secondcolunn.size(); i++) {
            String columntext=secondcolunn.get(i).getText();
if (columntext.equalsIgnoreCase("ScreenSaver")){
  // print out number of the column/row
    System.out.println(i+1);

    // get check box and click it
   // driver.findElement(By.name("ctl00$MainContent$orderGrid$ctl02$OrderSelector")).click();
    //table[@class='SampleTable']/tbody/tr[2]/td[1]
   WebElement checkbox= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+(i+2)+"]/td[1]"));
 checkbox.click();
}
        }





    }
}