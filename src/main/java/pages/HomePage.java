package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.HomeObject;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

public class HomePage {
    private AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void selectProduct(String productName) {
        WebElement product = driver.findElement(HomeObject.productByName(productName));
        product.click();
        WaitUtil.waitForSeconds(2);
    }
}
