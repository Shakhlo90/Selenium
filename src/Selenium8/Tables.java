package Selenium8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tables {
    public static void main(String[] args) {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        // print whole table of the consel
        WebElement alltable=driver.findElement(By.xpath("//table[@id='customers']"));
String textalltabe=alltable.getText();
        System.out.println(textalltabe);
  List<WebElement>rows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : rows) {
            String text=row.getText();
         //   System.out.println(text);
         //   System.out.println("-----------------------------------------");
            // modify task find only
            if (text.contains("Google")){
            System.out.println("----------------------------------------------------");
            System.out.println(text);
        }
    }
        // print all individual columns
        System.out.println("----------------------------------------------");
        List<WebElement>colums=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement colum : colums) {
            String columtext=colum.getText();
            System.out.println(columtext);
            System.out.println("--------------------------------------------------");
        }
}}