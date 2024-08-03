package org.example.components;

import org.example.core.driver.TestDriver;
import org.openqa.selenium.By;

public class MainMenuComponent {
    private final TestDriver driver;

    private final By toggle = By.cssSelector(".toggle");
    private final By accordionLink = By.linkText("ACCORDION");
    private final By calculatorLink = By.linkText("CALCULATOR (JS)");
    private final By contactFormLink = By.linkText("CONTACT US FORM TEST");
    private final By datePickerLink = By.linkText("DATE PICKER");

    public MainMenuComponent(TestDriver driver) {
        this.driver = driver;
    }

    public void clickToggle() {
        driver.clickElementWithWait(toggle);
    }

    public void clickAccordionLink() {
        driver.clickElementWithWait(accordionLink);
    }

    public void clickCalculatorLink() {
        driver.clickElementWithWait(calculatorLink);
    }

    public void clickContactFormLink() {
        driver.clickElementWithWait(contactFormLink);
    }

    public void clickDatePickerLink() {
        driver.clickElementWithWait(datePickerLink);
    }
}
