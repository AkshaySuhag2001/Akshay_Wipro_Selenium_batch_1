package sel_day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login {
    public static void main(String[] args) throws IOException, InterruptedException {

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(
                "config.propertes");
        props.load(fis);

        String email = props.getProperty("f.email");
        String password = props.getProperty("f.pwd");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://en-gb.facebook.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);

        driver.findElement(By.id("pass")).sendKeys(password);

        driver.findElement(By.name("login")).click();

        Thread.sleep(100000);
        driver.quit();
    }
}
