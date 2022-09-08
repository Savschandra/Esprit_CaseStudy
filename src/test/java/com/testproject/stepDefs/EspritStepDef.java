package com.testproject.stepDefs;

import com.testproject.base.BasePage;
import com.testproject.cucumber.ScenarioContext;
import com.testproject.pages.EspritElements;
import com.testproject.pages.EspritMethods;
import com.testproject.utils.Driver;
import com.testproject.utils.Environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;
import java.time.Duration;

import static com.testproject.pages.EspritMethods.LOG;


public class EspritStepDef {

    /******************  This class is to map scenarios to actual selenium code ******************/
    private final EspritElements EspritPage;
    private final ScenarioContext context;
    private final EspritMethods AllMethods;
    private final BasePage AllFunctions;

    public EspritStepDef(ScenarioContext context, EspritElements EspritPage, EspritMethods AllMethods, BasePage AllFunctions) {
        this.context = context;
        this.EspritPage = EspritPage;
        this.AllMethods = AllMethods;
        this.AllFunctions = AllFunctions;
    }

    /***************Methods for Background**************/
    @When("User navigates to Esprit URL")
    public void user_navigates_to_esprit_url() {
        Driver.get().get(Environment.URL);
        Driver.get().manage().window().maximize();
        EspritPage.waitForPageToLoad();
    }
    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        EspritPage.LoginTitle.click();
    }
    @Then("User enters valid {string} and {string}")
    public void user_enters_valid_and(String string, String string2) {
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        EspritPage.username.sendKeys(Environment.USERNAME);
        EspritPage.pwd.sendKeys(Environment.PASSWORD);
    }
    @Then("User clicks on Submit button")
    public void user_clicks_on_submit_button() {
        EspritPage.LoginButton.click();
        BasePage.sleep(3000);
    }

    /************************* Test01 >> User should login and add dress to cart *******************************/
    @Then("User navigates to Women collection")
    public void user_navigates_to_women_collection() {
        EspritPage.EspritLogo.click();
        EspritPage.WomenSelection.click();
    }

    @Then("User selects a {string} category")
    public void user_selects_a_category(String category) {
        AllMethods.choseProductCat(category);
    }

    @Then("User Adds a dress to cart")
    public void user_adds_a_dress_to_cart() {
        AllMethods.addDressToCart();
    }



    /*************************Test02 >> User should navigate to cart and perform checkout flow*******************************/
    @Then("User navigates to cart and selects checkout")
    public void user_navigates_to_cart_and_selects_checkout() {
        EspritPage.CartIcon.click();
        EspritPage.CheckoutButton.click();
    }
    @When("User click on Continue to Payment")
    public void user_click_on_continue_to_payment() {
        EspritPage.PaymentButton.click();
    }
    @Then("User should click on Credit Card and click on Buy now")
    public void user_should_click_on_credit_card_and_click_on_buy_now() {
        EspritPage.PaymentOptions.click();
        BasePage.sleep(3000);
        EspritPage.BuyNowButton.click();
    }
    @When("User enters valid credit card data and performs Buy now")
    public void user_enters_valid_credit_card_data_and_performs_buy_now() {
        AllMethods.addCreditCardInfo();
    }
    @Then("User should observe a order placed successfully")
    public void user_should_observe_a_order_placed_successfully() {
        AllMethods.checkPayment();
    }
}
