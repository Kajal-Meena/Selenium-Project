import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SignUp {
    public static void main(String[] args) {
        //throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        //   WebDriverWait exp_wait = new WebDriverWait(Duration.ofSeconds(5));
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
        //    Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Scott");
        driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys("4786822");
        driver.findElement(By.name("reg_passwd__")).sendKeys("gxhs");
        Select date = new Select(driver.findElement(By.id("day")));
        date.selectByVisibleText("13");
        //  driver.findElement(By.xpath("//select[@name=\"birthday_day\"]/option[13]")).click();
        Select mon = new Select(driver.findElement(By.id("month")));
        mon.selectByVisibleText("Aug");
        //     driver.findElement(By.xpath("//select[@name=\"birthday_month\"]/option[8]")).click();
        Select yy = new Select(driver.findElement(By.id("year")));
        yy.selectByVisibleText("1998");
        //  driver.findElement(By.xpath("//select[@name=\"birthday_year\"]/option[text()=\"1998\"]")).click();
      driver.findElement(By.xpath("//input[@value='-1']")).click();
        //   driver.findElement(By.xpath(""));

    }
}

