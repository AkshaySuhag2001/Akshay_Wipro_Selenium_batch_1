package sel_day28;

import org.testng.annotations.*;

public class CommandLineDemo {
    
    @Parameters({"browser", "url"})
    @Test
    public void testApp(String browser, String url) {
        System.out.println("Browser: " + browser);
        System.out.println("URL: " + url);
        
        // You can add more logic here based on the parameters
        // For example:
        if(browser.equalsIgnoreCase("chrome")) {
            System.out.println("Setting up Chrome driver...");
        } else if(browser.equalsIgnoreCase("firefox")) {
            System.out.println("Setting up Firefox driver...");
        }
    }
}