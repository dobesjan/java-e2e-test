package features;

import org.example.pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

public class CalculatorTests extends BaseTest {
    public CalculatorTests() throws IOException {

    }

    @BeforeEach
    public void setUp() {
        executor.goToApplicationUrl(driver.getWebDriver());
    }

    @AfterEach
    public void cleanUp() {
        executor.closeBrowser(driver.getWebDriver());
    }

    @Test
    public void testAdd() {
        CalculatorPage page = new CalculatorPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickCalculatorLink();
        page.clickCalculatorButton("3");
        page.clickCalculatorButton("+");
        page.clickCalculatorButton("5");
        page.clickCalculatorButton("=");

        String result = page.getResultText();

        Assertions.assertEquals("8", result);
    }

    @Test
    public void testSubtract() {
        CalculatorPage page = new CalculatorPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickCalculatorLink();
        page.clickCalculatorButton("3");
        page.clickCalculatorButton("-");
        page.clickCalculatorButton("5");
        page.clickCalculatorButton("=");

        String result = page.getResultText();

        Assertions.assertEquals("-2", result);
    }

    @Test
    public void testMultiply() {
        CalculatorPage page = new CalculatorPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickCalculatorLink();
        page.clickCalculatorButton("6");
        page.clickCalculatorButton("*");
        page.clickCalculatorButton("5");
        page.clickCalculatorButton("=");

        String result = page.getResultText();

        Assertions.assertEquals("30", result);
    }

    @Test
    public void testDivide() {
        CalculatorPage page = new CalculatorPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickCalculatorLink();
        page.clickCalculatorButton("6");
        page.clickCalculatorButton("/");
        page.clickCalculatorButton("2");
        page.clickCalculatorButton("=");

        String result = page.getResultText();

        Assertions.assertEquals("3", result);
    }

    @Test
    public void testErase() {
        CalculatorPage page = new CalculatorPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickCalculatorLink();
        page.clickCalculatorButton("6");
        page.clickCalculatorButton("/");
        page.clickCalculatorButton("2");
        page.clickCalculatorButton("=");
        page.clickCalculatorButton("c");

        String result = page.getResultText();

        Assertions.assertEquals("", result);
    }
}
