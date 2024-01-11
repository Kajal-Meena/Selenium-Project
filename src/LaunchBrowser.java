
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");
        String a = driver.getTitle();
        String b = driver.getPageSource();
        driver.quit();
        System.out.println("Title of page " + a);
        System.out.println("page source " + b);
    }
}
