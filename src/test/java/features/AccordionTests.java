package features;

import org.example.pages.AccordionPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class AccordionTests extends BaseTest {

    public AccordionTests() throws IOException {
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
    public void testText() {
        AccordionPage accordionPage = new AccordionPage(driver);
        accordionPage.mainMenu.clickToggle();
        accordionPage.mainMenu.clickToggle();
        accordionPage.mainMenu.clickAccordionLink();
        accordionPage.clickPlatformPortabilityHeader();
        accordionPage.validatePlatformPortabilityText();
    }
}
