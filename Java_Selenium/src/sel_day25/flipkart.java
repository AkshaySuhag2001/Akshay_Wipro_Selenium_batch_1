package sel_day25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws IOException, InterruptedException {

		Properties props = new Properties();
		FileInputStream fis = new FileInputStream("config.propertes");
		props.load(fis);

		String phone = props.getProperty("f.phone");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        
        WebElement loginBtn = driver.findElement(By.linkText("Login"));
        loginBtn.click();
        Thread.sleep(2000);

        WebElement phoneField = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[1]/input"));
        phoneField.sendKeys(phone);
        Thread.sleep(1000);
        WebElement otp = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/form/div[3]/button"));
        otp.click();
        Thread.sleep(10000);
        
        WebElement verify = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/div[2]/div/div/form/button"));
        verify.click();
        Thread.sleep(5000);

		List<String> products = new ArrayList<>();
		products.add("laptop");
		products.add("headphones");
		products.add("wireless mouse");

		for (String prod : products) {

			 // Find search box and search for product
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.clear();
            searchBox.sendKeys(prod);
            
            // Click search button
            WebElement searchBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/button"));
            searchBtn.click();
            Thread.sleep(3000);

            // Click on first product
            WebElement firstProduct = driver.findElement(By.cssSelector("div[data-id] a[class*='IRpwTa']"));
            firstProduct.click();
            Thread.sleep(3000);

            // Add to Cart
            WebElement addToCartBtn = driver.findElement(By.cssSelector("button[class*='_2KpZ6l _2U9uOA _3v1-ww']"));
            addToCartBtn.click();
            Thread.sleep(3000);

            // Go back to home page for next search
            driver.get("https://www.flipkart.com/");
            Thread.sleep(2000);
		}
	}
}
