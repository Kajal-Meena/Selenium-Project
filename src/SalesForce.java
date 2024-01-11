import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class salesForce {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
  //      driver.get("https://www.salesforce.com/in/?ir=1");
        driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      //  driver.findElement(By.id("signup_link")).click();
     //   driver.findElement(By.linkText("Try for Free")).click();
       driver.findElement(By.partialLinkText("Try")).click();
        driver.findElement(By.name("UserFirstName")).sendKeys("john");
        driver.findElement(By.name("UserEmail")).sendKeys("john@CCCS.com");
        Select job = new Select(driver.findElement(By.name("UserTitle")));
        job.selectByVisibleText("IT Manager");
        Select country = new Select(driver.findElement(By.name("CompanyCountry")));
        country.selectByVisibleText("Maldives");
        Select emp = new Select(driver.findElement(By.name("CompanyEmployees")));
        emp.selectByVisibleText("101 - 200 employees");
        driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
        driver.findElement(By.name("start my free trial")).click();
    }
}
//ElementClickInterceptedException --->
//Indicates that a click could not be properly executed because the target
//element was obscured in some way.