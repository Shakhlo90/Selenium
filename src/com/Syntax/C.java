package com.Syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //use required website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

driver.manage().window().maximize();
driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
driver.findElement(By.name("ctl00$MainContent$login_button")).click();
// title
        //Web Orders//
        String title=driver.getTitle();
        //System.out.println(title);
    if(title.equalsIgnoreCase("Web Orders")) {
        System.out.println("title is correct " + title);
    }
    else {
        System.out.println("not true");
    }
    }



    }


