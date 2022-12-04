import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWSiliniumClass2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        Thread.sleep(2500);
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.name("customer.firstName")).sendKeys("Shakhlo");
        driver.findElement(By.id("customer.firstName")).sendKeys("Tukhtaeva");
        driver.findElement(By.className("input")).sendKeys("Bustleton");
        driver.findElement(By.id("customer.address.city")).sendKeys("Philadelphia");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("19116");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("456788990");
        driver.findElement(By.id("customer.ssn")).sendKeys("567899");
        driver.findElement(By.id("customer.username")).sendKeys("shakhlo90");
        driver.findElement(By.id("customer.password")).sendKeys("hello90");
        driver.findElement(By.id("repeatedPassword")).sendKeys("hello90");
        driver.findElement(By.className("button")).click();
        driver.close();

    }
}
