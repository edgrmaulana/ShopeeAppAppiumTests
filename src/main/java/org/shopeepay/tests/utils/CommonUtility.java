package org.shopeepay.tests.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class CommonUtility{

    private static AppiumDriver appiumDriver;

    public AppiumDriver launchAndroid() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setAppPackage("com.shopee.id")
                .setAppActivity("com.shopee.app.ui.home.HomeActivity_")
                .setAutoGrantPermissions(true)
                .setFullReset(false)
                .setNoReset(false);

        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        DriverManager.setDriver(appiumDriver);
        return appiumDriver;
    }

    public void clickByXpath(String value){
        appiumDriver.findElement(By.xpath(value)).click();
    }

    public String getTextByXpath(String value){
        return appiumDriver.findElement(By.xpath(value)).getText();
    }

    public WebDriverWait getWait() {
        return new WebDriverWait(appiumDriver, Duration.ofSeconds(15));
    }

    public boolean isElementPresentByXPath(String value){
        try{
            WebElement element = getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
            return element.isDisplayed();
        }
        catch (TimeoutException e){
            return false;
        }
    }

}
