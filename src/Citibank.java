import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class Citibank {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
        driver.findElement((By.xpath("//a[text()='select your product type']"))).click();
        driver.findElement(By.xpath("//a[text()='Credit Card']")).click();
        driver.findElement(By.id("citiCard1")).sendKeys("4545");
        driver.findElement(By.id("citiCard2")).sendKeys("5656");
        driver.findElement(By.id("citiCard3")).sendKeys("8887");
        driver.findElement(By.id("citiCard4")).sendKeys("9998");
        driver.findElement(By.id("cvvnumber")).sendKeys("426");
        driver.findElement(By.name("DOB")).click();
        Select year = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year.selectByVisibleText("2022");
        Select mon = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        mon.selectByVisibleText("Apr");
        driver.findElement(By.linkText("14"));
        driver.findElement(By.id("bill-date-long")).sendKeys("14/04/2022");
        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
        driver.findElement(By.id("agree")).click();
    }

        
}
