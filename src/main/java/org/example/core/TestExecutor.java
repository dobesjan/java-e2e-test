package org.example.core;

import com.google.gson.Gson;
import org.example.core.config.MainConfig;
import org.example.core.driver.TestDriver;
import org.example.core.enums.BrowserType;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;

public class TestExecutor {
    private MainConfig config;

    public TestExecutor() throws IOException {
        config = loadConfig();
    }

    public MainConfig loadConfig(String filePath) throws IOException {
        Gson gson = new Gson();
        try (InputStreamReader reader = new InputStreamReader(
                TestExecutor.class.getClassLoader().getResourceAsStream(filePath))) {
            if (reader == null) {
                throw new IOException("Configuration file not found");
            }
            return gson.fromJson(reader, MainConfig.class);
        }
    }

    public MainConfig loadConfig() throws IOException {
        return loadConfig("config/config.json");
    }

    public TestDriver getDriver(String browserName) {
        WebDriver driver = null;

        switch (browserName.toLowerCase()) {
            case BrowserType.CHROME:
                ChromeOptions chromeOptions = new ChromeOptions();
                for (String option : config.getBrowserOption(BrowserType.CHROME).getOptions()) {
                    chromeOptions.addArguments(option);
                }

                driver = new ChromeDriver(chromeOptions);
                break;
            case BrowserType.FIREFOX:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                for (String option : config.getBrowserOption(BrowserType.FIREFOX).getOptions()) {
                    firefoxOptions.addArguments(option);
                }

                driver = new FirefoxDriver(firefoxOptions);
                break;
            default:
                throw new InvalidArgumentException(String.format("Cannot find driver for browser with name: %s", browserName));

        }

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(config.getWait()));

        return new TestDriver(driver, wait);
    }

    public void initBrowser(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver) {
        driver.close();
    }

    public void goToUrl(WebDriver driver, String url) {
        initBrowser(driver);
        driver.get(url);
    }

    public void goToApplicationUrl(WebDriver driver) {
        initBrowser(driver);
        driver.get(config.getBaseUrl());
    }
}
