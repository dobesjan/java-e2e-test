package org.example;

import org.example.core.TestExecutor;
import org.example.core.config.BrowserOptions;
import org.example.core.config.MainConfig;
import org.example.core.driver.TestDriver;
import org.example.core.enums.BrowserType;
import org.example.pages.AccordionPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        TestExecutor executor = new TestExecutor();
        TestDriver driver = executor.getDriver(BrowserType.CHROME);

        executor.goToApplicationUrl(driver.getWebDriver());

        AccordionPage accordionPage = new AccordionPage(driver);
        accordionPage.mainMenu.clickToggle();
        accordionPage.mainMenu.clickToggle();
        accordionPage.mainMenu.clickAccordionLink();
        accordionPage.clickPlatformPortabilityHeader();
        accordionPage.validatePlatformPortabilityText();

/*
        TestExecutor executor = new TestExecutor();
        MainConfig config = executor.loadConfig();
        System.out.println("Base URL: " + config.getBaseUrl());
        for (BrowserOptions option : config.getBrowserOptions()) {
            System.out.println("Browser Name: " + option.getBrowserName());
            System.out.println("Options: " + String.join(", ", option.getOptions()));
        }
        */
    }
}