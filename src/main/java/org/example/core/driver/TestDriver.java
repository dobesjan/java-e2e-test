package org.example.core.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDriver {
    private final WebDriver webDriver;
    private final WebDriverWait webDriverWait;

    public TestDriver(WebDriver webDriver, WebDriverWait wait) {
        this.webDriver = webDriver;
        this.webDriverWait = wait;
    }

    public WebDriver getWebDriver() { return webDriver; }
    public WebDriverWait getWebDriverWait() { return webDriverWait; }

    public WebElement findElement(By locator) {
        return webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement findElement(String xpath) {
        return findElement(By.xpath(xpath));
    }

    public WebElement findClickableElement(By locator) {
        return webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement findClickableElement(String xpath) {
        return findClickableElement(By.xpath(xpath));
    }

    public WebElement clickElementWithWait(By locator) {
        WebElement element = findClickableElement(locator);
        element.click();
        return element;
    }

    public WebElement clickElementWithWait(String xpath) {
        return clickElementWithWait(xpath);
    }
}
