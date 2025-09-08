package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Patient_Registartion {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://o2.openmrs.org/openmrs/login.htm");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Registration Desk")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[1]/input")).sendKeys("Shaik");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[1]/div/fieldset[1]/div[1]/p[3]/input")).sendKeys("Abdul");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("//option[@value='M']")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("//input[@id='birthdateDay-field']")).sendKeys("12");
		driver.findElement(By.xpath("//select[@id='birthdateMonth-field']")).sendKeys("February");
		driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("2002");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[2]/input")).sendKeys("ABCD");
		driver.findElement(By.xpath("/html/body/div/div[3]/form/section[2]/div/fieldset[1]/p[4]/input")).sendKeys("XYZ");
		//driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("2002");
		//driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("2002");
		//driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("2002");
		//driver.findElement(By.xpath("//input[@id='birthdateYear-field']")).sendKeys("2002");

	}

}
