package SeliniumClass05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DropDownPractice {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
            driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
    }
}
