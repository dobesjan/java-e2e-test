package org.example.components;

import org.example.core.driver.TestDriver;

public class DateTimePicker extends TimePicker {
    private final String dateTimePicker = "//div[contains(@class, \"flatpickr-calendar\")]";

    private final String monthContainer = dateTimePicker + "//div[contains(@class, \"flatpickr-month\")]";
    private final String monthBackButton = monthContainer + "//span[contains(@class, \"flatpickr-prev-month\")]";
    private final String currentMonthSpan = monthContainer + "//span[contains(@class, \"cur-month\")]";
    private final String currentYearInput = monthContainer + "//input[contains(@class, \"numInput cur-year\")]";
    private final String monthNextButton = monthContainer + "//span[contains(@class, \"flatpickr-next-month\")]";

    private final String dateColumn = dateTimePicker + "//div[contains(@class, \"flatpickr-days\")]//span[contains(@aria-label, \"%s\")]";

    public DateTimePicker(TestDriver driver) {
        super(driver);
    }

    public void clickBackButton() {
        driver.findClickableElement(monthBackButton).click();
    }

    public String getCurrentMonth() {
        return driver.findElement(currentMonthSpan).getText();
    }

    public String getCurrentYear() {
        return driver.findElement(currentYearInput).getAttribute("value");
    }

    public void fillCurrentYear(String year) {
        driver.findElement(currentYearInput).sendKeys(year);
    }

    public void clickNextButton() {
        driver.findClickableElement(monthNextButton).click();
    }

    public void clickOnColumn(String label) {
        String xpath = String.format(dateColumn, label);
        driver.findClickableElement(xpath).click();
    }
}
