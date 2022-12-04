package Review3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// goto gmail page
        driver.get("https://www.google.com/");
        WebElement element=driver.findElement(By.xpath("//a[@class='gb_2 gb_3 gb_9d gb_9c']"));
        element.click();
        String mainpage=driver.getWindowHandle();
        System.out.println(mainpage);
        WebElement helpntn=driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement privacyntn=driver.findElement(By.xpath("//a[text()='Help']"));
   helpntn.click();
   privacyntn.click();
        Set<String>helppage=driver.getWindowHandles();
        for (String help:helppage){
            driver.switchTo().window(help);
            String text=driver.getTitle();
            System.out.println(text);
            if(text.equalsIgnoreCase("Google Account Help")){

                break;


            }
        }
WebElement combtn=driver.findElement(By.xpath("//a[text()='Community']"));
        combtn.click();

    }
}
