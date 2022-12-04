package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlerAdvance {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// goto gmail page
         driver.get("http://accounts.google.com/signup");
String parent=driver.getWindowHandle();
String parenttitle=driver.getTitle();
        System.out.println(parenttitle);
        driver.switchTo().window(parent);
        WebElement checkbox=driver.findElement(By.cssSelector("//input[@class='VfPpkd-muHVFf-bMcfAe']"));
        checkbox.click();

        WebElement helpbutton=driver.findElement(By.xpath("//a[text()='Help']"));
helpbutton.click();
WebElement privacybutton= driver.findElement(By.xpath("//a[text()='Privacy']"));
privacybutton.click();

// title of my disered page  Google Account Help
// get all window handlers
        Set<String>allhandlers=driver.getWindowHandles();
for(String handle:allhandlers){
    // switching
   driver.switchTo().window(handle);
   // get title
    String title=driver.getTitle();
    //compare
    if(title.equalsIgnoreCase(" Google Account Help")){
        System.out.println("the current page is"+title);
        WebElement combtn=driver.findElement(By.xpath("//a[text()='Community']"));
        combtn.click();
    }
}



//find the community button and click it





    }
}