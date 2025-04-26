package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.CartObject;
import objectRepository.LoginObject;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

public class LoginPage {
    private AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        WebElement usernameField = driver.findElement(LoginObject.usernameField);
        usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        WebElement passwordField = driver.findElement(LoginObject.passwordField);
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(LoginObject.loginButton).click();
    }

    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLogin();
        WaitUtil.waitForSeconds(2);
    }
}
