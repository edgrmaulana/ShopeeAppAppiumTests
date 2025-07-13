package org.shopeepay.tests.utils;

import io.appium.java_client.AppiumDriver;

public class DriverManager {
    private static AppiumDriver driver;

    public static void setDriver(AppiumDriver d) {
        driver = d;
    }

    public static AppiumDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

