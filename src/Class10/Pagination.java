package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Pagination {
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
        WebElement user = driver.findElement(By.id("txtUsername"));
        user.sendKeys(PROPERTY.getKey("userName"));

        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(PROPERTY.getKey("password"));
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        boolean idFound = false;
        while (!idFound) {
            List<WebElement> id = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
            for (int i = 0; i < id.size(); i++) {
                String idtext = id.get(i).getText();
                if (idtext.equalsIgnoreCase("45157A")) {
                    System.out.println(i+1);
                    WebElement checkbox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkbox.click();
                    idFound = true;
                    break;
                }
            }


            if (!idFound) {
                driver.findElement(By.xpath("(//a[text()='Next'])[1]")).click();
            }
        }
    }
}





