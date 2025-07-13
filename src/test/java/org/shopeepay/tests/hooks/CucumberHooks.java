package org.shopeepay.tests.hooks;

import io.cucumber.java.After;
import org.shopeepay.tests.utils.DriverManager;

public class CucumberHooks {
    @After
    public void teardown(){
        DriverManager.quitDriver();
    }
}
