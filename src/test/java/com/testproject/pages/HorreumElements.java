package com.testproject.pages;

import com.testproject.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.Base64;
import java.util.List;
import java.util.logging.XMLFormatter;

public class HorreumElements extends BasePage<HorreumElements> {


    @FindBy(name = "q")
    public WebElement searchBar;

    @FindBy(xpath = "//input[@id='pam-loginwindow-user-inputEl']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='pam-login-textfield-password-inputEl']")
    public WebElement pwd;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'login')]")
    public WebElement login_Button;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'log out')]")
    public WebElement logout_Button;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/pmcd-orange.png\"]")
    public WebElement CodingMod;

    @FindBy(xpath = "//div[@id='image-1066']")
    public WebElement InfoIcon;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/tv-media-manager-orange.png\"]")
    public WebElement TVMediaMod;

    @FindBy(xpath = "//input[@id='pagingsearchfield-1094-inputEl']")
    public WebElement StationSearch;

    @FindBy(xpath = "//div[@id='pagingsearchfield-1094-trigger-search']")
    public WebElement StationSearchIcon;

    @FindBy(xpath = "(//div[@class='x-grid-cell-inner '])[1]")
    public WebElement SearchedStation;

    @FindBy(xpath = "//span[@id='button-1150-btnInnerEl']")
    public WebElement AddBroadcast;

    @FindBy(xpath = "//input[@name='publicationtitle']")
    public WebElement BroadcastTitle;

    @FindBy(xpath = "//input[@name='publicationtitleorglang']")
    public WebElement BroadcastOriginal;

    @FindBy(xpath = "//input[@name='pcdid']")
    public WebElement MediaId;

    @FindBy(xpath = "//input[@name='status']")
    public WebElement MediaStatus;

    @FindBy(xpath = "//input[@name='publicationtype']")
    public WebElement MediaType;

    @FindBy(xpath = "(//input[@name='country'])[2]")
    public WebElement MediaCountry;

    @FindBy(xpath = "//input[@name='language']")
    public WebElement MediaLanguage;

    @FindBy(xpath = "//input[@name='broadcastdate']")
    public WebElement BroadcastDate;

    @FindBy(xpath = "//input[@name='starttime']")
    public WebElement StartTime;

    @FindBy(xpath = "//input[@name='endtime']")
    public WebElement EndTime;

    @FindBy(xpath = "//input[@name='freqinterval']")
    public WebElement MediaInterval;

    @FindBy(xpath = "//input[@name='freqdays']")
    public WebElement MediaDays;

    @FindBy(xpath = "//input[@name='range']")
    public WebElement MediaRange;

    @FindBy(xpath = "//input[@name='reach']")
    public WebElement MediaReach;

    @FindBy(xpath = "//input[@name='pricesec']")
    public WebElement MediaPrices;

    @FindBy(xpath = "(//a[@class='x-btn x-unselectable x-box-item x-toolbar-item x-btn-default-small'])[1]")
    public WebElement SaveButton;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/print-media-manager-orange.png\"]")
    public WebElement PMManagerMod;

    @FindBy(xpath = "//span[@style='background-image:url(./resources/images/icon/add.png);']")
    public WebElement PMM_Add;

    @FindBy(xpath = "//input[@name='website']")
    public WebElement PMM_WebsiteURL;

    @FindBy(xpath = "//input[@name='loginUser']")
    public WebElement PMM_LoginUser;

    @FindBy(xpath = "//input[@name='loginPassword']")
    public WebElement PMM_LoginPassword;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/upload-manager-orange.png\"]")
    public WebElement NLTMod;

    @FindBy(xpath = "//input[@name='newslettertoolProject']")
    public WebElement NLTProject;

    @FindBy(xpath = "//input[@name='newslettertoolNewsletter']")
    public WebElement NLTTool;

    @FindBy(xpath = "//input[@name='newslettertoolCategory']")
    public WebElement NLTCategory;

    @FindBy(xpath = "//input[@id='combobox-1088-inputEl']")
    public WebElement NLTBranch;

    @FindBy(xpath = "//li[@data-recordindex='5']")
    public WebElement NLTBranchSelect;

    @FindBy(xpath = "//input[@name='fromContentDate']")
    public WebElement NLTFromDate;

    @FindBy(xpath = "//input[@name='toContentDate']")
    public WebElement NLTToDate;

    @FindBy(xpath = "//input[@name='sourceProvider']")
    public WebElement NLTSourceProvider;

    @FindBy(xpath = "(//span[contains(@id,'btnInnerEl') and contains(text(),'Search')])[2]")
    public WebElement NLTSearch;

    @FindBy(xpath = "(//tr[@role='row'])[2]")
    public WebElement NLTArticle;

    @FindBy(xpath = "//span[@style='background-image:url(./resources/images/icon/page_right.gif);']")
    public WebElement NLTPush;

    @FindBy(xpath = "(//div[@style='white-space:normal !important;'])[5]")
    public WebElement FailedStatus;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/scope-editor-orange.png\"]")
    public WebElement ScopeManager;

    @FindBy(xpath = "//span[@style='background-image:url(./resources/images/icon/add.png);']")
    public WebElement AddScope;

    @FindBy(xpath = "//input[@name='geoCountryCode']")
    public WebElement CountryScope;

    @FindBy(xpath = "//input[@name='mediaType']")
    public WebElement MediaTypeScope;

    @FindBy(xpath = "//input[@name='contentLanguage']")
    public WebElement LanguageScope;

    @FindBy(xpath = "//a[@style='margin: 0px; left: 0px; top: 0px;']")
    public WebElement codingConfiguration;

    @FindAll(@FindBy(how = How.XPATH, using = "//div[@id='menu-1236-targetEl']/div"))
    public List<WebElement> codingConfigurationBox;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/influencer-manager-orange.png\"]")
    public WebElement IMMod;

    @FindBy(xpath = "(//span[@class='x-tab-inner x-tab-inner-default'])[2]")
    public WebElement IMUser;

    @FindBy(xpath = "(//span[@class='x-btn-button x-btn-button-default-toolbar-small x-btn-text  x-btn-icon x-btn-icon-left x-btn-button-center '])[3]")
    public WebElement IMNewUSer;

    @FindBy(xpath = "//input[@name='user']")
    public WebElement CommonUser;

    @FindBy(xpath = "//input[@name='facebookUsername']")
    public WebElement FBUsername;

    @FindBy(xpath = "//input[@name='twitterUsername']")
    public WebElement TwitterUsername;

    @FindBy(xpath = "//span[@style='background-image:url(./resources/images/icon/action_save.gif);']")
    public WebElement IMSaveButton;

    @FindBy(xpath = "//a[@style='min-width: 75px; left: 76.5px; top: 0px; margin: 0px;']")
    public WebElement IMOKButton;

    @FindAll(@FindBy(how = How.XPATH, using = "//div[@class='x-img x-box-item x-img-default']"))
    public List<WebElement> IMInfoIcon;

    @FindBy(xpath = "//div[@class='x-component x-window-text x-box-item x-component-default']")
    public WebElement validationBox;

    @FindBy(xpath = "//input[@name='twitterUsername']")
    public WebElement IMTwitterUsername;

    @FindBy(xpath = "(//span[@style='background-image:url(./resources/images/icon/action_refresh.gif);'])[3]")
    public WebElement IMTwitterUserCheck;

    @FindBy(xpath = "//input[@name='facebookUsername']")
    public WebElement IMFacebookUsername;

    @FindBy(xpath = "(//span[@style='background-image:url(./resources/images/icon/action_refresh.gif);'])[4]")
    public WebElement IMFacebookUserCheck;

    @FindBy(xpath = "//input[@name='youtubeUsername']")
    public WebElement IMYoutubeUsername;

    @FindBy(xpath = "(//span[@style='background-image:url(./resources/images/icon/action_refresh.gif);'])[5]")
    public WebElement IMYoutubeUserCheck;

    @FindBy(xpath = "//input[@name='instagramUsername']")
    public WebElement IMInstaUsername;

    @FindBy(xpath = "(//span[@style='background-image:url(./resources/images/icon/action_refresh.gif);'])[6]")
    public WebElement IMInstaUserCheck;

    @FindBy(xpath = "//input[@name='weiboId']")
    public WebElement IMWeiboID;

    @FindBy(xpath = "//input[@name='weiboUsername']")
    public WebElement IMWeiboUsername;

    @FindBy(xpath = "(//span[@style='background-image:url(./resources/images/icon/action_refresh.gif);'])[7]")
    public WebElement IMWeiboUserCheck;

    @FindBy(xpath = "//input[@name='weChatUsername']")
    public WebElement IMWechatUsername;

    @FindBy(xpath = "(//span[@style='background-image:url(./resources/images/icon/action_refresh.gif);'])[8]")
    public WebElement IMWechatUserCheck;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/content-upload-orange.png\"]")
    public WebElement ContentUploadMod;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Expand Teaser')]")
    public WebElement ExpandTeaserLabel;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Expand Summary')]")
    public WebElement ExpandSummarylabel;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Expand Text')]")
    public WebElement ExpandTextlabel;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Expand Text (english)')]")
    public WebElement ExpandTextEnglishlabel;

    @FindBy(xpath = "//textarea[@class='x-form-field x-form-text x-form-text-default x-form-textarea  x-form-empty-field x-form-empty-field-default']")
    public WebElement ExpandTextEntry;

    @FindBy(xpath = "(//span[contains(@id,'btnInnerEl') and contains(text(), 'Save')])[2]")
    public WebElement ContentUploadSave;

    @FindBy(xpath = "//input[@name='contentBranch']")
    public WebElement BranchDropDown;

    @FindBy(xpath = "//li[contains(@class,'x-boundlist-item') and contains(text(),'general')]")
    public WebElement GeneralBranch;

    @FindBy(xpath = "(//li[contains(@class,'x-boundlist-item') and contains(text(),'automotive')])[1]")
    public WebElement AutomotiveBranch;

    @FindBy(xpath = "//input[@value='1 week']")
    public WebElement CodingTimeRange;

    @FindBy(xpath = "//li[contains(@class,'x-boundlist-item') and contains(text(),'3 months (90 days)')]")
    public WebElement CodingTimeRangeSelect;

    @FindBy(xpath = "//a[@data-qtip='Last Page']")
    public WebElement LastPageCodingMod;

    @FindBy(xpath = "(//div[contains(@id, 'pmcd-documents-grid')])[3]")
    public WebElement ArticleSelect;

    @FindBy(xpath = "//span[contains(@id, 'btnInnerEl') and contains(text(), 'delete document(s)')]")
    public WebElement DeleteDocument;

    @FindBy(xpath = "//span[contains(@id, 'btnInnerEl') and contains(text(), 'refresh documents')]")
    public WebElement RefreshDocument;

    @FindBy(xpath = "//span[contains(@id, 'btnInnerEl') and contains(text(), 'accept document(s)')]")
    public WebElement AcceptDocument;

    @FindBy(xpath = "(//*[contains(text(), 'go to post')])[1]")
    public WebElement GoToPost;

    @FindBy(xpath = "(//*[contains(text(), 'show fulltext')])[1]")
    public WebElement ShowFullText;

    @FindBy(xpath = "(//*[contains(text(), 'show rawdata')])[1]")
    public WebElement ShowRawData;

    @FindBy(xpath = "//div[@class='x-component x-window-text x-box-item x-component-default']")
    public WebElement LastPageValidation;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(), 'Configuration')]")
    public WebElement CodingConfig;

    @FindBy(xpath = "//span[contains(@id,'textEl') and contains(text(),'Highlight search terms')]")
    public WebElement HighlightSearchItems;

    @FindBy(xpath = "(//span[contains(@id,'textEl') and contains(text(),'Enable highlighting')])[1]")
    public WebElement EnableHighlighting;

    @FindBy(xpath = "//textarea[@name='queryStringSearch']")
    public WebElement CodingQuerySearch;

    @FindBy(xpath = "(//span[contains(@id,'btnInnerEl') and contains(text(), 'Search')])[2]")
    public WebElement CodingSearchButton;

    @FindBy(xpath = "//input[@name='contentDate']")
    public WebElement ContentUploadDateCheck;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/stream-validator-orange.png\"]")
    public WebElement StreamValidatorMod;

    @FindBy(xpath = "//input[@placeholder='choose branch']")
    public WebElement StreamValidatorBranchName;

    @FindBy(xpath = "//div[@id='pam-streamvalidator-confPanel-branchcombo-trigger-picker']")
    public WebElement StreamValidatorBranchDropDown;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement StreamValidatorRadioButton;

    @FindBy(xpath = "(//img[@src='./resources/images/icon/fam/accept.gif'])[1]")
    public WebElement StreamValidatorAcceptUser;

    @FindBy(xpath = "(//img[@src='./resources/images/icon/fam/delete.gif'])[2]")
    public WebElement StreamValidatorRejectUser;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(), 'Yes')]")
    public WebElement StreamValidatorYesButton;

    @FindBy(xpath = "(//div[@data-qtip='Close dialog'])[2]")
    public WebElement StreamValidatorExceptionDialog;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Save/Manage searches')]")
    public WebElement BMManageSearches;

    @FindBy(xpath = "//span[contains(@class,'x-tree-node-text') and contains(text(),'public')]")
    public WebElement BookmarkPublicFolder;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'save search in selected folder')]")
    public WebElement BookmarkSaveSearchFolder;

    @FindBy(xpath = "//input[@name='searchName']")
    public WebElement BookmarkNameEntry;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Save search')]")
    public WebElement BookmarkSaveButton;

    @FindBy(xpath = "//input[@name='scope']")
    public WebElement ScopeName;

    @FindBy(xpath = "//input[@name='geoCountryCode']")
    public WebElement ScopeCountry;

    @FindBy(xpath = "//input[@name='mediaType']")
    public WebElement ScopeMediaType;

    @FindBy(xpath = "//input[@name='contentLanguage']")
    public WebElement ScopeLanguage;

    @FindBy(xpath = "//input[@name='publicationSearch']")
    public WebElement ScopePublication;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Add Publication')]")
    public WebElement ScopeAddPublication;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Save')]")
    public WebElement ScopeSave;

    @FindAll(@FindBy(how = How.XPATH, using = "//tr[@class='  x-grid-row']"))
    public List<WebElement> ScopeTable;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Export Scope(s)')]")
    public WebElement ScopeExport;

    @FindBy(xpath = "//a[@class='cc-btn cc-dismiss']")
    public WebElement AcceptCookies;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Open user configuration')]")
    public WebElement OpenUserConfig;

    @FindBy(xpath = "//input[@name='pmcdExportConfiguration']")
    public WebElement PMCDExportConfig;

    @FindBy(xpath = "//input[@name='pmcdProjectConfiguration']")
    public WebElement PMCDProjectConfig;

    @FindBy(xpath = "//input[@name='uploadmanagerExportConfiguration']")
    public WebElement UploadManagerExportConfig;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'save')]")
    public WebElement UserConfigSave;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/image-gallery-orange.png\"]")
    public WebElement MediaLogosMod;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'reload images')]")
    public WebElement MediaModReloadImages;

    @FindBy(xpath = "//div[contains(@id,'-trigger-picker')]")
    public WebElement MediaLogosSortDropDown;

    @FindBy(xpath = "//li[contains(@class,'x-boundlist-item') and contains(text(),'DESC')]")
    public WebElement MediaLogoDesc;

    @FindBy(xpath = "//span[contains(@id,'btnIconEl') and contains(@class,'x-tbar-page-last ')]")
    public WebElement MediaLogosLastPage;

    @FindBy(xpath = "//span[contains(@id,'btnIconEl') and contains(@class,'x-tbar-page-first ')]")
    public WebElement MediaLogosFirstPage;

    @FindBy(xpath = "//span[contains(@id,'btnIconEl') and contains(@class,'x-tbar-loading ')]")
    public WebElement MediaLogosRefreshAction;

    @FindBy(xpath = "//input[@name='sourceType']")
    public WebElement CUSourceType;

    @FindBy(xpath = "//li[contains(text(),'Facebook')]")
    public WebElement CUSourceTypeSelect;

    @FindBy(xpath = "//label[contains(text(),'select sector')]")
    public WebElement CUSector;

    @FindBy(xpath = "(//li[contains(text(), 'automotive')])[1]")
    public WebElement CUSectorSelect;

    @FindBy(xpath = "//input[@name='url']")
    public WebElement CUURLEntry;

    @FindBy(xpath = "//input[@name='title']")
    public WebElement CUTitle;

    @FindBy(xpath = "//input[@name='titleEnglish']")
    public WebElement CUEnglishTitle;

    @FindBy(xpath = "//input[@name='subtitle']")
    public WebElement CUSubTitle;

    @FindBy(xpath = "//textarea[@name='teaser']")
    public WebElement CUTeaser;

    @FindBy(xpath = "//textarea[@name='summary']")
    public WebElement CUSummary;

    @FindBy(xpath = "//textarea[@name='text']")
    public WebElement CUText;

    @FindBy(xpath = "//textarea[@name='textEnglish']")
    public WebElement CUEnglishText;

    @FindBy(xpath = "//input[@name='language']")
    public WebElement CULanguage;

    @FindBy(xpath = "//input[@name='countryCode']")
    public WebElement CUCountry;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Save')]")
    public WebElement CUSave;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Continue')]")
    public WebElement CUContinue;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Reset')]")
    public WebElement CUReset;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'add author')]")
    public WebElement CUAddAuthor;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement CUAuthorName;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement CUAuthorUserName;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Update')]")
    public WebElement CUAuthorUpdate;

    @FindBy(xpath = "//img[@src=\"./resources/images/modules/user-management-orange.png\"]")
    public WebElement UserManagementModule;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'User Management')]")
    public WebElement UM_Administration;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Influencer Manager')]")
    public WebElement IM_MediaMgmt;

    @FindBy(xpath = "(//span[contains(@id,'labelTextEl') and contains(text(),'Label Manager')])[1]")
    public WebElement LM_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Label Manager Changes')]")
    public WebElement LMC_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Label Manager Coding')]")
    public WebElement LMCoding_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Label Manager Import')]")
    public WebElement LMI_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Media Logos')]")
    public WebElement ML_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Online Media Manager')]")
    public WebElement OMM_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Print Media Manager')]")
    public WebElement PMM_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Scope Manager')]")
    public WebElement SM_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Stream Manager')]")
    public WebElement StreamMgr_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Stream Validator')]")
    public WebElement SV_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'TV Media Manager')]")
    public WebElement TVMM_MediaMgmt;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Content Upload')]")
    public WebElement CU_DataUpload;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'E-Paper (CCS)')]")
    public WebElement EPaper_DataUpload;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Article Editor')]")
    public WebElement AE_DataProcessing;

    @FindBy(xpath = "(//span[contains(@id,'labelTextEl') and contains(text(),'Coding / PMCD')])[1]")
    public WebElement Coding_DataProcessing;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Coding / PMCD Project Configuration')]")
    public WebElement Coding_PMCD_DataProcessing;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Dictionary / Stream test')]")
    public WebElement Dictionary_DataProcessing;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'Impact Push')]")
    public WebElement IP_DataProcessing;

    @FindBy(xpath = "//span[contains(@id,'labelTextEl') and contains(text(),'PCD / NLT Push')]")
    public WebElement PCD_DataProcessing;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Add User')]")
    public WebElement UMAddUser;

    @FindBy(xpath = "(//input[@name='username'])[2]")
    public WebElement UMUserName;

    @FindBy(xpath = "(//input[@name='firstname'])[2]")
    public WebElement UMFirstName;

    @FindBy(xpath = "(//input[@name='lastname'])[2]")
    public WebElement UMLastName;

    @FindBy(xpath = "(//input[@name='password'])[2]")
    public WebElement UMPassword;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement UMEmail;

    @FindBy(xpath = "(//input[@name='group'])[2]")
    public WebElement UMGroup;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Save User')]")
    public WebElement UMSaveUser;

    @FindBy(xpath = "//div[contains(@class,'x-grid-cell-inner ') and contains(text(),'Cision01')]")
    public WebElement UMCreatedUser;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Delete User')]")
    public WebElement UMDeleteUser;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Export User')]")
    public WebElement UMExportUser;

    @FindBy(xpath = "//span[contains(@id,'btnInnerEl') and contains(text(),'Yes')]")
    public WebElement UMNewUserDelete;

}
