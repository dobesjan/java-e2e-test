package org.example.components;

import org.example.core.driver.TestDriver;

public class TimePicker extends BaseComponent {
    private final String timePickerXpath = "//div[contains(@class, \"flatpickr-time\")]";
    private final String hourXpath = timePickerXpath + "//input[@class=\"numInput flatpickr-hour\"]";
    private final String minuteXpath = timePickerXpath + "//input[@class=\"numInput flatpickr-minute\"]";
    private final String amPmToggle = timePickerXpath + "//span[@class=\"flatpickr-am-pm\"]";

    public TimePicker(TestDriver driver) {
        super(driver);
    }

    public void fillHours(String hours) {
        driver.findElement(hourXpath).sendKeys(hours);
    }

    public void fillMinutes(String minutes) {
        driver.findElement(minuteXpath).sendKeys(minutes);
    }

    public void toggleAmPm() {
        driver.findElement(amPmToggle).click();
    }

    public void toggleAmPm(String desiredValue) {
        String currentValue = getAmPmToggleText();
        if (!currentValue.equals(desiredValue)) {
            driver.findElement(amPmToggle).click();
        }
    }

    public String getAmPmToggleText() {
        return driver.findElement(amPmToggle).getText();
    }
}
