package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {

    AmazonPage amazonPage = new AmazonPage();
    @Given("kullanici amazon anasayfasina gider")
    public void kullaniciAmazonAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String expectedWord="Nutella";
        String actualWord=amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("Selenium" + Keys.ENTER);
    }

    @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() {
        String expectedWord="Selenium";
        String actualWord=amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String expectedWord="iphone";
        String actualWord=amazonPage.searchResultWE.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String searchWord) {
        amazonPage.searchBox.sendKeys(searchWord,Keys.ENTER);
    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arg0) {
    }
}
