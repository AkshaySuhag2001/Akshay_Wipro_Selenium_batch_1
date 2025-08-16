package sel_day23;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class edge_newTab {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\aksha\\Downloads\\selenium drivers\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		System.out.println("Browser: " + caps.getBrowserName());
		System.out.println("Version: " + caps.getBrowserVersion());

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
