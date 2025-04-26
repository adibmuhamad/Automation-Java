package pages;

import io.appium.java_client.android.AndroidDriver;
import objectRepository.LoginObject;
import objectRepository.ReviewOrderObject;
import org.openqa.selenium.WebElement;
import utils.WaitUtil;

public class ReviewOrderPage {
    private AndroidDriver driver;

    public ReviewOrderPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setFullName(String fullName) {
        WebElement fullNameField = driver.findElement(ReviewOrderObject.fullNameField);
        fullNameField.sendKeys(fullName);
    }

    public void setCardNumber(String cardNumber) {
        WebElement cardNumberField = driver.findElement(ReviewOrderObject.cardNumberField);
        cardNumberField.sendKeys(cardNumber);
    }

    public void setExpDate(String expDate) {
        WebElement expDateField = driver.findElement(ReviewOrderObject.expDateField);
        expDateField.sendKeys(expDate);
    }

    public void setSecurityCode(String securityCode) {
        WebElement securityCodeField = driver.findElement(ReviewOrderObject.securityCodeField);
        securityCodeField.sendKeys(securityCode);
    }

    public void clickReviewOrderButton() {
        driver.findElement(ReviewOrderObject.reviewOrderButton).click();
    }

    public void fillReviewOrder(String fullName, String cardNumber, String expDate, String securityCode) {
        setFullName(fullName);
        setCardNumber(cardNumber);
        setExpDate(expDate);
        setSecurityCode(securityCode);
        clickReviewOrderButton();
        WaitUtil.waitForSeconds(2);
    }
}
