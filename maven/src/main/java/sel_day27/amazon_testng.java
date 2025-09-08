package sel_day27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class amazon_testng {

	WebDriver driver;

	@BeforeClass
	public void Setup() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void Amazon_site() {

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

	}

	@Test(priority = 0)
	public void Amazon_login() throws InterruptedException, IOException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("data.properties");
		props.load(fis);

		String number = props.getProperty("amazon.email");
		String password = props.getProperty("amazon.password");

		driver.findElement(By.id("ap_email")).sendKeys(number);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(1000);

	}

	@Test(priority = 1)
	public void Amazon_pro_search() throws InterruptedException {
		List<String> products = new ArrayList<>();
		products.add("Exo Dishwash Bar");
		products.add("Soap");
		products.add("Tooth paste");

		for (String prod : products) {

			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.clear();
			searchBox.sendKeys(prod);
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(3000);

			WebElement addToCartBtn = driver.findElement(By.cssSelector("#a-autoid-3-announce"));
			addToCartBtn.click();
			Thread.sleep(3000);
		}
		driver.findElement(
				By.xpath("/html/body/div[1]/header/div[1]/div[8]/div[1]/div/div/div[2]/div/div[2]/span/span/a"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/div[4]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span[1]/span/span/input"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/form/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/span/div/label/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/div/div[1]/form/div/div/div/div[2]/div[6]/div/div/div/div/div[1]/div/label/input"))
				.click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("/html/body/div[5]/div[1]/div/div/div[2]/div/div[9]/div[2]/div[2]/div/span/span/span/input"))
				.click();
		Thread.sleep(1000);

		driver.findElement(By.id("placeOrder")).click();

	}
}