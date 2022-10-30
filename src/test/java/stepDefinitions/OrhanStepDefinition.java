package stepDefinitions;

import Pages.OrhanPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class OrhanStepDefinition {
    OrhanPages orhanPage = new OrhanPages();
    @Given("Belirtilen {string} e gidilir")
    public void belirtilenEGidilir(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty(arg0));
    }

    @Then("Sign In butonuna tiklanir")
    public void signInButonunaTiklanir() {
        orhanPage.anaSayfaSignInLink.click();
    }

    @Then("Kullanici bilgileri girilir")
    public void kullaniciBilgileriGirilir() {
    }

    @When("My Account a tiklanir")
    public void myAccountATiklanir() {
    }

    @When("Store Manager a tiklanir")
    public void storeManagerATiklanir() {
    }

    @And("Coupons basligina tiklanir")
    public void couponsBasliginaTiklanir() {
    }

    @And("Istenen coupon tiklanir")
    public void ıstenenCouponTiklanir() {
    }
}
