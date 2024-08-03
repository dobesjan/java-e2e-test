package org.example.components;

import org.example.core.driver.TestDriver;

public class BaseComponent {
    protected final TestDriver driver;

    public BaseComponent(TestDriver driver) {
        this.driver = driver;
    }
}
