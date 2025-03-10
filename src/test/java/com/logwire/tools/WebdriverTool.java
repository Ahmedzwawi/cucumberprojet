package com.logwire.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class WebdriverTool {

    static private WebDriver driver;

    static public void setupDriver() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability("se:name", "test_visit_basic_auth_secured_page (ChromeTests)");
        options.setCapability("se:recordVideo", true);
        options.setCapability("se:screenResolution", "1920x1080");

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Problème avec l'URL du Selenium Grid", e);
        }
    }

    static public WebDriver getDriver() {
        return driver;
    }

    static public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
