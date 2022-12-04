package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFramePractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.switchTo().frame("frame2");
        WebElement name = driver.findElement(By.xpath("//b[text()='Animals :']"));
        String title = name.getText();
        System.out.println(title);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textbox = driver.findElement(By.xpath("//input"));
        textbox.sendKeys("Friend");
        driver.switchTo().frame("frame3");
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement dropdowns = driver.findElement(By.xpath("//select[@class='col-lg-3']"));
        Select select = new Select(dropdowns);
        select.selectByValue("babycat");
        driver.switchTo().defaultContent();
        WebElement frame1 = driver.findElement(By.name("iamframe"));
        driver.switchTo().frame(frame1);
        textbox.clear();
        textbox.sendKeys("DONE");

    }
}
