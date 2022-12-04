package Class10;
import org.openqa.selenium.By;import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.Select;import java.util.List;import java.util.concurrent.TimeUnit;
public class DropCalendar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement user = driver.findElement(By.id("txtUsername"));
        user.sendKeys(PROPERTY.getKey("userName"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys(PROPERTY.getKey("password"));
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
        WebElement calandar = driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']"));
        calandar.click();
        WebElement selbutton = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(selbutton);
        select.selectByVisibleText("Apr");
        WebElement yearbtn = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1 = new Select(yearbtn);
        select1.selectByValue("2023");
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'][1]/tbody/tr/td"));
        for (WebElement date : dates) {
            String currentdate = date.getText();
            if (currentdate.equalsIgnoreCase("25")) {
                date.click();
            }
        }
        WebElement secondcal = driver.findElement(By.xpath("(//img[@class='ui-datepicker-trigger'])[2]"));
        secondcal.click();
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select2 = new Select(month);
        select2.selectByVisibleText("Jun");
        WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select3 = new Select(year);
        select3.selectByValue("2023");
        List<WebElement> dates2 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar'][1]/tbody/tr/td"));
        for (WebElement element : dates2) {
            String futuredate = element.getText();
            if (futuredate.equalsIgnoreCase("18")) {
                element.click();
            }

        }
    }
}