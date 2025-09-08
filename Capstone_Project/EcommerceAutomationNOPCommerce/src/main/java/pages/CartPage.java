package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
    private WebDriver driver;

    private By cartItemRow = By.cssSelector("table.cart tbody tr");
    private By emailInput = By.id("Email");
    private By passwordInput = By.id("Password");
    private By loginButton = By.cssSelector("button.login-button");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean hasItems() {
        return driver.findElements(cartItemRow).size() > 0;
    }

    public void proceedToCheckout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkout")));

        WebElement terms = driver.findElement(By.id("termsofservice"));
        if (!terms.isSelected()) {
            terms.click();
        }

        driver.findElement(By.id("checkout")).click();
        Thread.sleep(5000);
        driver.findElement(emailInput).sendKeys("abcd@gmail.com");
        driver.findElement(passwordInput).sendKeys("abcd1234");
        driver.findElement(loginButton).click();
        WebElement terms2 = driver.findElement(By.id("termsofservice"));
        if (!terms2.isSelected()) {
            terms2.click();
        }
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[2]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")).click();
        Thread.sleep(3000);
    }

}
