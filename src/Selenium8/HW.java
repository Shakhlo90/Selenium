package Selenium8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HW {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        WebElement removebutton=driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removebutton.click();
        //after define explisite way
        WebDriverWait wait=new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement text=driver.findElement(By.xpath("//p[@id='message']"));
        String textveryfy=text.getText();
        System.out.println(textveryfy);
        WebElement enablebutton=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enablebutton.click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
WebElement enabletext=driver.findElement(By.xpath("//p[@id='message']"));
String checkin=enabletext.getText();
        System.out.println(checkin);
        WebElement senttext=driver.findElement(By.xpath("//input[@type='text']"));
        senttext.sendKeys("It is enable");
        WebElement disbtn=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        disbtn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()=\"It's disabled!\"]")));
        WebElement distext=driver.findElement(By.xpath("//p[text()=\"It's disabled!\"]"));
    String getdistext=driver.getTitle();
        System.out.println(getdistext);


    }
}
