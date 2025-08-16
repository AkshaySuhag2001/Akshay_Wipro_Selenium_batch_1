package sel_day24;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class resume_upload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\aksha\\Downloads\\selenium drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://www.naukri.com/nlogin/login");

            driver.findElement(By.id("usernameField")).sendKeys("akshaysuhag2001@gmail.com");
            driver.findElement(By.id("passwordField")).sendKeys("f4$UshJ!#fwqT9d");
            driver.findElement(By.xpath("//button[text()='Login']")).click();

            Thread.sleep(5000);

            driver.get("https://www.naukri.com/mnjuser/profile");

            Thread.sleep(3000);

            File resume = new File("C:\\Users\\aksha\\Downloads\\Deedy_Akshay.pdf");
            WebElement uploadInput = driver.findElement(By.id("attachCV"));
            uploadInput.sendKeys(resume.getAbsolutePath());

            Thread.sleep(5000);

            System.out.println("Resume uploaded successfully to Naukri!");

        } finally {
            driver.quit();
        }
    }
}
