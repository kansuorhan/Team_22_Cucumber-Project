package stepDefinitions;

import Pages.ZelihaPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US014_StepDefinition {

    ZelihaPage zelihaPage = new ZelihaPage();


    @Given("Vendor Add Coupon sayfasinda")
    public void vendor_add_coupon_sayfasinda() {
        Assert.assertTrue(zelihaPage.addCouponSayfaDogrulama.isDisplayed());
    }
    @Given("Vendor US_{int} deki TC adimlarini tamamlar")
    public void vendor_us_deki_tc_adimlarini_tamamlar(Integer int1) throws IOException {

        US013_StepDefinition us013 = new US013_StepDefinition();

        us013.vendor_code_blogunun_gorunur_oldugunu_test_eder();
        us013.vendor_code_bloguna_kod_yazar();
        us013.vendorDescriptionButonununErisilebilirOldugunuTestEder();
        us013.vendorDescpriptionKisminiDoldurur();
        us013.vendor_discount_type_acilir_menusunun_gorunur_oldugunu_test_eder();
        us013.vendorAcilirMenudenSecimYapar();
        us013.vendorCouponAmountBlogununGorunurOldugunuTestEder();
        us013.vendorCouponAmountDegeriniGirebilmeli();
        us013.vendorCouponExpiryDateKisminaTiklayincaDateKutusununGorunurOldugunuTestEder();
        us013.vendorCouponExpiryDateBlogunaTarihGirebilmeli();
        us013.vendorallowFreeShippingCheckboxGorunurOldugunuTestEder();
        us013.vendorAllowFreeShippingCheckboxTiklar();
        us013.vendorShowOnStoreCheckboxGorunurOldugunuTestEder();
        us013.vendorShowOnStoreCheckboxTiklar();

    }
    @Given("Vendor Minimum Spend blogunun gorunur oldugunu test eder")
    public void vendor_minimum_spend_blogunun_gorunur_oldugunu_test_eder() {
        JavascriptExecutor jsx = (JavascriptExecutor) Driver.getDriver();
        jsx.executeScript("window.scrollBy(0,650)", "");

        Assert.assertTrue(zelihaPage.minimumAmountBox.isDisplayed());

    }
    @Given("Vendor Minimum Spend bloguna bir deger girer")
    public void vendor_minimum_spend_bloguna_bir_deger_girer() {
        zelihaPage.minimumAmountBox.sendKeys(ReusableMethods.getFaker().number().digits(2));

    }

    @Given("Vendor Maximum Spend blogunun gorunur oldugunu test eder")
    public void vendor_maximum_spend_blogunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.jsScroll(zelihaPage.maximumAmountBox);
        Assert.assertTrue(zelihaPage.maximumAmountBox.isDisplayed());

    }
    @Given("Vendor Maximum Spend bloguna bir deger girer")
    public void vendor_maximum_spend_bloguna_bir_deger_girer() {
        zelihaPage.maximumAmountBox.sendKeys(ReusableMethods.getFaker().number().digits(3));


    }

    @Given("Vendor Individual use only checkbox kutusunun gorunur oldugunu test eder")
    public void vendor_individual_use_only_checkbox_kutusunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.jsScroll(zelihaPage.individualUseOnlyBox);
        Assert.assertTrue(zelihaPage.individualUseOnlyBox.isDisplayed());

    }
    @Given("Vendor  Individual use only checkbox kutusu tiklar")
    public void vendor_individual_use_only_checkbox_kutusu_tiklar() {
        zelihaPage.individualUseOnlyBox.click();

    }

    @Given("Vendor Exclude sale items checkbox kutusunun gorunur oldugunu test eder")
    public void vendor_exclude_sale_items_checkbox_kutusunun_gorunur_oldugunu_test_eder() {
        ReusableMethods.jsScroll(zelihaPage.excludeSaleItemsBox);
        Assert.assertTrue(zelihaPage.excludeSaleItemsBox.isDisplayed());

    }
    @Given("Vendor  Exclude sale items checkbox kutusu tiklar")
    public void vendor_exclude_sale_items_checkbox_kutusu_tiklar() {
        zelihaPage.excludeSaleItemsBox.click();
    }

    @Given("Vendor Exclude categories acilir menusunun gorunurlugunu test eder")
    public void vendor_exclude_categories_acilir_menusunun_gorunurlugunu_test_eder() {
        ReusableMethods.jsScroll(zelihaPage.excludeCategoriess);
        Assert.assertTrue(zelihaPage.excludeCategoriess.isDisplayed());


    }
    @Given("Vendor Exclude categories acilir menuden secim yapar")
    public void vendor_exclude_categories_acilir_menuden_secim_yapar() {
        try {
            zelihaPage.excludeCategoriess.click();
            ReusableMethods.jsScrollClick(zelihaPage.accessories);
        } catch (Exception e) {
            ReusableMethods.jsScrollClick(zelihaPage.accessories);
        }


    }


}
