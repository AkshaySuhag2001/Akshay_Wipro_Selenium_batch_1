package sel_day27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class facebook_post {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void IxigoSite() {
        driver.get("https://www.facebook.com/");
    }

    @Test(priority = 0)
    public void LoginDemo() throws InterruptedException, IOException {
    	Properties props = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		props.load(fis);

		String number = props.getProperty("fb.email");
		String password = props.getProperty("fb.password");

		driver.findElement(By.id("email")).sendKeys(number);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("(//button[normalize-space()='Log in'])[1]")).click();
		Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void Post() throws InterruptedException {
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/span")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/p")).sendKeys("");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div/div/div[1]/div/div[2]/div/div/div/form/div/div[1]/div/div/div/div[3]/div[2]/div/div/div/div[1]/div/span/span")).click();
    }
}
