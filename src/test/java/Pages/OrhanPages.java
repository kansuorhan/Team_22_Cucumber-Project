package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class OrhanPages {

    public OrhanPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement anaSayfaSignInLink;

    @FindBy(css = "#username")
    public WebElement signInUsernameBox;

    @FindBy (css = "#password")
    public WebElement signInPasswordBox;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement signInButton;

    @FindBy (xpath = "//*[@id=\"menu-item-1079\"]/a[text()='My Account']")
    public WebElement myAccountButton;

    @FindBy (xpath = "//*[text()='Sign Out']")
    public WebElement anaSayfaSignOutLink;

    @FindBy (xpath = "//a[text()='Store Manager']")
    public WebElement storeManagerLink;

    @FindBy(xpath = "//*[@class='wcfmfa fa-gift']")
    public WebElement cuponsLink;

    @FindBy(xpath = "//a[text()='C_005']")
    public WebElement couponCodeC005Link;

    @FindBy (xpath = "//*[@class='wcfmfa fa-power-off']")
    public WebElement logOutLink;

    @FindBy(xpath = "//label[@class='wcfmfa fa-user-times']")
    public WebElement limitLink;

    @FindBy (css = "#usage_limit")
    public WebElement usageLimitPerCouponBox;

    @FindBy(css = "#wcfm_coupon_manager_submit_button")
    public WebElement cuoponManagerSubmitButton;

    @FindBy (xpath = "//*[contains(text(),'Coupon Successfully Published.')]")
    public WebElement successfullyScriptText;

    @FindBy (css = "#limit_usage_to_x_items")
    public WebElement limitUsageToXItemsButton;

    @FindBy(css = "#usage_limit_per_user")
    public WebElement usageLimitPerUserBox;

    @FindBy(css = "span.wcfmfa.fa-user-circle")
    public WebElement customerLink;

    @FindBy(xpath = "//tbody")
    public WebElement customerTBodyTable;

    @FindBy(css = ".wcfm_dashboard_item_title")
    public List<WebElement> customerNamesText;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public List <WebElement> customerUserNamesText;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public List <WebElement> customerEmailsText;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public List <WebElement> customerLocationsText;

    @FindBy(xpath = "//tbody/tr[1]/td[6]")
    public List <WebElement> customerMoneySpentsText;

    @FindBy(xpath = "//tbody/tr[1]/td[7]")
    public List <WebElement> customerOrdersText;

    @FindBy(css = "a.dt-button:nth-child(2)")
    public WebElement pdfButton;

    @FindBy(css = "a.dt-button:nth-child(3)")
    public WebElement excelButton;

    @FindBy(css = "a.dt-button:nth-child(4)")
    public WebElement csvButton;

    @FindBy (xpath = "//*[@class='wcfmfa fa-user-plus']")
    public WebElement addNewCustomerButton;

    @FindBy(css = "#user_name")
    public WebElement userNameBox;

    @FindBy(css = "#user_email")
    public WebElement userEmailBox;

    @FindBy(css = "#first_name")
    public WebElement firstNameBox;

    @FindBy(css = "#last_name")
    public WebElement lastNameBox;

    @FindBy(css = "#wcfm_customer_submit_button")
    public WebElement customerSubmitButton;

    @FindBy(xpath = "//*[contains(text(),'Customer Successfully Saved.')]")
    public WebElement customerSuccessllyScriptText;

}
