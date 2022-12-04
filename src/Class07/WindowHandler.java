package Class07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandler {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
// goto gmail page
    driver.get("http://accounts.google.com/signup");
String gmailhandler=driver.getWindowHandle();
    // print
        System.out.println(gmailhandler);
//Set<String> windows=driver.getWindowHandles();
  //      System.out.println(windows);


    }}