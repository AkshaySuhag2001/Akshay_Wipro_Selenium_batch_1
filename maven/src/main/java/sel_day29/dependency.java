package sel_day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class dependency {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void HealthSetup()
	{
		driver.get("https://o2.openmrs.org/openmrs/login");	
	}	
	@Test(dependsOnMethods= {"HealthSetup"})
	public void Login()
	{
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	
	
 
}
 