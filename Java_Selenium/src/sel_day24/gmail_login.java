package sel_day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_login {
	public static void main(String[] args) throws IOException, InterruptedException {

		// Load properties file
		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("config.propertes");
		props.load(fis);

		String email = props.getProperty("gmail.email");
		String password = props.getProperty("gmail.password");
		String chromeDriverPath = props.getProperty("chromedriver.path");

		// Set ChromeDriver path
		//System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		// Launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Navigate to Gmail login page
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);

		// Enter Email
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);

		// Enter Password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(5000); // wait to see result
		driver.quit();
	}
}
