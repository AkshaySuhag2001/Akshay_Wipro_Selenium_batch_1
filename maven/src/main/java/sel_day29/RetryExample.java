package sel_day29;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryExample {
    @Test(retryAnalyzer = Retry.class)
    public void flakyTest() {
        System.out.println("Running test...");
        Assert.fail("Failing intentionally!");
    }
}
