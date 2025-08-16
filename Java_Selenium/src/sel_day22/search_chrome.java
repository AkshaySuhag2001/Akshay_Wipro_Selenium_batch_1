package sel_day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class search_chrome {
    public static void main(String[] args) {
        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\aksha\\Downloads\\selenium drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.sendKeys("Selenium");
            searchBox.sendKeys(Keys.RETURN);

            // Give time for manual CAPTCHA solving
            System.out.println("Solve CAPTCHA if it appears. Waiting 60 seconds for you...");
            Thread.sleep(60000);

            // Wait until search results are visible after CAPTCHA
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement firstResult = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3"))
            );

            System.out.println("First search result: " + firstResult.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
