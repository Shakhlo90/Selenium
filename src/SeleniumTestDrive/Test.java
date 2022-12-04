package SeleniumTestDrive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(driver.getCurrentUrl());
        System.out.println(title);
        driver.navigate().to("https://facebook.com");
        String t=driver.getTitle();
        System.out.println(t);

    }
}
