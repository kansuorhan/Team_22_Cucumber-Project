package stepDefinitions;

import Pages.OrhanPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class OrhanStepDefinition {
    OrhanPages orhanPage = new OrhanPages();

    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Given("Belirtilen {string} e gidilir")
    public void belirtilenEGidilir(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @Then("Sign In butonuna tiklanir")
    public void signInButonunaTiklanir() {
        orhanPage.anaSayfaSignInLink.click();
    }

    @Then("Kullanici {string} ve {string} bilgileri girilir")
    public void kullaniciVeBilgileriGirilir(String arg0, String arg1) {
        orhanPage.signInUsernameBox.sendKeys(ConfigReader.getProperty(arg0));
        orhanPage.signInPasswordBox.sendKeys(ConfigReader.getProperty(arg1));
        orhanPage.signInButton.click();
    }


    @When("My Account a tiklanir")
    public void myAccountATiklanir() {
        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitFor(3);
        jse.executeScript("arguments[0].scrollIntoView(true);",orhanPage.myAccountButton);
        jse.executeScript("arguments[0].click();",orhanPage.myAccountButton);

    }

    @When("Store Manager a tiklanir")
    public void storeManagerATiklanir() {
        orhanPage.storeManagerLink.click();
    }

    @And("Coupons basligina tiklanir")
    public void couponsBasliginaTiklanir() {
        orhanPage.cuponsLink.click();
    }

    @And("Istenen coupon tiklanir")
    public void ıstenenCouponTiklanir() {
        orhanPage.couponCodeC005Link.click();
    }


    @Given("Limit sekmesine tiklanir")
    public void limitSekmesineTiklanir() {
        jse.executeScript("arguments[0].scrollIntoView(true);",orhanPage.logOutLink);
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).perform();
        ReusableMethods.waitForVisibility(orhanPage.limitLink,1000);
        jse.executeScript("arguments[0].click();",orhanPage.limitLink);
    }

    @Then("Usage limit per coupon kutusuna {string} miktar yazilir")
    public void usageLimitPerCouponKutusunaMiktarYazilir(String arg0) {
        orhanPage.usageLimitPerCouponBox.clear();
        orhanPage.usageLimitPerCouponBox.sendKeys(arg0);
    }

    @When("Submit butonuna basilir")
    public void submitButonunaBasilir() {
        jse.executeScript("arguments[0].scrollIntoView(true);",orhanPage.cuoponManagerSubmitButton);
        ReusableMethods.waitForVisibility(orhanPage.cuoponManagerSubmitButton,1000);
        jse.executeScript("arguments[0].click();",orhanPage.cuoponManagerSubmitButton);
    }

    @And("Submit oldugu test edilir")
    public void submitOlduguTestEdilir() {
        ReusableMethods.waitForVisibility(orhanPage.successfullyScriptText,1500);
        String expectedText ="Coupon Successfully Published.";
        Assert.assertEquals(orhanPage.successfullyScriptText.getText(),expectedText);
    }

    @Then("Limit usage to X items kutusuna {string} miktar yazilir")
    public void limitUsageToXItemsKutusunaMiktarYazilir(String arg0) {
        orhanPage.limitUsageToXItemsButton.clear();
        orhanPage.limitUsageToXItemsButton.sendKeys(arg0);
        ReusableMethods.waitFor(2);
    }

    @Then("Usage limit per user kutusuna {string} miktar yazilir")
    public void usageLimitPerUserKutusunaMiktarYazilir(String arg0) {
        ReusableMethods.waitFor(3);
        orhanPage.usageLimitPerUserBox.clear();
        orhanPage.usageLimitPerUserBox.sendKeys(arg0);
    }

    @And("Sayfa kapatilir")
    public void sayfaKapatilir() {
        Driver.getDriver().close();
    }
}
