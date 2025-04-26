package objectRepository;

import org.openqa.selenium.By;

public class LoginObject {
    public static final By usernameField = By.id("com.saucelabs.mydemoapp.android:id/nameET");
    public static final By passwordField = By.id("com.saucelabs.mydemoapp.android:id/passwordET");

    public static final By loginButton = By.id("com.saucelabs.mydemoapp.android:id/loginBtn");
}
