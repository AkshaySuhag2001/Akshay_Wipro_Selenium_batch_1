package sel_day22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_sel {
    public static void main(String[] args) {
    	
        System.setProperty("webdriver.chrome.driver", 
            "C:\\Users\\aksha\\Downloads\\selenium drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}
