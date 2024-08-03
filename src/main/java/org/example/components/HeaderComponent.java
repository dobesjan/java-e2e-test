package org.example.components;

import org.example.core.driver.TestDriver;
import org.openqa.selenium.By;

public class HeaderComponent {
    private final TestDriver driver;

    private final String headerXpath = "//header[@id=\"header\"]";
    private final By headerLink = By.xpath(headerXpath + "//a[@class=\"logo\"]");

    public HeaderComponent(TestDriver driver) {
        this.driver = driver;
    }

    public void clickHeaderLink() {
        driver.clickElementWithWait(headerLink);
    }
}
