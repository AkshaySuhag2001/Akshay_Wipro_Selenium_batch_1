package sel_day23;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class newTab {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aksha\\Downloads\\selenium drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();
		System.out.println("Browser: " + options.getBrowserName());
		//System.out.println("Version: " + options.getBrowserVersion());
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println("Browser: " + caps.getBrowserName());
		System.out.println("Version: " + caps.getBrowserVersion());
		System.out.println("Version: " + caps.getPlatformName());

		

		driver.get("https://www.google.com");
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);

		driver.quit();
	}
}
