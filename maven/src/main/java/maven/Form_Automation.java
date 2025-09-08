package maven;

//import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form_Automation {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.findElement(By.id("firstName")).sendKeys("Abdul");
		driver.findElement(By.id("lastName")).sendKeys("Masood");
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("abcd123@gmail.com");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("(//input[@id='userNumber'])[1]")).sendKeys("1234567898");
		Thread.sleep(1000);
		
		WebElement sub = driver.findElement(By.id("subjectsInput"));
		sub.sendKeys("English");
		sub.sendKeys(Keys.DOWN, Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[7]/div[2]/div[3]/label")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\aksha\\Downloads\\wallpaper\\h9.jpg");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("123, andheri gali, ujala gaon");
		
		WebElement state = driver.findElement(By.id("react-select-3-input"));
		state.sendKeys("Haryana");
		state.sendKeys(Keys.DOWN, Keys.ENTER);
		
		WebElement city = driver.findElement(By.id("react-select-4-input"));
		city.sendKeys("Karnal");
		city.sendKeys(Keys.DOWN, Keys.ENTER);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
	

	}

}
