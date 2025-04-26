package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.CompleteObject;
import objectRepository.PlaceOrderObject;
import utils.WaitUtil;

public class CompletePage {
    private AndroidDriver driver;

    public CompletePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickContinueShopping() {
        driver.findElement(CompleteObject.shoppingButton).click();
        WaitUtil.waitForSeconds(2);
    }
}
