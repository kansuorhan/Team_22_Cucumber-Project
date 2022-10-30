package stepDefinitions;

import Pages.AbbasPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class AbbasDefinition {

    AbbasPage abbasPage=new AbbasPage();
    JavascriptExecutor executor=(JavascriptExecutor) Driver.getDriver();

    Actions actions=new Actions(Driver.getDriver());

    @Given("Belirtilen URL'e gidilir")
    public void belirtilen_url_e_gidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("alloverUrl"));
    }
    @Then("Sing In butonuna tiklanir")
    public void sing_in_butonuna_tiklanir() {
        executor.executeScript("arguments[0].click();",abbasPage.ilkSayfaSignInLink);

    }
    @Then("E-mail ve password girisi yapmak icin textbox'larin acildigi dogrulanir")
    public void e_mail_ve_password_girisi_yapmak_icin_textbox_larin_acildigi_dogrulanir() {
ReusableMethods.waitFor(2);
        Assert.assertTrue(abbasPage.signInUsernameBox.isDisplayed());
    }
    @Then("Acilan pencerede gecerli e-mail ve sifre girildikten sonra Sign In butonuna tiklanir")
    public void acilan_pencerede_gecerli_e_mail_ve_sifre_girildikten_sonra_sign_in_butonuna_tiklanir() {
       abbasPage.signInUsernameBox.sendKeys(ConfigReader.getProperty("validEmail"));
       abbasPage.signInPasswordBox.sendKeys(ConfigReader.getProperty("validSifre"));
        abbasPage.signInButton.sendKeys(Keys.ENTER);
    }
    @Then("Basariyla giris yapildigi dogrulanir")
    public void basariyla_giris_yapildigi_dogrulanir() {
        Assert.assertTrue(abbasPage.signOut.isDisplayed());
    }
    @Then("Sayfanin en altinda bulunan My Account'a tiklanir")
    public void sayfanin_en_altinda_bulunan_my_account_a_tiklanir() {
        executor.executeScript("arguments[0].scrollIntoView(true)",abbasPage.myAccountButonu);
        ReusableMethods.waitFor(3);
        executor.executeScript("arguments[0].click();",abbasPage.myAccountButonu);

    }
    @Then("Acilan sayfada Store Manager secenegine tiklanir")
    public void acilan_sayfada_store_manager_secenegine_tiklanir() {
        executor.executeScript("arguments[0].click();",abbasPage.storeManager);
    }
    @Then("Store Manager penceresindeyken Products sekmesine tiklanir")
    public void store_manager_penceresindeyken_products_sekmesine_tiklanir() {
        executor.executeScript("arguments[0].click();",abbasPage.products);
    }
    @Then("Sag ust kosede bulunan Add New butonuna tiklanir")
    public void sag_ust_kosede_bulunan_add_new_butonuna_tiklanir() {
        executor.executeScript("arguments[0].scrollIntoView(true);",abbasPage.addNewButton);
        ReusableMethods.waitFor(2);
        executor.executeScript("arguments[0].click();",abbasPage.addNewButton);
    }
    @Then("Acilan sayfanin Add Product sayfasi oldugu dogrulanir")
    public void acilan_sayfanin_add_product_sayfasi_oldugu_dogrulanir() {
        Assert.assertTrue(abbasPage.addProductText.isDisplayed());
    }
    @Then("Acilan sayfada sol altta bulunan listede Shipping kismi tiklanir")
    public void acilan_sayfada_sol_altta_bulunan_listede_shipping_kismi_tiklanir() {
        executor.executeScript("arguments[0].scrollIntoView(true);",abbasPage.attributes);
        executor.executeScript("arguments[0].click()",abbasPage.attributes);
        ReusableMethods.waitFor(2);
        executor.executeScript("arguments[0].click()",abbasPage.attributesSizeArrowButton);
    }
    @Then("Acilan pencerede urunun rengi secilebilmeli birden fazla")
    public void acilan_pencerede_urunun_rengi_secilebilmeli_birden_fazla() {
        ReusableMethods.selectObjectMenu(abbasPage.attributesSize);


        ReusableMethods.waitFor(2);
        try {
            ReusableMethods.getScreenshot("US-010-TC001");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
 /*   @Then("Acilan pencerede urunun boyutu secilebilmeli birden fazla")
    public void acilan_pencerede_urunun_boyutu_secilebilmeli_birden_fazla() {
        executor.executeScript("arguments[0].click()",abbasPage.attributes);
        executor.executeScript("arguments[0].click()",abbasPage.attributesSizeArrowButton);
        ReusableMethods.selectObjectMenu(abbasPage.attributesSize);


        ReusableMethods.waitFor(2);

        try {
            ReusableMethods.getScreenshot("US010_TC_02");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
*/
}
