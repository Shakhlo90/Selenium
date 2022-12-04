package Review2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDowns {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
        driver.get("https://www.amazon.com");

        // select class aproach
        //find the element that contains  the select Task
        // use Select class Select sel= new Select class(pass parameter WebElement)

       // find Web element
      List<WebElement> drops=driver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
       // Select select= new Select(drops);
       // select.selectByValue("25");
       // select.selectByVisibleText("Alexa Skills");
//String options= select.getOptions().toString();
for(int i=0; i<drops.size(); i++){
String lists=  drops.get(i).getText();
    System.out.println(lists);
}

}
    }

