package sel_day25;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class home_decor_consult_form {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://360homedecor.uk/design-consultation");
		Thread.sleep(3000);

		WebElement dropdown = driver.findElement(By.tagName("select"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(dropdown).perform();
		Select select = new Select(dropdown);
		select.selectByIndex(0);
		Thread.sleep(1000);

		WebElement f_name = driver.findElement(By.id("firstName"));
		f_name.sendKeys("Akshay");
		Thread.sleep(1000);

		WebElement l_name = driver.findElement(By.id("lastName"));
		l_name.sendKeys("Suhag");
		Thread.sleep(1000);

		WebElement town = driver.findElement(By.id("city"));
		town.sendKeys("Jhajjar");
		Thread.sleep(1000);

		WebElement phone = driver.findElement(By.id("phoneNumber"));
		phone.sendKeys("8572868548");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("akshaysuhag2001@gmail.com");
		Thread.sleep(1000);

		File resume = new File("C:\\Users\\aksha\\Downloads\\Feedback form.pdf");
		WebElement uploadInput = driver.findElement(By.id("layoutFiles"));
		uploadInput.sendKeys(resume.getAbsolutePath());

		WebElement book = driver
				.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[3]/div[2]/form/button"));
		book.click();
		Thread.sleep(5000);

		System.out.println("Done");

	}

}
