package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        // find find elements contains six elements
        List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@name='color']"));
        //traverse throuhg the list of elements
for (WebElement checks: checkboxes){
    String value=checks.getAttribute("value");
    if(value.equalsIgnoreCase("yellow")){
        checks.click();
    }
    else if(value.equalsIgnoreCase("blue")){
        checks.click();
        break;
    }
}


    }
}