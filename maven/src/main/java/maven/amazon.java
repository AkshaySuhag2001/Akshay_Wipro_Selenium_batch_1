package maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class amazon {
	public static void main(String[] args) throws IOException, InterruptedException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		props.load(fis);

		String email = props.getProperty("amazon.email");
		String password = props.getProperty("amazon.password");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);

		driver.findElement(By.id("ap_email")).sendKeys(email);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);

		List<String> products = new ArrayList<>();
		products.add("laptop");
		products.add("headphones");
		products.add("wireless mouse");

		for (String prod : products) {

			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys(prod);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);

			/*WebElement firstProduct = driver.findElement(By.id("nav-search-submit-button"));
			firstProduct.click();
			Thread.sleep(3000);*/

			WebElement addToCartBtn = driver.findElement(By.cssSelector("#a-autoid-3-announce"));
			addToCartBtn.click();
			Thread.sleep(3000);

			/*
			 * WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			 * searchBox.sendKeys(product);
			 * driver.findElement(By.id("nav-search-submit-button")).click();
			 * Thread.sleep(3000);
			 * 
			 * WebElement firstProduct = driver.findElement(By.xpath(
			 * "/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2"
			 * )); firstProduct.click(); Thread.sleep(3000);
			 * 
			 * WebElement addToCartBtn = driver.findElement(By.xpath(
			 * "/html/body/div[2]/div/div/div[5]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[39]/div[1]/span/span/span/input"
			 * )); addToCartBtn.click();
			 * 
			 * System.out.println("✅ Product added to cart!");
			 */

		}
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div[8]/div[1]/div/div/div[2]/div/div[2]/span/span/a")).click();
        Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[4]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span[1]/span/span/input")).click();
        Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/form/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/span/div/label/input")).click();
		
	}
}
