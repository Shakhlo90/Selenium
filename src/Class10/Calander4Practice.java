package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calander4Practice {
    public static void main(String[] args) {
        ////b[text()='Recruitment']
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("http://www.delta.com");
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();
        WebElement month=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        WebElement nextbtn= driver.findElement(By.xpath("//span[text()='Next']"));
        boolean isFound=false;
        while (!isFound) {
            String nextmonth = month.getText();
            if (nextmonth.equalsIgnoreCase("January")) {
                List<WebElement> dates = driver.findElements(By.xpath("(//table[@class='dl-datepicker-calendar'])[1]/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentDate = date.getText();
                    if (currentDate.equalsIgnoreCase("23")) {
                        date.click();
                        break;
                    }

                }
                isFound = true;
            }
            else {
nextbtn.click();
            }
        }



        }

    }
