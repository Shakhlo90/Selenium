import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver;
                  driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://www.facebook.com");




            WebElement usernameField = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
            usernameField.sendKeys("tukhtaevashahlo@gmail.com");

            WebElement passwordField = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
            passwordField.sendKeys("Ulugbek2019");

         WebElement loginButton = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
            loginButton.click();


            WebElement profile = driver.findElement(By.xpath("//span[text()='Shahlo Tukhtaeva']"));
            String text=profile.getText();
        System.out.println(text);
        Assert.assertEquals(text,"Shahlo Tukhtaeva");
        boolean displayed=profile.isDisplayed();
            if (profile.isDisplayed()) {
                System.out.println("Test case is passed");
            } else {
                System.out.println("Test is failed");
            }
        }

    }


