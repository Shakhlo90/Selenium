package Class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
// goto gmail page
            driver.get("http://accounts.google.com/signup");
        String handle=driver.getWindowHandle();
        System.out.println(handle);
        driver.get("http://www.facebook.com");
        String handle1=driver.getWindowHandle();
        System.out.println(handle);
driver.switchTo().window(handle);



    }

}
