import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class nasscom {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://nasscom.in/");
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//ul[@class='d-flex flex-wrap justify-content-center']/li[2]")).click();
        driver.findElement(By.id("edit-field-fname-reg-0-value")).sendKeys("admin");
        driver.findElement(By.id("edit-field-lname-0-value")).sendKeys("pass");
        driver.findElement(By.id("edit-mail")).sendKeys("admin1@gmail.com");
        driver.findElement(By.id("edit-field-company-name-registration-0-value")).sendKeys("Google");
        driver.findElement(By.id("edit-field-business-focus-reg")).click();
        Select business = new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
        business.selectByVisibleText("IT Consulting");
        driver.findElement(By.id("edit-submit--2")).click();

    }
}
