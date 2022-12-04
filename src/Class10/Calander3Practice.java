package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calander3Practice {
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
        WebElement calanderbtn=driver.findElement(By.xpath("//span[@class='calenderDepartSpan']"));
        calanderbtn.click();
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        WebElement nextbtn=driver.findElement(By.xpath("(//span[@class='monthSelector'])[2]"));
        boolean isFound=false;
        while (!isFound){
            String currentmonth=month.getText();
            if (currentmonth.equalsIgnoreCase("May")){
                List<WebElement>dates=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar'][1]/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentdate=date.getText();
                    if(currentdate.equalsIgnoreCase("15")){
                        date.click();
                        break;
                    }

                    }
isFound=true;

                }
            else {
                nextbtn.click();
            }
            }
        }

    }

