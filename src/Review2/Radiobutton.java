package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Radiobutton {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        // find an element
        List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@name='ageGroup']"));
//traverse throught the list of webelements
        for (WebElement radiolist:radiobuttons){
            //find the desired value
           String value=radiolist.getAttribute("value");
           if(value.equalsIgnoreCase("5 - 15")){
               // click on
               radiolist.click();
           }


        }

    }
}