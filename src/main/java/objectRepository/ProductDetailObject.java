package objectRepository;

import org.openqa.selenium.By;

public class ProductDetailObject {
    public static By colorByName(String color) {
        return By.xpath("//android.widget.ImageView[@content-desc='" + color + " color']");
    }

    public static final By quantity = By.id("com.saucelabs.mydemoapp.android:id/noTV");

    public static final By addQuantity = By.xpath("//android.widget.ImageView[@content-desc=\"Increase item quantity\"]");
    public static final By addToCartButton = By.id("com.saucelabs.mydemoapp.android:id/cartBt");
    public static final By counterCart = By.id("com.saucelabs.mydemoapp.android:id/cartTV");
    public static final By cartIcon = By.id("com.saucelabs.mydemoapp.android:id/cartIV");
}
