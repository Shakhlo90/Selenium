package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
//find web  element
  WebElement dropdown= driver.findElement(By.id("select-demo"));
// use select class
        Select select= new Select(dropdown);
// sellections sellect an option by index
        Thread.sleep(3000);
        select.selectByIndex(5);
   // select by visible text
   select.selectByVisibleText("Monday");
   // select by value
select.selectByValue("Tuesday");
//get all option avalible in dropdown
List<WebElement>options= select.getOptions();
for(int i=0; i<options.size();i++){
 WebElement option=  options.get(i);
 String text=option.getText();

    System.out.println(text);
    if(text.equalsIgnoreCase("Friday")){
        select.selectByIndex(i);
    }
}



    }
}