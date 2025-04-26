package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.CartObject;
import objectRepository.PlaceOrderObject;
import utils.WaitUtil;

public class PlaceOrderPage {
    private AndroidDriver driver;

    public PlaceOrderPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickPlaceOrder() {
        driver.findElement(PlaceOrderObject.paymentButton).click();
        WaitUtil.waitForSeconds(2);
    }
}
