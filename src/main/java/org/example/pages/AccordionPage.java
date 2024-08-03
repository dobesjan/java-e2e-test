package org.example.pages;

import org.example.core.driver.TestDriver;

public class AccordionPage extends BasePage {
    private final String headerXpath = "//div[contains(@class, \"accordion-header\")";
    private final String contentXpath = "//div[contains(@class, \"accordion-content\")";

    private final String platformPortabilityHeaderXpath = headerXpath + " and contains(text(), \"Platform Portability\")]";
    private final String platformPortabilityContentXpath = contentXpath + " and @style=\"display: block;\"]";

    public AccordionPage(TestDriver driver) {
        super(driver);
    }

    public void clickPlatformPortabilityHeader() {
        driver.clickElementWithWait(platformPortabilityHeaderXpath);
    }

    public void validatePlatformPortabilityText() {
        driver.findElement(platformPortabilityContentXpath);
    }
}
