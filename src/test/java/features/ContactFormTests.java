package features;

import org.example.pages.ContactFormPage;
import org.example.pages.ContactFormSubmitPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ContactFormTests extends BaseTest {
    public ContactFormTests() throws IOException {

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
    public void testReset() {
        ContactFormPage page = new ContactFormPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickContactFormLink();

        page.fillFirstName("John");
        page.fillLastName("Doe");
        page.fillEmail("email@email.com");
        page.fillMessage("Testing...");
        page.clickResetButton();

        Assertions.assertEquals("", page.getFirstNameValue());
        Assertions.assertEquals("", page.getLastNameValue());
        Assertions.assertEquals("", page.getEmailValue());
        Assertions.assertEquals("", page.getMessageValue());
    }

    @Test
    public void testSubmit() {
        ContactFormPage page = new ContactFormPage(driver);
        page.mainMenu.clickToggle();
        page.mainMenu.clickToggle();
        page.mainMenu.clickContactFormLink();

        page.fillFirstName("John");
        page.fillLastName("Doe");
        page.fillEmail("email@email.com");
        page.fillMessage("Testing...");
        page.clickSubmitButton();

        ContactFormSubmitPage submitPage = new ContactFormSubmitPage(driver);
        submitPage.checkSuccesfullSubmitText();
    }
}
