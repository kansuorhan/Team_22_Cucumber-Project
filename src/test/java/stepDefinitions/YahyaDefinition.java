package stepDefinitions;

import Pages.YahyaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class YahyaDefinition {
    List<String> list;

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    YahyaPage obj = new YahyaPage();

    @Given("Belirtilen URL'e gidilir.")
    public void belirtilenURLEGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
    }

    @Then("Sign in  tiklanir")
    public void signInTiklanir() {
        obj.signInButton.click();
    }

    @Then("Username or email address box'a gecerli email gonderilir")
    public void usernameOrEmailAddressBoxAGecerliEmailGonderilir() {
        obj.emailAdres.sendKeys(ConfigReader.getProperty("validEmail"));
    }
    @Then("passwords box'a gecerli password gonderilir")
    public void passwordsBoxAGecerliPasswordGonderilir() {
        obj.Password.sendKeys(ConfigReader.getProperty("validSifre"));
    }

    @Then("sign in submit buttonuna tiklanir")
    public void signInSubmitButtonunaTiklanir() {
        obj.signIn2.click();

    }
    @Then("Sign Out buttonuna tiklanir")
    public void signOutButtonunaTiklanir() {
        obj.signOut.click();
    }


    @Then("Orders'a tikladiktan sonra acilan sayfada Go Shopa tiklar")
    public void ordersATikladiktanSonraAcilanSayfadaGoShopaTiklar() throws InterruptedException {
        obj.Orders.click();
        jse.executeScript("arguments[0].scrollIntoView(true);", obj.GoShopButtonu);
        jse.executeScript("arguments[0].click();", obj.GoShopButtonu);
    }

    @And("Shop yazisini text olarak gorunurlugunu dogrular")
    public void shopYazisiniTextOlarakGorunurlugunuDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(obj.ShopText.isDisplayed());
    }


    @Then("Orders'a tikladiktan sonra acilan sayfada sepete rastgele {int} urun eklenir")
    public void ordersATikladiktanSonraAcilanSayfadaSepeteRastgeleUrunEklenir(int arg0) throws InterruptedException {
        obj.Orders.click();
        jse.executeScript("arguments[0].scrollIntoView(true);", obj.GoShopButtonu);
        jse.executeScript("arguments[0].click();", obj.GoShopButtonu);

        list = new ArrayList<>();
        for (WebElement w : obj.liste) {
            list.add(w.getText());

        }
        list.forEach(System.out::println);

    }

    @And("Sepete eklenen urun sayisi teyit edilir")
    public void sepeteEklenenUrunSayisiTeyitEdilir() {

    }

    @Then("Ana sayfadaki Add Cart buttonuna tiklanir")
    public void anaSayfadakiAddCartButtonunaTiklanir() {
    }

    @Then("Add cart butonunda acilan Pop Up ta View Cart butununa tiklanir")
    public void addCartButonundaAcilanPopUpTaViewCartButununaTiklanir() {

    }

    @And("Checkout sayfasinda oldugumuz dogrulanir")
    public void checkoutSayfasindaOldugumuzDogrulanir() {


    }


    @Then("Ana sayfadaki Add Cart buttonuna tiklanirr")
    public void anaSayfadakiAddCartButtonunaTiklanirr() {

    }

    @Then("Add cart butonunda acilan Pop Up ta View Cart butonuna tiklanirr")
    public void addCartButonundaAcilanPopUpTaViewCartButonunaTiklanirr() {

    }

    @Then("View cart butonuna basdiktan sonra acilan sayfada Checkout'a gidilir")
    public void viewCartButonunaBasdiktanSonraAcilanSayfadaCheckoutAGidilir() {

    }

    @Then("Billing Details bilgileri doldurulur")
    public void billingDetailsBilgileriDoldurulur() {

    }

    @Then("Billing'e girilen bilgilerin goruldugu teyit edilir")
    public void billingEGirilenBilgilerinGorulduguTeyitEdilir() {

    }

    @Then("Ayni sayfadaki Place Order butonuna basilir")
    public void ayniSayfadakiPlaceOrderButonunaBasilir() {
    }

    @And("Thank you. Your order has been received.\" yazisinin goruldugu teyit edilir")
    public void thankYouYourOrderHasBeenReceivedYazisininGorulduguTeyitEdilir() throws Throwable {

    }


    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }
}
