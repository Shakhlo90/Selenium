package SeliniumClass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement button = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
        button.click();
        WebElement firstname = driver.findElement(By.cssSelector("input[placeholder='First name']"));
        WebElement lastname = driver.findElement(By.cssSelector("input[name='lastname']"));
        WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
        WebElement password = driver.findElement(By.cssSelector("input[id='password_step_input']"));
        WebElement conf = driver.findElement(By.cssSelector("input[name*='email_confirmation']"));

        firstname.sendKeys("Milana");
        lastname.sendKeys("Hamilton");
        email.sendKeys("Hamilton@gmail.com");
        conf.sendKeys("Hamilton@gmail.com");
        password.sendKeys("password123");

        WebElement dropdown = driver.findElement(By.cssSelector("select[id='month']"));
        Select select = new Select(dropdown);
        select.selectByValue("8");
        List<WebElement>test=select.getOptions();
        for(int i=0; i<test.size();i++){

  String str= test.get(i).getText();
            System.out.println(
                    str
            );}

        WebElement dayelement = driver.findElement(By.cssSelector("select[name='birthday_day']"));
        Select daysel = new Select(dayelement);
        daysel.selectByValue("18");

    List   < WebElement> dayelements =daysel.getOptions();
    for (int i=0; i<dayelements.size();i++){
        String textdate=dayelements.get(i).getText()
;

        System.out.println(textdate);

    }



        WebElement yearelement = driver.findElement(By.cssSelector("select[name='birthday_year']"));
        Select yearsel = new Select(yearelement);
        yearsel.selectByValue("1990");
        List<WebElement>year=yearsel.getOptions();
        for (int i=0; i<year.size();i++)
        {
            String years=year.get(i).getText();
            System.out.println(years);
        }
        WebElement gender = driver.findElement(By.cssSelector("input[class='_8esa']"));
        gender.submit();
        WebElement exitbutton= driver.findElement(By.xpath("//img[@class='_8idr img']"));
        exitbutton.submit();

    }
}