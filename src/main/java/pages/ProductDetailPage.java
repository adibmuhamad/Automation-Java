package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.ProductDetailObject;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.WaitUtil;

public class ProductDetailPage {
    private AndroidDriver driver;

    public ProductDetailPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void selectColor(String color) {
        driver.findElement(ProductDetailObject.colorByName(color)).click();
    }

    public void setQuantity(int qty) {
        WebElement qtyField = driver.findElement(ProductDetailObject.quantity);
        String currentQtyText = qtyField.getText();
        int currentQty = Integer.parseInt(currentQtyText);

        while (currentQty < qty) {
            driver.findElement(ProductDetailObject.addQuantity).click();
            currentQty++;
        }
    }

    public void addToCart() {
        driver.findElement(ProductDetailObject.addToCartButton).click();
    }

    public void verifyCounterCart(int expectedQty) {
        WebElement quantity = driver.findElement(ProductDetailObject.counterCart);
        String currentQuantityText = quantity.getText();
        int currentQty = Integer.parseInt(currentQuantityText);

        Assert.assertEquals(currentQty, expectedQty, "Expected cart quantity: " + expectedQty + ", but found: " + currentQty);
    }

    public void clickCartIcon() {
        driver.findElement(ProductDetailObject.cartIcon).click();
        WaitUtil.waitForSeconds(2);
    }
}
