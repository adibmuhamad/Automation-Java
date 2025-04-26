package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.CartObject;
import objectRepository.CheckoutObject;
import objectRepository.LoginObject;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

public class CheckoutPage {
    private AndroidDriver driver;

    public CheckoutPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setFullName(String fullName) {
        WebElement fullNameField = driver.findElement(CheckoutObject.fullNameField);
        fullNameField.sendKeys(fullName);
    }

    public void setAddress(String address) {
        WebElement addressField = driver.findElement(CheckoutObject.addressField);
        addressField.sendKeys(address);
    }

    public void setCity(String city) {
        WebElement cityField = driver.findElement(CheckoutObject.cityField);
        cityField.sendKeys(city);
    }

    public void setZipCode(String zipCode) {
        WebElement zipCodeField = driver.findElement(CheckoutObject.zipCodeField);
        zipCodeField.sendKeys(zipCode);
    }

    public void setCountry(String country) {
        WebElement countryField = driver.findElement(CheckoutObject.countryField);
        countryField.sendKeys(country);
    }

    public void clickToPaymentButton() {
        driver.findElement(CheckoutObject.toPaymentButton).click();
    }

    public void fillCheckoutDetail(String fullName, String address, String city, String zipCode, String country) {
        setFullName(fullName);
        setAddress(address);
        setCity(city);
        setZipCode(zipCode);
        setCountry(country);
        clickToPaymentButton();
        WaitUtil.waitForSeconds(2);
    }
}
