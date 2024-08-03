package features;

import org.example.pages.DatePickerPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class DatePickerTests extends BaseTest {
    public DatePickerTests() throws IOException {
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
    public void testDateTimePicker() throws InterruptedException {
        DatePickerPage page = new DatePickerPage(driver);
        page.mainMenu.clickDatePickerLink();
        page.clickBasicDateTimeInput();
        page.dateTimePicker.fillCurrentYear("2024");
        page.dateTimePicker.clickOnColumn("15, 2024");
        page.dateTimePicker.fillHours("10");
        page.dateTimePicker.fillMinutes("57");
        page.dateTimePicker.toggleAmPm("PM");

        String partOfDesiredInputValue = "15 2024 22:57";
        String inputText = page.getBasicDateTimeInputText();

        Thread.sleep(1000);

        Assertions.assertTrue(inputText.contains(partOfDesiredInputValue));
    }
}
