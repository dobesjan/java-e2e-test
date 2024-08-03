package org.example.pages;

import org.example.core.driver.TestDriver;

public class ContactFormPage extends BasePage {
    // Inputs
    private final String baseFormXpath = "//form[@id=\"contact_form\"]";
    private final String firstNameInputXpath = baseFormXpath + "//input[@name=\"first_name\"]";
    private final String lastNameInputXpath = baseFormXpath + "//input[@name=\"last_name\"]";
    private final String emailInputXpath = baseFormXpath + "//input[@name=\"email\"]";
    private final String messageXpath = baseFormXpath + "//textarea[@name=\"message\"]";

    // Buttons
    private final String buttonDiv = baseFormXpath + "//div[@id=\"form_buttons\"]";
    private final String resetButtonXpath = buttonDiv + "//input[@class=\"contact_button\" and @type=\"reset\"]";
    private final String submitButtonXpath = buttonDiv + "//input[@class=\"contact_button\" and @type=\"submit\"]";

    public ContactFormPage(TestDriver driver) {
        super(driver);
    }

    public String getFirstNameValue() {
        return driver.findElement(firstNameInputXpath).getAttribute("value");
    }

    public void fillFirstName(String firstName) {
        driver.findElement(firstNameInputXpath).sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        driver.findElement(lastNameInputXpath).sendKeys(lastName);
    }

    public String getLastNameValue() {
        return driver.findElement(lastNameInputXpath).getAttribute("value");
    }

    public void fillEmail(String email) {
        driver.findElement(emailInputXpath).sendKeys(email);
    }

    public String getEmailValue() {
        return driver.findElement(emailInputXpath).getAttribute("value");
    }

    public void fillMessage(String message) {
        driver.findElement(messageXpath).sendKeys(message);
    }

    public String getMessageValue() {
        return driver.findElement(messageXpath).getAttribute("value");
    }

    public void clickResetButton() {
        driver.findClickableElement(resetButtonXpath).click();
    }

    public void clickSubmitButton() {
        driver.findClickableElement(submitButtonXpath).click();
    }
}
