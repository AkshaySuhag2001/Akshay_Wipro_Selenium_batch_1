package sel_day30;

import org.testng.annotations.*;
import org.testng.annotations.Listeners;
@Listeners(MyConfigurationListener.class)
public class ConfigurationTest {
	@BeforeMethod
	public void beforeMethod1() {
		System.err.println("Executing Configuration Method before Method 1.");
	}
	@Test
	public void testMethod() {
		System.err.println("Executing Test Method.");
	}
	

}
