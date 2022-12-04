import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Class05selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");
//driver.findElement(By.cssSelector("input[placeholder*='enter your'")).sendKeys("Hello everyone");
        WebElement element=driver.findElement(By.cssSelector("input[placeholder*='enter your'"));
        element.sendKeys("Hellooooooo");
   WebElement clickelement=    driver.findElement(By.xpath("//button[contains(text(),'Show Message')]"));
   clickelement.click();
driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
//to get male radio button element
      WebElement malebutton = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
//to check maleradio button enable or not
boolean radioresult= malebutton.isEnabled();

        System.out.println(radioresult);
        //to check male radio button displayed
boolean display=malebutton.isDisplayed();

        System.out.println(display);
// to check radio button is selected

boolean select=malebutton.isSelected();
        System.out.println(select);
if(!radioresult){
    malebutton.click();
}
 select=malebutton.isSelected();
        System.out.println("button status "+select);




    }
}
