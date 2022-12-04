package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarPractice {
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
        //Click on the calandar
        WebElement calanderclick = driver.findElement(By.xpath("//span[text()='Depart']"));
        calanderclick.click();
        // get month
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        boolean isFound = false;
        while (!isFound) {
            String monthname = month.getText();
            if (monthname.equalsIgnoreCase("March")) {
                List<WebElement> dates = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar'][1]/tbody/tr/td"));
                for (WebElement date : dates) {
                    String currentdate = date.getText();
                    if (currentdate.equalsIgnoreCase("15")) {
                        date.click();
                        break;
                    }

                }
                isFound = true;

            } else {
                driver.findElement(By.xpath("(//span[@class='monthSelector'])[2]")).click();
            }
        }
    }

}