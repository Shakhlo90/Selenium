package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeLinks {
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.MINUTES);
            driver.get("http://www.ebay.com");
            // get all links
      List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        //imlementing a for loop to traverse through the list of WebElements
        for (int i=0; i<links.size(); i++){
            //extracting the value of attribute href because it contains the link embeded in the WebElement
          String listlinks=  links.get(i).getAttribute("href");
            // print all links
            System.out.println(listlinks);

        }



    }
}
