package org.example.pages;

import org.example.core.driver.TestDriver;
import org.openqa.selenium.By;

public class CalculatorPage extends BasePage {
    private final String calculatorButtonXpath = "//table//td//input[@type=\"button\" and @value=\"%s\"]";
    private final String resultXpath = "//table//td//input[@id=\"result\"]";

    public CalculatorPage(TestDriver driver) {
        super(driver);
    }

    public void clickCalculatorButton(String value) {
        String xpath = String.format(calculatorButtonXpath, value);
        driver.clickElementWithWait(By.xpath(xpath));
    }

    public String getResultText() {
        return driver.findElement(By.xpath(resultXpath)).getAttribute("value");
    }
}
