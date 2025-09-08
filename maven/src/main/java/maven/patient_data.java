package maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class patient_data {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fortishealthcare.com/doctors/dr-amit-haldar-1906");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[3]/div/div[3]/div/div[2]/div/div[2]/div[1]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[3]/div/div[3]/div/div[2]/div/div[2]/div[2]/div/div/div/div[2]/div")).click();
		driver.findElement(By.xpath("//div[@class='slot-booking-title']//button[@class='btn-lg link'][normalize-space()='Book Appointment']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter mobile no.']")).sendKeys("8572868548");
		driver.findElement(By.xpath("//button[normalize-space()='Get OTP']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[1]/main/div/div[3]/div/div[3]/div/div[2]/div/div[5]/div/div/button")).click();
		

	}

}
