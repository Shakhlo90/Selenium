package com.Syntax;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SeliniumClass02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("tukhtaevashahlo@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Samarbek85")
;
        driver.findElement(By.name("login")).click();
    //driver.findElement(By.linkText("Forgot password?")).click();
    driver.findElement(By.partialLinkText("Forgot"));
    //driver.findElement(By.id("identify_email")).sendKeys("tukhtaevashahlo@gmail.com");
//driver.findElement(By.name("did_submit")).click();



    }}
