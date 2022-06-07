package com.testproject.pages;

import com.testproject.base.BasePage;
import com.testproject.cucumber.ScenarioContext;
import com.testproject.utils.Driver;
import freemarker.ext.jsp.TaglibFactory;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HorreumMethods {

    private final HorreumElements Horreum123;
    private final ScenarioContext context;
    public static final Logger LOG = LoggerFactory.getLogger(HorreumMethods.class.getName());

    public HorreumMethods(ScenarioContext context, HorreumElements Horreum123) {
        this.context = context;
        this.Horreum123 = Horreum123;
    }

    /*This Method is for checking the info icon whether is available or not*/
    public void CheckForInfoIcon() {
        try {
            if(Horreum123.InfoIcon.isDisplayed()) {
                LOG.info("User navigated to Horreum in Restricted Business Hours");
            }
            else {
                LOG.info("User navigated to Horreum out of Restricted Business Hours");
            }
        } catch (Exception e) {
            LOG.info("Error observed while executing info icon Method");
        }
    }

    /*This Method is for searching for the required station*/
    public void SearchStation() {
        try {
            //Horreum123.TVMediaMod.click();
            Horreum123.StationSearch.sendKeys("Electric");
            Horreum123.StationSearchIcon.click();
            Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Horreum123.SearchedStation.click();
        } catch (Exception e) {
            LOG.info("Error observed while executing search for station Method");
        }

    }

    /*This Method is to click Add Broadcast and enter details*/
    public void Broadcast(){
        try {
            Horreum123.AddBroadcast.click();
            Horreum123.BroadcastTitle.sendKeys("Test123");
            Horreum123.BroadcastOriginal.sendKeys("This is Original");
            Horreum123.MediaId.sendKeys("210");
            Horreum123.MediaStatus.sendKeys("on air");
            Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Horreum123.MediaType.sendKeys("tv");
            Horreum123.MediaType.sendKeys(Keys.RETURN);
            Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            Horreum123.MediaCountry.sendKeys("India");
            Horreum123.MediaCountry.sendKeys(Keys.RETURN);
            Horreum123.MediaLanguage.sendKeys("German");
            Horreum123.MediaLanguage.sendKeys(Keys.RETURN);
            Horreum123.BroadcastDate.sendKeys("2021-12-08");
            Horreum123.StartTime.sendKeys("00:00:00");
            Horreum123.StartTime.sendKeys(Keys.RETURN);
            Horreum123.EndTime.sendKeys("23:55:00");
            Horreum123.EndTime.sendKeys(Keys.RETURN);
            Horreum123.MediaInterval.sendKeys("daily");
            Horreum123.MediaInterval.sendKeys(Keys.RETURN);
            Horreum123.MediaDays.sendKeys("Monday");
            Horreum123.MediaDays.sendKeys(Keys.RETURN);
            Horreum123.MediaRange.sendKeys("regional");
            Horreum123.MediaRange.sendKeys(Keys.RETURN);
            Horreum123.MediaReach.sendKeys("1000");
            Horreum123.MediaPrices.sendKeys("220788");
            //Horreum123.SaveButton.click();
        } catch (Exception e) {
            LOG.info("Error observed while executing Add Broadcast Method");
        }

    }

    /*This Method is to check whether Website, login user & password is displayed*/
    public void PrintMedium() {
        try {
            if (Horreum123.PMM_WebsiteURL.isDisplayed()) {
                LOG.info("WebsiteURL is displayed");
            }
            else {
                LOG.info("Website URL is not displayed");
            }

            if (Horreum123.PMM_LoginUser.isDisplayed()) {
                LOG.info("LoginUser field is displayed");
            }
            else {
                LOG.info("LoginUser field is not displayed");
            }

            if (Horreum123.PMM_LoginPassword.isDisplayed()) {
                LOG.info("LoginPassword field is displayed");
            }
            else {
                LOG.info("LoginPassword field is not displayed");
            }
        } catch (Exception e) {
            LOG.info("Error observed while executing for Check Website, Login and Password Method");
        }
    }

    /*This method is to enter Project details in NTL Module*/
    public void NLTProjectName() {

        try {
            BasePage.sleep(5000);
            Horreum123.NLTProject.click();
            BasePage.sleep(3000);
            Horreum123.NLTProject.sendKeys("Live_Test");
            BasePage.sleep(3000);
            Horreum123.NLTTool.click();
            BasePage.sleep(5000);
            Horreum123.NLTTool.sendKeys("live' test");
            Horreum123.NLTCategory.click();
            BasePage.sleep(5000);
            Horreum123.NLTCategory.sendKeys("news4");
        } catch (Exception e) {
            LOG.info("Error observed while executing Project Details in NLT Method");
        }
    }

    /*This method is to enter details under Advanced Search for an article*/
    public void NLTArticleDetails() {
        try {
            Horreum123.NLTBranch.click();
            Horreum123.NLTBranchSelect.click();
            Horreum123.NLTFromDate.sendKeys("2021-08-01 00:00:00");
            Horreum123.NLTToDate.sendKeys(this.Horreum123.DatePicker());
            Horreum123.NLTSourceProvider.sendKeys("lexis-nexis");
            Horreum123.NLTSourceProvider.sendKeys(Keys.RETURN);
        } catch (Exception e) {
            LOG.info("Error observed while executing Advanced search for article Method");
        }
    }

    /*This method is to assert the failed status*/
    public void validStatus() {
        try {
            if(Horreum123.FailedStatus.isDisplayed()) {
                LOG.info("Upload Status has been failed because LN source provider can't be pushed to NLT");
            }
            else {
                LOG.info("Test Case is failed");
            }
        } catch (Exception e) {
            LOG.info("Error observed while executing Failed Status Method");
        }

    }

    /*This method is check for the Enhanced Search Functionality under Scope Manager*/
    public void ScopeManagerSearch() {
        try {
            if(Horreum123.CountryScope.isDisplayed() && Horreum123.MediaTypeScope.isDisplayed() && Horreum123.LanguageScope.isDisplayed()) {
                LOG.info("Media Search Functionality is Enhanced");
            }
            else {
                LOG.info("Media Search Functionality is not Enhanced");
            }
        } catch (Exception e) {
            LOG.info("Error observed while executing Enhanced Search Functionality Method");
        }
    }

    /*This method is to verify whether Print Article Menu is available in the Coding Configuration Dropdown or not*/
    public void VerifyPrintArticleMenu() {
        WebElement Box = null;
        for(int i=0;i<Horreum123.codingConfigurationBox.size();i++) {
            Box = Horreum123.codingConfigurationBox.get(i);
            String BoxText = Box.getText();

            if(BoxText.contains("Print")) {
                LOG.info("The configuration drop down contains Print Article Menu and the test case is failed");
            }
            else {
                LOG.info("The configuration drop down does not contain Print Article Menu and the test case is passed");
            }
        }
    }

    /*This method is to verify whether all the info icons are present under Influencer Manager Module*/
    public void VerifyInfoIconinIM() {
        for(int i=0; i< Horreum123.IMInfoIcon.size(); i++) {
            WebElement currentInfoIcon = Horreum123.IMInfoIcon.get(i);
            if(currentInfoIcon.isDisplayed()){
                LOG.info("All the info icons are displayed");
            }
            else {
                LOG.info("Info Icons are missing");
            }
        }
    }

    /*This method is to verify whether the validation error is accurate for wrong username under Influencer Manager Module*/
    public void ValidationErrorIM() {
        Horreum123.IMTwitterUsername.sendKeys(".abc");
        Horreum123.IMTwitterUserCheck.click();
        String TwitterBox = Horreum123.validationBox.getText();
        if(TwitterBox.equals("Invalid twitter username provided.")) {
            LOG.info("The social media name displayed is accurate");
        }
        else {
            LOG.info("The social media name displayed is wrong");
        }
        Horreum123.IMOKButton.click();

        Horreum123.IMFacebookUsername.sendKeys("abc");
        Horreum123.IMFacebookUserCheck.click();
        String FacebookBox = Horreum123.validationBox.getText();
        if(FacebookBox.equals("Invalid facebook username provided.")) {
            LOG.info("The social media name displayed is accurate");
        }
        else {
            LOG.info("The social media name displayed is wrong");
        }
        Horreum123.IMOKButton.click();

        Horreum123.IMYoutubeUsername.sendKeys("<abc");
        Horreum123.IMYoutubeUserCheck.click();
        String YTBox = Horreum123.validationBox.getText();
        if(YTBox.equals("Invalid youtube username provided.")) {
            LOG.info("The social media name displayed is accurate");
        }
        else {
            LOG.info("The social media name displayed is wrong");
        }
        Horreum123.IMOKButton.click();

        Horreum123.IMInstaUsername.sendKeys("<abd");
        Horreum123.IMInstaUserCheck.click();
        String InstaBox = Horreum123.validationBox.getText();
        if(InstaBox.equals("Invalid instagram username provided.")) {
            LOG.info("The social media name displayed is accurate");
        }
        else {
            LOG.info("The social media name displayed is wrong");
        }
        Horreum123.IMOKButton.click();

        Horreum123.IMWeiboID.sendKeys("210");
        Horreum123.IMWeiboUsername.sendKeys("!abc");
        Horreum123.IMWeiboUserCheck.click();
        String WeiboBox = Horreum123.validationBox.getText();
        if(WeiboBox.equals("Invalid weibo username provided.")) {
            LOG.info("The social media name displayed is accurate");
        }
        else {
            LOG.info("The social media name displayed is wrong");
        }
        Horreum123.IMOKButton.click();

        Horreum123.IMWechatUsername.sendKeys("abc");
        Horreum123.IMWechatUserCheck.click();
        String WechatBox = Horreum123.validationBox.getText();
        if(WechatBox.equals("Invalid wechat username provided.")) {
            LOG.info("The social media name displayed is accurate");
        }
        else {
            LOG.info("The social media name displayed is wrong");
        }
        Horreum123.IMOKButton.click();
    }

    /*This method is to verify whether the entered text in the Expanded Section of Content Upload Module is saved successfully*/
    public void ExpandedSectionCUModule() {
        Horreum123.ExpandTeaserLabel.click();
        Horreum123.ExpandTextEntry.sendKeys("Hello Cision 01");
        Horreum123.ContentUploadSave.click();
        Horreum123.ExpandSummarylabel.click();
        Horreum123.ExpandTextEntry.sendKeys("Hello Cision 02");
        Horreum123.ContentUploadSave.click();
        Horreum123.ExpandTextlabel.click();
        Horreum123.ExpandTextEntry.sendKeys("Hello Cision 03");
        Horreum123.ContentUploadSave.click();
        Horreum123.ExpandTextEnglishlabel.click();
        Horreum123.ExpandTextEntry.sendKeys("Hello Cision 01");
        Horreum123.ContentUploadSave.click();
    }

    /*This method is to select the branch dropdown under Coding Module using Javascript*/
    public void JSCodingBranchSelect(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element= Horreum123.BranchDropDown;
        js.executeScript(("arguments[0].click();"), element);
        element.click();
    }

    /*This method is to check for the validation error when last page is selected under Coding Module*/
    public void LastPageValidationCheck() {
        if(Horreum123.LastPageValidation.isDisplayed()) {
            String z = Horreum123.LastPageValidation.getText();
            LOG.info("The Error Validation observed is -- " +z);
        }
        else{
            LOG.info("No Validation is observed");
        }
    }

    /*This method is to check whether date is pre-populated when navigated to Content Upload Module*/
    public void CUDateCheck() {
        String dc= Horreum123.ContentUploadDateCheck.getAttribute("value");
        LOG.info("The date displayed in the field is current date = " + dc);
    }

    /*This method is the enter all the values under Content Upload Module*/
    public void CUDataEntry() {
        Horreum123.CUSourceType.sendKeys("Facebook");
        Horreum123.CUSourceTypeSelect.click();
        Horreum123.CUSector.click();
        Horreum123.CUSectorSelect.click();
        Horreum123.CUURLEntry.sendKeys("https://www.google.com");
        Horreum123.CUTitle.sendKeys("Hello Cision 01");
        Horreum123.CUEnglishTitle.sendKeys("Hello Cision English");
        Horreum123.CUSubTitle.sendKeys("Hello Cision SubTitle");
        Horreum123.CUTeaser.sendKeys("Hello Cision Teaser");
        Horreum123.CUSummary.sendKeys("Hello Cision Summary");
        Horreum123.CUText.sendKeys("Hello Cision Text");
        Horreum123.CUEnglishText.sendKeys("Hello Cision English Text");
        Horreum123.CULanguage.sendKeys("English");
        Horreum123.CUCountry.sendKeys("India");
    }

    /*This method is for adding new author under Content Upload Module*/
    public void CUAuthorNameEntry() {
        Horreum123.CUAuthorName.sendKeys("IamCision");
        Horreum123.CUAuthorUserName.sendKeys("msravi");
    }

    /*This method is for adding credentials in Add User under User Management Module*/
    public void UM_AddUser() {
        Horreum123.UMUserName.sendKeys("Cision01");
        Horreum123.UMFirstName.sendKeys("Cision");
        Horreum123.UMLastName.sendKeys("Germany");
        Horreum123.UMGroup.sendKeys("nogroup");
        Horreum123.UMPassword.sendKeys("Cision123");
        Horreum123.UMEmail.sendKeys("abc@cision.com");
    }

    /*This method is for selecting the newly created user*/
    public void UM_Select_NewUser() {
        if(Horreum123.UMCreatedUser.isDisplayed()) {
            Horreum123.UMCreatedUser.click();
        }
    }

    /*This method is to create a new user and select it*/
    public void UM_Add_Select_User() {
        Horreum123.UMAddUser.click();
        UM_AddUser();
        Horreum123.UMSaveUser.click();
        UM_Select_NewUser();
    }

    /*This method is to Export the user and deletes it*/
    public void UM_Export_User() {
        Horreum123.UMExportUser.click();
        Horreum123.UMDeleteUser.click();
        Horreum123.UMNewUserDelete.click();
    }

    /*This method is to verify Modules available under Administration Container*/
    public void UMAdministration_Container() {
        if(Horreum123.UM_Administration.isDisplayed()) {
            LOG.info("User Management Module is displayed under Administation container");
        }
        else {
            assert false;
        }
    }

    /*This method is to verify Modules available under Administration Container*/
    public void UMMediaManagement_Container() {
        if(Horreum123.IM_MediaMgmt.isDisplayed() && Horreum123.LM_MediaMgmt.isDisplayed() && Horreum123.LMC_MediaMgmt.isDisplayed() && Horreum123.LMCoding_MediaMgmt.isDisplayed()
        && Horreum123.LMI_MediaMgmt.isDisplayed() && Horreum123.ML_MediaMgmt.isDisplayed() && Horreum123.OMM_MediaMgmt.isDisplayed() && Horreum123.PMM_MediaMgmt.isDisplayed()
        && Horreum123.SM_MediaMgmt.isDisplayed() && Horreum123.StreamMgr_MediaMgmt.isDisplayed() && Horreum123.SV_MediaMgmt.isDisplayed() && Horreum123.TVMM_MediaMgmt.isDisplayed()){
            LOG.info("All the Modules are displayed under Media Management container");
        }
        else {
            assert false;
        }
    }

    /*This method is to verify Modules available under Data Upload Container*/
    public void UMDataUpload_Container() {
        if(Horreum123.CU_DataUpload.isDisplayed() && Horreum123.EPaper_DataUpload.isDisplayed()) {
            LOG.info("All the Modules are displayed under Data Upload container");
        }
        else {
            assert false;
        }
    }

    /*This method is to verify Modules available under Data Processing Container*/
    public void UMDataProcessing_Container() {
        if(Horreum123.AE_DataProcessing.isDisplayed() && Horreum123.Coding_DataProcessing.isDisplayed() && Horreum123.Coding_PMCD_DataProcessing.isDisplayed()
        && Horreum123.Dictionary_DataProcessing.isDisplayed() && Horreum123.IP_DataProcessing.isDisplayed() && Horreum123.PCD_DataProcessing.isDisplayed()) {
            LOG.info("All the Modules are displayed under Data Upload container");
        }
        else {
            assert false;
        }
    }

}
