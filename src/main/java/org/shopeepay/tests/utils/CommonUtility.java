package org.shopeepay.tests.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CommonUtility{

    private static AppiumDriver appiumDriver;

    public AppiumDriver launchAndroid() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("sdk_gphone64_x86_64")
                .setPlatformName("Android")
                .setPlatformVersion("14")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.shopeepay.id")
                .setAppActivity("com.shopee.app.ui.home.HomeActivity_")
                .setNoReset(true);

        return appiumDriver = new AndroidDriver(new URL("http://192.168.1.9:4723/"), options);
    }

    public void clickByXpath(String value){
        appiumDriver.findElement(By.xpath(value)).click();
    }

    public String getTextByXpath(String value){
        return appiumDriver.findElement(By.xpath(value)).getText();
    }

    public void waitForElementVisibleByXpath(String value){
        WebDriverWait wait = new WebDriverWait(appiumDriver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
    }
}
