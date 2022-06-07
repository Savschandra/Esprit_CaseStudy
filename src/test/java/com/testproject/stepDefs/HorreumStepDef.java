package com.testproject.stepDefs;

import com.sun.management.HotSpotDiagnosticMXBean;
import com.sun.xml.bind.v2.runtime.reflect.Lister;
import com.testproject.base.BasePage;
import com.testproject.base.Page;
import com.testproject.cucumber.ScenarioContext;
import com.testproject.pages.HorreumElements;
import com.testproject.pages.HorreumMethods;
import com.testproject.utils.Driver;
import com.testproject.utils.Environment;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.api.metrics.LongGaugeBuilder;
import net.bytebuddy.asm.Advice;
import org.jsoup.Connection;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;

import javax.xml.transform.Result;
import java.io.IOException;
import java.time.Duration;

import static com.testproject.pages.HorreumMethods.LOG;

@EnableEncryptableProperties

public class HorreumStepDef {

    private final HorreumElements HorreumPage;
    private final ScenarioContext context;
    private final HorreumMethods AllMethods;
    private final BasePage AllFunctions;

    public HorreumStepDef(ScenarioContext context, HorreumElements HorreumPage, HorreumMethods AllMethods, BasePage AllFunctions) {
        this.context = context;
        this.HorreumPage = HorreumPage;
        this.AllMethods = AllMethods;
        this.AllFunctions = AllFunctions;
    }

    /*These functions are for the Background steps*/
    @Given("Navigate to Horreum Test server")
    public void navigate_to_horreum_test_server() {
        Driver.get().get(Environment.URL);
        Driver.get().manage().window().maximize();
        HorreumPage.waitForPageToLoad();
    }
    @When("User enters valid {string} and {string}")
    public void user_enters_valid_and(String string, String string2) {
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        HorreumPage.username.sendKeys(Environment.USERNAME);
        HorreumPage.pwd.sendKeys(Environment.PASSWORD);
    }
    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        HorreumPage.login_Button.click();
    }
    @Then("User should navigate to Coding Module")
    public void user_should_navigate_to_coding_module() {
        HorreumPage.CodingMod.click();
    }

    @When("User clicks on Media Logos Module")
    public void user_clicks_on_media_logos_module() {
        HorreumPage.MediaLogosMod.click();
    }
    @When("User clicks on Content Upload Module")
    public void user_clicks_on_content_upload_module() {
        HorreumPage.ContentUploadMod.click();
    }
    @When("User selects a branch and searches for the Articles")
    public void user_selects_a_branch_and_searches_for_the_articles() throws InterruptedException {
        HorreumPage.CodingTimeRange.click();
        HorreumPage.CodingTimeRangeSelect.click();
        HorreumPage.BranchDropDown.click();
        Thread.sleep(5000);
        HorreumPage.AutomotiveBranch.click();
        Thread.sleep(5000);
    }
    @When("User navigates to User Management Module")
    public void user_navigates_to_user_management_module() {
        HorreumPage.UserManagementModule.click();
    }

    /*Coding Mod -- 001*/
    @Then("User should see articles respectively")
    public void user_should_see_articles_respectively() throws IOException {
        BasePage.takeScreenShot();
    }

    /*Coding Mod -- 002*/
    @When("User enters a valid From and To Date")
    public void user_enters_a_valid_from_and_to_date() {
        HorreumPage.NLTFromDate.sendKeys("2021-08-01 00:00:00");
        HorreumPage.NLTToDate.sendKeys(this.HorreumPage.DatePicker());
    }
    @When("User enters a valid source provider")
    public void user_enters_a_valid_source_provider() throws InterruptedException {
        HorreumPage.NLTSourceProvider.sendKeys("wise");
    }
    @Then("User clicks Search button")
    public void user_clicks_search_button() {
        HorreumPage.NLTSearch.click();
        BasePage.sleep(5000);
    }
    @Then("User should observe the related articles")
    public void user_should_observe_the_related_articles() throws IOException {
        BasePage.takeScreenShot();
    }

    /*Coding Mod -- 003*/
    @When("User clicks on a article for a branch")
    public void user_clicks_on_a_article_for_a_branch() {
        HorreumPage.ArticleSelect.click();
    }
    @When("User deletes the selected article and no error should be observed")
    public void user_deletes_the_selected_article_and_no_error_should_be_observed() {
        HorreumPage.DeleteDocument.click();
        LOG.info("No Validation is observed");
    }

    /*Coding Mod -- 004*/
    @When("User refreshes the article page and no error should be observed")
    public void user_refreshes_the_article_page_and_no_error_should_be_observed() {
        HorreumPage.ArticleSelect.click();
        HorreumPage.RefreshDocument.click();
        LOG.info("No Validation is observed");
    }

    /*Coding Mod -- 005*/
    @Then("User should notice configuration and click on to open drop down")
    public void user_should_notice_configuration_and_click_on_to_open_drop_down() {
        HorreumPage.codingConfiguration.click();
    }
    @Then("User should observe that there is not Print Article Menu")
    public void user_should_observe_that_there_is_not_print_article_menu() {
        AllMethods.VerifyPrintArticleMenu();
    }

    /*006*/
    @Then("User clicks on Last page and should observe a validation")
    public void user_clicks_on_last_page_and_should_observe_a_validation() {
        HorreumPage.LastPageCodingMod.click();
        AllMethods.LastPageValidationCheck();
    }

    /*Coding Mod -- 007*/
    @Then("User should select Enable Highlighting under Configuration")
    public void user_should_select_enable_highlighting_under_configuration() {
        HorreumPage.CodingConfig.click();
        HorreumPage.HighlightSearchItems.click();
        HorreumPage.EnableHighlighting.click();
    }
    @Then("User should observe the new pop up")
    public void user_should_observe_the_new_pop_up() throws IOException {
        BasePage.takeScreenShot();
    }
    @When("User enters user text under query and clicks search")
    public void user_enters_user_text_under_query_and_clicks_search() {
        HorreumPage.CodingQuerySearch.sendKeys("Tesla");
        HorreumPage.CodingSearchButton.click();
        BasePage.sleep(3000);
    }
    @Then("User should observe that there text highlighted under Articles")
    public void user_should_observe_that_there_text_highlighted_under_articles() throws IOException {
        BasePage.takeScreenShot();
    }

    /*Coding Mod -- 008*/
    @Then("User should click on Go to Post option and navigate to new tab")
    public void user_should_click_on_go_to_post_option_and_navigate_to_new_tab() {
        HorreumPage.GoToPost.click();
    }

    /*Coding Mod -- 009*/
    @Then("User should click on Show Fulltext option and navigate to new tab")
    public void user_should_click_on_show_fulltext_option_and_navigate_to_new_tab() {
        HorreumPage.ShowFullText.click();
    }

    /*Coding Mod -- 010*/
    @Then("User should click on Show rawdata option and navigate to new tab")
    public void user_should_click_on_show_rawdata_option_and_navigate_to_new_tab() {
        HorreumPage.ShowRawData.click();
    }

    /*Media Logos Mod -- 002*/
    @Then("User should observe Media Logos in the Module")
    public void user_should_observe_media_logos_in_the_module() throws IOException {
        BasePage.sleep(3000);
        BasePage.takeScreenShot();
    }

    /*Media Logos Mod -- 002*/
    @When("User clicks on Reload Images option")
    public void user_clicks_on_reload_images_option() {
        HorreumPage.MediaModReloadImages.click();
    }
    @Then("Logos should be reloaded properly")
    public void logos_should_be_reloaded_properly() throws IOException {
        BasePage.sleep(5000);
        BasePage.takeScreenShot();
    }

    /*Media Logos Mod -- 003*/
    @When("User clicks on Sorting Drop down")
    public void user_clicks_on_sorting_drop_down() {
        HorreumPage.MediaLogosSortDropDown.click();
    }
    @Then("User changes the option to Desc")
    public void user_changes_the_option_to_desc() {
        HorreumPage.MediaLogoDesc.click();
    }

    /*Media Logos Mod -- 004*/
    @Then("User clicks on Last page option")
    public void user_clicks_on_last_page_option() {
        BasePage.sleep(5000);
        HorreumPage.MediaLogosLastPage.click();
    }
    @Then("User clicks on First page option")
    public void user_clicks_on_first_page_option() {
        HorreumPage.MediaLogosFirstPage.click();
    }
    @Then("User should click Refresh option")
    public void user_should_click_refresh_option() {
        HorreumPage.MediaLogosRefreshAction.click();
    }

    /*Content Upload Mod -- 001*/
    @Then("User enters valid data to fill the content")
    public void user_enters_valid_data_to_fill_the_content() {
        AllMethods.CUDataEntry();
    }
    @Then("User clicks save and continue for valid document creation")
    public void user_clicks_save_and_continue_for_valid_document_creation() {
        HorreumPage.CUSave.click();
        BasePage.sleep(10000);
        HorreumPage.CUContinue.click();
    }

    /*Content Upload Mod -- 002*/
    @Then("User enters valid data to fill the fields")
    public void user_enters_valid_data_to_fill_the_fields() {
        AllMethods.CUDataEntry();
    }
    @Then("User clicks reset to clear all the fields")
    public void user_clicks_reset_to_clear_all_the_fields() {
        HorreumPage.CUReset.click();
    }

    /*Content Upload Mod -- 003*/
    @Then("Current Day Date should be displayed in the Date field")
    public void current_day_date_should_be_displayed_in_the_date_field() {
        AllMethods.CUDateCheck();
    }

    /*Content Upload Mod -- 004*/
    @When("User clicks on Add Author")
    public void user_clicks_on_add_author() {
        HorreumPage.CUAddAuthor.click();
    }
    @Then("User enters Author and Username")
    public void user_enters_author_and_username() {
        AllMethods.CUAuthorNameEntry();
    }
    @Then("User clicks on Update successfully")
    public void user_clicks_on_update_successfully() {
        HorreumPage.CUAuthorUpdate.click();
    }

    /*Content Upload Mod -- 005*/
    @Then("User should click Expand text fields, enter text and save it successfully")
    public void user_should_click_expand_text_fields_enter_text_and_save_it_successfully() {
        AllMethods.ExpandedSectionCUModule();
    }

    /*User Management Mod -- 001*/
    @Then("Related module should be displayed under Administration")
    public void related_module_should_be_displayed_under_administration() {
        AllMethods.UMAdministration_Container();
    }
    @Then("Related module should be displayed under Media Management")
    public void related_module_should_be_displayed_under_media_management() {
        AllMethods.UMMediaManagement_Container();
    }
    @Then("Related module should be displayed under Data Upload")
    public void related_module_should_be_displayed_under_data_upload() {
        AllMethods.UMDataUpload_Container();
    }
    @Then("Related module should be displayed under Data Processing")
    public void related_module_should_be_displayed_under_data_processing() {
        AllMethods.UMDataProcessing_Container();
    }

    /*User Management Mod -- 002*/
    @When("User clicks on Add User")
    public void user_clicks_on_add_user() {
        HorreumPage.UMAddUser.click();
    }
    @Then("User enters valid credentials for a new user")
    public void user_enters_valid_credentials_for_a_new_user() {
        AllMethods.UM_AddUser();
    }
    @Then("User clicks on Save User")
    public void user_clicks_on_save_user() {
        HorreumPage.UMSaveUser.click();
    }

    /*User Management Mod -- 003*/
    @When("User selects a created user")
    public void user_selects_a_created_user() {
        AllMethods.UM_Select_NewUser();
    }
    @Then("User should click on delete user")
    public void user_should_click_on_delete_user() {
        HorreumPage.UMDeleteUser.click();
        HorreumPage.UMNewUserDelete.click();
    }

    /*User Management Mod -- 004*/
    @When("User clicks on an available user")
    public void user_clicks_on_an_available_user() {
        AllMethods.UM_Add_Select_User();
    }
    @Then("User clicks on Export User")
    public void user_clicks_on_export_user() {
        AllMethods.UM_Export_User();
    }

}
