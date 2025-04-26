package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.CartObject;
import utils.WaitUtil;

public class CartPage {
    private AndroidDriver driver;

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickProceed() {
        driver.findElement(CartObject.proceedBtn).click();
        WaitUtil.waitForSeconds(2);
    }
}
