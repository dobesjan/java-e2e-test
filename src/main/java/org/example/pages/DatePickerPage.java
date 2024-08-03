package org.example.pages;

import org.example.components.DateTimePicker;
import org.example.core.driver.TestDriver;

public class DatePickerPage extends BasePage {
    public final DateTimePicker dateTimePicker;
    private final String basicDateTimeInput = "//input[@id=\"basicDate\"]";

    public DatePickerPage(TestDriver driver) {
        super(driver);
        this.dateTimePicker = new DateTimePicker(driver);
    }

    public void clickBasicDateTimeInput() {
        driver.findClickableElement(basicDateTimeInput).click();
    }

    public String getBasicDateTimeInputText() {
        return driver.findElement(basicDateTimeInput).getAttribute("value");
    }
}
