package org.example.core.config;

import java.util.Arrays;

public class MainConfig {
    private String baseUrl;
    private int wait;
    private BrowserOptions[] browserOptions;

    public String getBaseUrl() { return baseUrl; }
    public void setBaseUrl(String url) { baseUrl = url; }
    public int getWait() { return wait; }
    public void setWait(int seconds) { wait = seconds; }
    public BrowserOptions[] getBrowserOptions() { return browserOptions; }
    public BrowserOptions getBrowserOption(String browserName)
    {
        return Arrays.stream(browserOptions).filter(bo -> bo.getBrowserName().equals(browserName)).findFirst().get();
    }
    public void setBrowserOptions(BrowserOptions[] options) { browserOptions = options; }
}
