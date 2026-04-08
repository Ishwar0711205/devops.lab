import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void validLoginTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost:3000/login");

        driver.findElement(By.id("username")).sendKeys("ishwar1");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.css("button[type='submit']")).click();

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("listings") || pageSource.contains("Explore"));

        driver.quit();
    }
}
