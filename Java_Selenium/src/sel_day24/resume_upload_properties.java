package sel_day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class resume_upload_properties {
    public static void main(String[] args) throws IOException, InterruptedException {

        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\aksha\\eclipse-workspace\\Java_Selenium\\src\\sel_day24\\config.properties");
        props.load(fis);

        String email = props.getProperty("naukri.email");
        String password = props.getProperty("naukri.password");
        String resumePath = props.getProperty("resume.path");
        String chromeDriverPath = props.getProperty("chromedriver.path");

        //System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.naukri.com/nlogin/login");
        Thread.sleep(3000);

        driver.findElement(By.id("usernameField")).sendKeys(email);
        driver.findElement(By.id("passwordField")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("attachCV")).sendKeys(resumePath);
        System.out.println("✅ Resume uploaded successfully!");

        Thread.sleep(3000);
        driver.quit();
    }
}
