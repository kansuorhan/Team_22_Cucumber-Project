package stepDefinitions;

import Pages.ZelihaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import methods.Login;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US013_StepDefinition {

    ZelihaPage zelihaPage = new ZelihaPage();

    @Given("Vendor {string} sayfasina gider")
    public void vendor_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
    }
    @Given("Vendor olarak login yapar")
    public void vendor_olarak_login_yapar() {
        Login.login();
    }
    @Then("Vendor My Account butonunun gorunur oldugunu test eder")
    public void vendor_my_account_butonunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.waitForClickablility(zelihaPage.myAcount,5);
        ReusableMethods.jsScroll(zelihaPage.myAcount);
        Assert.assertTrue(zelihaPage.myAcount.isDisplayed());
    }
    @Then("Vendor My Account butonuna tiklar")
    public void vendor_my_account_butonuna_tiklar() {
        ReusableMethods.jsScrollClick(zelihaPage.myAcount);
    }
    @Then("Vendor Store Manager butonunun gorunur oldugunu test eder")
    public void vendor_store_manager_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(zelihaPage.storeManager.isDisplayed());
    }
    @Then("Vendor Store Manager butonuna tiklar")
    public void vendor_store_manager_butonuna_tiklar() {
        zelihaPage.storeManager.click();
    }
    @Then("Vendor Coupons butonunun gorunur oldugunu test eder")
    public void vendor_coupons_butonunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.jsScroll(zelihaPage.couponsButton);
        Assert.assertTrue(zelihaPage.couponsButton.isDisplayed());
    }
    @Then("Vendor Coupons butonuna tiklar")
    public void vendor_coupons_butonuna_tiklar() {
        zelihaPage.couponsButton.sendKeys(Keys.ENTER);
    }
    @Then("Vendor Add New butonunun gorunur oldugunu test eder")
    public void vendor_add_new_butonunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(zelihaPage.addNewButton.isDisplayed());
    }
    @Then("Vendor Add New butonuna tiklar")
    public void vendor_add_new_butonuna_tiklar() {
        zelihaPage.addNewButton.sendKeys(Keys.ENTER);
    }
    @Then("Vendor Code blogunun gorunur oldugunu test eder")
    public void vendor_code_blogunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.jsScroll(zelihaPage.addCoupon);
        Assert.assertTrue(zelihaPage.codeBox.isDisplayed());
    }
    @Then("Vendor Code bloguna kod yazar")
    public void vendor_code_bloguna_kod_yazar() {
        zelihaPage.codeBox.sendKeys(ReusableMethods.getFaker().number().digits(8));
    }


    @Then("Vendor Description butonunun erisilebilir oldugunu test eder")
    public void vendorDescriptionButonununErisilebilirOldugunuTestEder() {
        Assert.assertTrue(zelihaPage.descriptionBox.isDisplayed());
    }

    @And("Vendor Descpription kismini doldurur")
    public void vendorDescpriptionKisminiDoldurur() {

        zelihaPage.descriptionBox.sendKeys("Lucky coupon");
    }

    @Then("Vendor DiscountType acilir menusunun gorunur oldugunu test eder")
    public void vendor_discount_type_acilir_menusunun_gorunur_oldugunu_test_eder() {
        Assert.assertTrue(zelihaPage.discountTypeBox.isDisplayed());
    }

    @And("Vendor acilir menuden secim yapar")
    public void vendorAcilirMenudenSecimYapar() {
        ReusableMethods.select(zelihaPage.discountTypeBox).selectByVisibleText("Fixed Product Discount");
    }

    @Then("Vendor Coupon amount blogunun gorunur oldugunu test eder")
    public void vendorCouponAmountBlogununGorunurOldugunuTestEder() {
        Assert.assertTrue(zelihaPage.couponAmountBox.isDisplayed());
    }

    @And("Vendor Coupon amount degerini girebilmeli")
    public void vendorCouponAmountDegeriniGirebilmeli() {
        zelihaPage.couponAmountBox.clear();
        zelihaPage.couponAmountBox.sendKeys(ReusableMethods.getFaker().number().digits(3));
    }

    @Then("Vendor CouponExpiryDate kismina tiklayinca date kutusunun gorunur oldugunu test eder")
    public void vendorCouponExpiryDateKisminaTiklayincaDateKutusununGorunurOldugunuTestEder() {
        ReusableMethods.jsScroll(zelihaPage.couponExpiryDate);
        ReusableMethods.waitForClickablility(zelihaPage.couponExpiryDate,3000);
        ReusableMethods.jsScrollClick(zelihaPage.couponExpiryDate);
        Assert.assertTrue(zelihaPage.couponDateBox.isDisplayed());
    }

    @And("Vendor CouponExpiryDate bloguna tarih girebilmeli")
    public void vendorCouponExpiryDateBlogunaTarihGirebilmeli() {
        ReusableMethods.jsScrollClick(zelihaPage.couponExpiryDate);
        ReusableMethods.getActions()
                .dragAndDrop(zelihaPage.couponExpiryDate,zelihaPage.couponMonth)
                .click(zelihaPage.couponMonth).perform();
        ReusableMethods.select(zelihaPage.couponMonth).selectByVisibleText("Dec");

        ReusableMethods.getActions()
                .dragAndDrop(zelihaPage.couponMonth,zelihaPage.couponYear)
                .click(zelihaPage.couponYear).perform();
        ReusableMethods.select(zelihaPage.couponYear).selectByVisibleText("2022");
        zelihaPage.couponYear.click();

        for (WebElement dayElement : zelihaPage.couponDay) {
            String text = dayElement.getText();
            if (text.equals("23")){
                ReusableMethods.jsScrollClick(dayElement);
                break;
            }
        }

    }

    @And("VendorAllow Free Shipping checkbox gorunur oldugunu test eder")
    public void vendorallowFreeShippingCheckboxGorunurOldugunuTestEder() {
        Assert.assertTrue(zelihaPage.allowFreeShipping.isDisplayed());
    }

    @And("Vendor Allow Free Shipping checkbox tiklar")
    public void vendorAllowFreeShippingCheckboxTiklar() {
        ReusableMethods.jsScroll(zelihaPage.allowFreeShipping);
        ReusableMethods.waitForClickablility(zelihaPage.allowFreeShipping,3000);
        zelihaPage.allowFreeShipping.click();
    }

    @Then("Vendor Show on Store checkbox gorunur oldugunu test eder")
    public void vendorShowOnStoreCheckboxGorunurOldugunuTestEder() {
        Assert.assertTrue(zelihaPage.showOnStore.isDisplayed());

    }

    @And("Vendor Show on Store checkbox tiklar")
    public void vendorShowOnStoreCheckboxTiklar() {

        ReusableMethods.jsScrollClick(zelihaPage.showOnStore);
    }

    @Then("Vendor tum bilgilerin dolduruldugunu kontrol eder")
    public void vendorTumBilgilerinDolduruldugunuKontrolEder() throws IOException {
        ReusableMethods.getScreenshot("Tum sayfa screenshoot");
    }

    @Then("Vendor Submit butonunun gorunur oldugunu test eder")
    public void vendorSubmitButonununGorunurOldugunuTestEder() {
        ReusableMethods.jsScroll(zelihaPage.submitButton);
        Assert.assertTrue(zelihaPage.submitButton.isDisplayed());
    }

    @And("Vendor Submit butonuna tiklar")
    public void vendorSubmitButonunaTiklar() {
        zelihaPage.submitButton.sendKeys(Keys.ENTER);
    }

    @Then("Vendor Coupon Successfully Published. yazisinin cıktigini dogrular")
    public void vendorCouponSuccessfullyPublishedYazisininCiktiginiDogrular() throws IOException {
        ReusableMethods.waitForVisibility(zelihaPage.couponSuccessfullyPublish,5);
        Assert.assertTrue(zelihaPage.couponSuccessfullyPublish.isDisplayed());

        try {
            ReusableMethods.waitForVisibility(zelihaPage.couponSuccessfullyPublish,5);
        } catch (Exception e) {
            ReusableMethods.getScreenshotWebElement("US_0013_Coupon Successfully Published.",zelihaPage.couponSuccessfullyPublish);
        }

        ReusableMethods.getScreenshotWebElement("US_0013_Coupon Successfully Published.",zelihaPage.couponSuccessfullyPublish);
        ReusableMethods.waitForVisibility(zelihaPage.draftButton,5);
    }

    @And("Vendor Draft butonunun gorunur oldugunu dogrular")
    public void vendorDraftButonununGorunurOldugunuDogrular() {
        ReusableMethods.jsScroll(zelihaPage.draftButton);
        Assert.assertTrue(zelihaPage.draftButton.isDisplayed());
    }

    @And("Vendor Draft butonuna tiklar")
    public void vendorDraftButonunaTiklar() {
        ReusableMethods.jsScroll(zelihaPage.draftButton);
        zelihaPage.draftButton.sendKeys(Keys.ENTER);
    }

    @Then("Vendor Coupon Successfully Saved. yazisinin gorunur oldugunu dogrular")
    public void vendor_coupon_successfully_saved_yazisinin_gorunur_oldugunu_dogrular() throws IOException {
        ReusableMethods.waitForVisibility(zelihaPage.couponSuccessfullySaved,5);
        Assert.assertTrue(zelihaPage.couponSuccessfullySaved.isDisplayed());
        ReusableMethods.getScreenshotWebElement("US_0013_Coupon Successfully Saved.",zelihaPage.couponSuccessfullySaved);
    }
    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
