package org.example.core.config;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {
    private String browserName;
    private String[] options;

    public String getBrowserName() { return browserName; }
    public void setBrowserName(String name) { browserName = name; }
    public String[] getOptions() { return options; }
    public void setOptions(String[] options) { this.options = options; }
}
