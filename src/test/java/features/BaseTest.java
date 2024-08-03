package features;

import org.example.core.TestExecutor;
import org.example.core.driver.TestDriver;
import org.example.core.enums.BrowserType;

import java.io.IOException;

public class BaseTest {
    //TODO: Consider structure of these classes
    // and if some of methods should not be moved to second class
    protected final TestExecutor executor;
    protected final TestDriver driver;

    public BaseTest() throws IOException {
        executor = new TestExecutor();
        driver = executor.getDriver(BrowserType.CHROME);
    }
}
