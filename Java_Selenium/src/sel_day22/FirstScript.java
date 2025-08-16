package sel_day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstScript {
	public static void main(String[] args) {
		try {
		// Start the session
		WebDriver driver = new ChromeDriver();
		// Navigate the browser
		driver.get("https://www.atlassian.com/software/jira");

		driver.getTitle();

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		WebElement textBox = driver.findElement(By.id("wac-root"));
		//WebElement submitButton = driver.findElement(By.cssSelector("button"));

		System.out.println("Font size: "+textBox.getCssValue("font-size") + "\nText: "+textBox.getText());
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
        //assertEquals(text, "Testing Inputs");
		//WebElement textBox2 = driver.findElement(By.id("wac-root").getName());

		//textBox.sendKeys("Selenium");
		//submitButton.click();
		
			Thread.sleep(100000);
			
			//WebElement message = driver.findElement(By.id("message"));
	        //message.getText();
	        
	        driver.quit();
	        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        
        

	}

}
