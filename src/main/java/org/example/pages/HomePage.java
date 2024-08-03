package org.example.pages;

import org.example.core.driver.TestDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private final String titleXpath = contentXpath + "//h1[contains(@text='Testing Arena')]";
    private final By title = By.xpath(titleXpath);

    public HomePage(TestDriver driver) {
        super(driver);
    }

    public void ValidateTitle() {
        driver.findElement(title);
    }
}
