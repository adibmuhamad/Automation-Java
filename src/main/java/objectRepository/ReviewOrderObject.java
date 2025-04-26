package objectRepository;

import org.openqa.selenium.By;

public class ReviewOrderObject {
    public static final By fullNameField = By.id("com.saucelabs.mydemoapp.android:id/nameET");
    public static final By cardNumberField = By.id("com.saucelabs.mydemoapp.android:id/cardNumberET");
    public static final By expDateField = By.id("com.saucelabs.mydemoapp.android:id/expirationDateET");
    public static final By securityCodeField = By.id("com.saucelabs.mydemoapp.android:id/securityCodeET");
    public static final By reviewOrderButton = By.id("com.saucelabs.mydemoapp.android:id/paymentBtn");
}
