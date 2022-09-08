package com.testproject.pages;

import com.testproject.base.BasePage;
import io.cucumber.java.zh_cn.假如;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EspritElements extends BasePage<EspritElements> {
    /*
    This page contains the locators of webelements
     */
    /******************** Login Page ***********************/
    @FindBy(xpath = "//a[@title='Log in']")
    public WebElement LoginTitle;

    @FindBy(xpath = "//input[@id='login-form-email']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='login-form-password']")
    public WebElement pwd;

    @FindBy(xpath = "//button[@data-action='Login_My_Esprit']")
    public WebElement LoginButton;

    @FindBy(xpath = "//a[@class='dropdown-item js-customer-logout']")
    public WebElement LogoutButton;

    /******************** Category selection elements*********/
    @FindBy(xpath = "//img[@class='logo-home-img']")
    public WebElement EspritLogo;

    @FindBy(xpath = "//a[@href='/womenswear']")
    public WebElement WomenSelection;

    @FindBy(xpath = "//div[@id='a630494']")
    public WebElement WomenDresses;

    @FindBy(xpath = "//div[@id='a630482']")
    public WebElement WomenTshirt;

    @FindBy(xpath = "//div[@id='a630726']")
    public WebElement WomenJumper;


    //a[@href='/womenswear/clothes/jumpers-cardigans']

    /******************** Filters Option Elements *************/
    @FindBy(xpath = "(//span[contains(text(),'Filters')])[1]")
    public WebElement FilterButton;

    @FindBy(xpath = "//button[@aria-controls='refinement-size']")
    public WebElement SizeunderFilters;

    @FindBy(xpath = "(//button[@class='btn-refinement full  '])[2]")
    public WebElement SizeSelectionUnderFilters;

    @FindBy(xpath = "//button[@class='swatch-square-BLACK  color-attribute color-attribute-btn']")
    public WebElement ColorUnderFilters;

    @FindBy(xpath = "//button[@class='close-refinebar btn btn-block btn-primary']")
    public WebElement ResultsUnderFilters;

    @FindBy(xpath = "//img[@src='https://www.esprit.co.uk/dw/image/v2/BDSS_PRD/on/demandware.static/-/Sites-esprit-master/default/dw5a15f0f3/images/20/992/992CC1E305_001_20.jpg?sfrm=jpg&sw=700&sh=1050&sm=fit']")
    public WebElement SelectDress;

    @FindBy(xpath = "(//div[@class='product-image'])[1]")
    public WebElement SelectConfirmDress;

    @FindBy(xpath = "//button[@aria-label='Select color BLACK']")
    public WebElement SelectDressColor;

    @FindBy(xpath = "(//button[@aria-label='Select size XS'])[1]")
    public WebElement SelectDressSize;

    @FindBy(xpath = "(//button[@data-cta='addToCart'])[1]")
    public WebElement AddDressToBag;

    @FindBy(xpath = "//a[contains(text(), 'View shopping bag')]")
    public WebElement ViewShoppingBag;


    /******************** Checkout Page ***********************/


    @FindBy(xpath = "//i[@class='icon minicart-icon icon-074-shopping-bag']")
    public WebElement CartIcon;

    @FindBy(xpath = "(//a[contains(text(),'Checkout')])[1]")
    public WebElement CheckoutButton;

    @FindBy(xpath = "//button[contains(text(),'Continue to payment')]")
    public WebElement PaymentButton;

    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    public WebElement PaymentOptions;

    @FindBy(xpath = "//button[@value='place-order']")
    public WebElement BuyNowButton;

    @FindBy(xpath = "//input[@id='cardNumber']")
    public WebElement CreditCardNumber;

    @FindBy(xpath = "//input[@id='cardHolder']")
    public WebElement CreditCardHolder;

    @FindBy(xpath = "//input[@id='expiryDate']")
    public WebElement CreditCardExpiry;

    @FindBy(xpath = "//input[@id='cardCode']")
    public WebElement CreditCardCVV;

    @FindBy(xpath = "//label[contains(text(),'Save credit card for the next payment')]")
    public WebElement CreditCardSave;

    @FindBy(xpath = "//input[@id='btn-submit']")
    public WebElement ProductBuyNow;

    @FindBy(xpath = "//div[contains(text(),'Payment is success')]")
    public WebElement PaymentSuccess;

    @FindBy(xpath = "//div[contains(text(),'Unfortunately the payment with your')]")
    public WebElement PaymentFailed;

    @FindBy(xpath = "(//h2[contains(text(),'Your payment options')])[2]")
    public WebElement Errormessage;

}
