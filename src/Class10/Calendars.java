package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendars {
    public static void main(String[] args) {

        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
//http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login

        WebElement user = driver.findElement(By.id("txtUsername"));
        user.sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        Boolean idFound = false;
        while (!idFound) {
            List<WebElement> columnid = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < columnid.size(); i++) {
                //extract id from entry list
                String idtext = columnid.get(i).getText();
                if (idtext.equalsIgnoreCase("41035A")) {
                    // check the checkbox
                    System.out.println(i + 1);
                    WebElement chekbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    idFound = true;
                    chekbox.click();
                    break;
                }
            }

            if (!idFound) {
                WebElement nextpage = driver.findElement(By.xpath("//a[text()='Next']"));
                nextpage.click();

            }
            if (!idFound) {
                WebElement nextpage = driver.findElement(By.xpath("//a[text()='Next']"));
                nextpage.click();
            }
        }
    }
}