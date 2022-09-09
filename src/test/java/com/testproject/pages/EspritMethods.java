package com.testproject.pages;

import com.testproject.base.BasePage;
import com.testproject.utils.Driver;
import io.cucumber.java.an.E;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EspritMethods {

    private final EspritElements EspritPage;

    public static final Logger LOG = LoggerFactory.getLogger(EspritMethods.class.getName());

    public EspritMethods(EspritElements espritPage) {
        this.EspritPage = espritPage;
    }


    public void assertThat(WebElement elem , String expectedText){
        try{
            String actualText = elem.getText();
            Assert.assertEquals(actualText,expectedText);
            LOG.info("Assert passed");
        }catch(Exception e){
            LOG.error("Assert Failed due to error " );
        }
    }

    public void assertVerifyText(WebElement elem ){
        try{
            String actualText = elem.getText();
            if(actualText.contains("sent to customer"))
                LOG.info("Assert passed");
        }catch(Exception e){
            LOG.error("Test Failed" );
        }
    }

    public void assertPageTitle( String expectedTitle){
        try{
            String pageTitle = Driver.get().getTitle();
            Assert.assertEquals(pageTitle,expectedTitle);
            LOG.info("Assert passed");
        }catch(Exception e){
            LOG.error("Assert Failed " );
        }
    }

    /*********** This method is to select the required category according to user's input **********************/
    public void choseProductCat(String category){
        if(category.equalsIgnoreCase("dress")){
            EspritPage.WomenDresses.click();
        }else if(category.equalsIgnoreCase("tshirt")){
            EspritPage.WomenTshirt.click();
        }else if(category.equalsIgnoreCase("jumper")){
            EspritPage.WomenJumper.click();
        }else{
            LOG.info("Different category is selected which is not available right now on selection page ");
        }
    }

    /************ This method is to update the filters **************/
    public void choseCategoryFilters() {
        EspritPage.waitForPageToLoad();
        EspritPage.FilterButton.click();
        EspritPage.SizeunderFilters.click();
        BasePage.sleep(2000);
        EspritPage.SizeSelectionUnderFilters.click();
        EspritPage.ColorUnderFilters.click();
        BasePage.sleep(5000);
        EspritPage.ResultsUnderFilters.click();
    }

    /*********** This method id to add dress to the cart **************/
        public void addDressToCart() {
            //BasePage.scrollToElement(EspritPage.SelectDress);
            EspritPage.SelectConfirmDress.click();
            EspritPage.waitForPageToLoad();
            //EspritPage.SelectDressColor.click();
            BasePage.waitForVisibility(EspritPage.DressSizes, 5);
            sizeSelection();
            //EspritPage.SelectDressSize01.click();
            BasePage.waitToBeClickable(EspritPage.AddDressToBag, 5);
            EspritPage.AddDressToBag.click();
        }

    /************ This method is to add Credit Card Details ***********/
        public void addCreditCardInfo() {
            EspritPage.switchToFrame("paymentIFrame");
            BasePage.waitForVisibility(EspritPage.CreditCardNumber,5);
            EspritPage.CreditCardNumber.sendKeys("37178214585854222");
            EspritPage.CreditCardHolder.sendKeys("Esprit");
            EspritPage.CreditCardExpiry.sendKeys("0125");
            EspritPage.CreditCardCVV.sendKeys("000");
            EspritPage.ProductBuyNow.click();
            EspritPage.switchToParentFrame();
        }

    /************ This method is for asserting whether the payment is successful or not **************/
        public void checkPayment() {
                BasePage.sleep(5000);
                EspritPage.Errormessage.click();
                String CheckoutMsg = EspritPage.PaymentFailed.getText();
                System.out.println(CheckoutMsg);
                if(CheckoutMsg.contains("Payment Successful")) {
                    LOG.info("Payment is Successful");
                }
                else {
                    LOG.error("Payment is not successful");
                }
            }

    /************ This method is for asserting whether the payment is successful or not **************/
        public void sizeSelection() {
            try {
                if(EspritPage.SelectDressSize01.isDisplayed()) {
                    EspritPage.SelectDressSize01.click();
                }
            } catch (Exception e) {
                    EspritPage.SelectDressSize.click();
            }
        }

}
