package org.example.pages;

import org.example.core.driver.TestDriver;
import org.openqa.selenium.By;

public class ContactFormSubmitPage extends BasePage {
    private final String headerXpath = "//*[contains(text(), \"Thank you for your mail!\")]";

    public ContactFormSubmitPage(TestDriver driver) {
        super(driver);
    }

    public void checkSuccesfullSubmitText() {
        driver.findElement(By.xpath(headerXpath));
    }
}
