package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AndroidDriver driver;

    public static AndroidDriver initializeDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Pixel 6 API 34");
        caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("platformVersion", "14");
        caps.setCapability("app", System.getProperty("user.dir") + "/src/test/resources/apk/mda-1.0.13-15.apk");
        caps.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
        caps.setCapability("appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
