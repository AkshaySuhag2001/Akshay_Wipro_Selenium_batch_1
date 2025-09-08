package sel_day30;

import org.testng.IConfigurationListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class MyConfigurationListener implements IConfigurationListener {

    @Override
    public void beforeConfiguration(ITestResult tr, ITestNGMethod tm) {
        //The "ITestNGMethod" will be a valid object ONLY for @BeforeMethod and @AfterMethod
        System.err.println("Commencing execution of Config method " + tr.getMethod().getQualifiedName() +
                " for the test method " + tm.getQualifiedName());
    }

    @Override
    public void onConfigurationSuccess(ITestResult tr, ITestNGMethod tm) {
        //The "ITestNGMethod" will be a valid object ONLY for @BeforeMethod and @AfterMethod
        System.err.println("Successfully executed Config method " + tr.getMethod().getQualifiedName() +
                " for the test method " + tm.getQualifiedName());
    }
}