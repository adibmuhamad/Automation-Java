package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;
import utils.DriverFactory;

import java.net.MalformedURLException;

public class BuyProductSteps {
    HomePage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;
    LoginPage loginPage;
    CheckoutPage checkoutPage;
    ReviewOrderPage reviewOrderPage;
    PlaceOrderPage placeOrderPage;
    CompletePage completePage;

    @Before
    public void setUp() throws MalformedURLException {
        DriverFactory.initializeDriver();
        productsPage = new HomePage(DriverFactory.getDriver());
        productDetailPage = new ProductDetailPage(DriverFactory.getDriver());
        cartPage = new CartPage(DriverFactory.getDriver());
        loginPage = new LoginPage(DriverFactory.getDriver());
        checkoutPage = new CheckoutPage(DriverFactory.getDriver());
        reviewOrderPage = new ReviewOrderPage(DriverFactory.getDriver());
        placeOrderPage = new PlaceOrderPage(DriverFactory.getDriver());
        completePage = new CompletePage(DriverFactory.getDriver());
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }

    @Given("user launches the app")
    public void user_launches_the_app() {}

    @When("user selects {string}")
    public void user_selects_product(String productName) {
        productsPage.selectProduct(productName);
    }

    @When("user selects color {string}")
    public void user_selects_color(String color) {
        productDetailPage.selectColor(color);
    }

    @When("user sets quantity to {int}")
    public void user_sets_quantity(Integer qty) {
        productDetailPage.setQuantity(qty);
    }

    @When("user adds the item to the cart")
    public void user_adds_item_to_cart() {
        productDetailPage.addToCart();
    }

    @Then("{int} item is added to the cart successfully")
    public void verify_cart_addition(Integer item) {
        productDetailPage.verifyCounterCart(item);
    }

    @When("user opens the cart from the top navigation")
    public void user_opens_cart_from_top_nav() {
        productDetailPage.clickCartIcon();
    }

    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout() {
        cartPage.clickProceed();
    }

    @When("user logs in with username {string} and password {string}")
    public void user_login(String username, String password) {
        loginPage.login(username, password);
    }

    @When("user taps to payment with full name {string}, address {string}, city {string}, zip code {string}, and country {string}")
    public void user_taps_to_payment(String fullName, String address, String city, String zipCode, String country) {
        checkoutPage.fillCheckoutDetail(fullName, address, city, zipCode, country);
    }

    @When("user reviews the order with full name {string}, card number {string}, exp date {string} and security code {string}")
    public void user_review_order(String fullName, String cardNumber, String expDate, String securityCode) {
        reviewOrderPage.fillReviewOrder(fullName, cardNumber, expDate, securityCode);
    }

    @When("user places the order")
    public void user_place_order() {
        placeOrderPage.clickPlaceOrder();
    }

    @When("user continues shopping")
    public void user_continue_shopping() {
        completePage.clickContinueShopping();
    }
}
