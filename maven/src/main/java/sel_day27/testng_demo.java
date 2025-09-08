package sel_day27;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
 
public class testng_demo
{
WebDriver driver;
@BeforeClass
public void setup()
{
	System.out.println("Launching browser.....");
	driver=new ChromeDriver();
}
	@Test
	public void testgoogleTitile()
	{
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("Page Title is : " + title);
	}
	@AfterClass
	public void tearDown()
	{
		System.out.println("Closing browser.....");
		driver.quit();
	}
 
}