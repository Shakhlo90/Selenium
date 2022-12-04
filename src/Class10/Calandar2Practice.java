package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calandar2Practice {
    public static void main(String[] args) {
        ////b[text()='Recruitment']
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://www.delta.com");
        WebElement calbnt=driver.findElement(By.xpath("//span[@class='calenderDepartSpan']"));
        calbnt.click();
       WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
       WebElement nextbtn=driver.findElement(By.xpath("(//span[@class='monthSelector'])[2]"));
       boolean isfound=false;
       while(!isfound){
           String monthname=month.getText();
         if(monthname.equalsIgnoreCase("April")){
             List<WebElement> dates=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar'][1]/tbody/tr/td"));
             for (WebElement date : dates) {
                 String currentday=date.getText();
                 if ((currentday.equalsIgnoreCase("25"))){
                     date.click();
                     break;
                 }

             }
             isfound=true;
         }
         else {
             nextbtn.click();
         }

           }

       }
    }
