package org.example.pages;

import org.example.components.HeaderComponent;
import org.example.components.MainMenuComponent;
import org.example.core.driver.TestDriver;
import org.openqa.selenium.By;

public class BasePage {
    protected final TestDriver driver;

    public final MainMenuComponent mainMenu;
    public final HeaderComponent headerComponent;

    // Page content
    protected final String contentXpath = "//*[@id=\"content\"]";
    private final By content = By.xpath(contentXpath);

    public BasePage(TestDriver driver) {
        this.driver = driver;
        mainMenu = new MainMenuComponent(driver);
        headerComponent = new HeaderComponent(driver);
    }
}
