package stepDefinitions;

import Pages.TarikPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;

public class TarikDefinition {

    TarikPage tarikObje = new TarikPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Then("ana sayfanin gorundugu dogrulanir")
    public void anaSayfaninGorunduguDogrulanir() {
        String expectedUrl = "https://allovercommerce.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @And("sing in butonuna tiklanir")
    public void singInButonunaTiklanir() {
        tarikObje.ilkSayfaSignInLink.click();
    }

    @And("email ve password girisi yapmak icin textboxlarin acildigi dogrulanir")
    public void emailVePasswordGirisiYapmakIcinTextboxlarinAcildigiDogrulanir() {
        wait.until(ExpectedConditions.visibilityOf(tarikObje.signInMailBox));
        wait.until(ExpectedConditions.visibilityOf(tarikObje.signInPasswordBox));
        Assert.assertTrue(tarikObje.signInMailBox.isDisplayed());
        Assert.assertTrue(tarikObje.signInPasswordBox.isDisplayed());
    }

    @And("ilgili kisimlara gecerli email ve sifre girildikten sonra sign in butonuna tiklanir")
    public void ilgiliKisimlaraGecerliEmailVeSifreGirildiktenSonraSignInButonunaTiklanir() {
        tarikObje.signInMailBox.sendKeys(ConfigReader.getProperty("validEmail"));
        tarikObje.signInPasswordBox.sendKeys(ConfigReader.getProperty("validSifre"));
        tarikObje.signInOnayButton.click();
    }

    @And("basariyla giris yapildigi dogrulanir")
    public void basariylaGirisYapildigiDogrulanir() {
        Assert.assertTrue(tarikObje.signOutLink.isDisplayed());
    }

    @And("sag ust taraftaki sing out secenegine tiklanir")
    public void sagUstTaraftakiSingOutSecenegineTiklanir() {
        tarikObje.signOutLink.click();
    }

    @And("acilan sayfada store manager secenegine tiklanir")
    public void acilanSayfadaStoreManagerSecenegineTiklanir() {
        tarikObje.storeManagerLink.click();
    }

    @And("store manager penceresindeyken followers sekmesine tiklanir")
    public void storeManagerPenceresindeykenFollowersSekmesineTiklanir() {
        jse.executeScript("arguments[0].scrollIntoView(true);", tarikObje.followersLink);
        jse.executeScript("arguments[0].click();", tarikObje.followersLink);
    }

    @Then("isimlerin ve epostalarin follower list basligi altinda tanimlandigi dogrulanir")
    public void isimlerinVeEpostalarinFollowerListBasligiAltindaTanimlandigiDogrulanir() {
        Assert.assertTrue(tarikObje.notDataText.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait.until(ExpectedConditions.visibilityOf(tarikObje.takipciListesiEkranGoruntusu));
        try {
            ReusableMethods.getScreenshotWebElement("takipciListesi", tarikObje.takipciListesiEkranGoruntusu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("islemlerin actions basligi altinda tanimlandigi dogrulanir")
    public void islemlerinActionsBasligiAltindaTanimlandigiDogrulanir() {
        Assert.assertTrue(tarikObje.dataTableEmpty.isDisplayed());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        wait.until(ExpectedConditions.visibilityOf(tarikObje.takipciListesiEkranGoruntusu));
        try {
            ReusableMethods.getScreenshotWebElement("takipciListesi", tarikObje.takipciListesiEkranGoruntusu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @And("store manager penceresindeyken reviews sekmesine tiklanir")
    public void storeManagerPenceresindeykenReviewsSekmesineTiklanir() {
        jse.executeScript("arguments[0].scrollIntoView(true);", tarikObje.reviewsLink);
        jse.executeScript("arguments[0].click();", tarikObje.reviewsLink);
    }

    @And("acilan ekranda product reviews butonuna tiklanir")
    public void acilanEkrandaProductReviewsButonunaTiklanir() {
        tarikObje.productReviewsLink.click();
    }

    @Then("author ve comment sekmelerinin altinda kullanici bilgisinin ve yorum iceriginin goruntulendigi dogrulanir")
    public void authorVeCommentSekmelerininAltindaKullaniciBilgisininVeYorumIcerigininGoruntulendigiDogrulanir() {

        jse.executeScript("arguments[0].scrollIntoView(true);", tarikObje.kullaniciBilgisiText);
        //jse.executeScript("arguments[0].click();", tarikObje.reviewsLink);
        Assert.assertTrue(tarikObje.kullaniciBilgisiText.isDisplayed());
        Assert.assertTrue(tarikObje.yorumIcerigiText.isDisplayed());
    }

    @Then("Rating sekmesi altinda puanlamanin Dated sekmesi altinda da tarihin goruntulendigi dogrulanir")
    public void ratingSekmesiAltindaPuanlamaninDatedSekmesiAltindaDaTarihinGoruntulendigiDogrulanir() {
        Assert.assertTrue(tarikObje.ratingText.isDisplayed());
        Assert.assertTrue(tarikObje.datedText.isDisplayed());
    }

    @And("store manager penceresindeyken reports sekmesine tiklanir")
    public void storeManagerPenceresindeykenReportsSekmesineTiklanir() {
        jse.executeScript("arguments[0].scrollIntoView(true);", tarikObje.reportsLink);
        jse.executeScript("arguments[0].click();", tarikObje.reportsLink);
    }

    @Then("Year sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir")
    public void yearSekmesineTiklanirVeIlgiliRaporunGorunduguDogrulanir() {
        tarikObje.yearLink.click();
        Assert.assertTrue(tarikObje.rapor.isDisplayed());
    }

    @Then("Last Month sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir")
    public void lastMonthSekmesineTiklanirVeIlgiliRaporunGorunduguDogrulanir() {
        tarikObje.lastMonthLink.click();
        Assert.assertTrue(tarikObje.rapor.isDisplayed());
    }

    @Then("This Month sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir")
    public void thisMonthSekmesineTiklanirVeIlgiliRaporunGorunduguDogrulanir() {
        tarikObje.thisMonthLink.click();
        Assert.assertTrue(tarikObje.rapor.isDisplayed());
    }

    @Then("Last Seven Days sekmesine tiklanir ve ilgili raporun gorundugu dogrulanir")
    public void lastSevenDaysSekmesineTiklanirVeIlgiliRaporunGorunduguDogrulanir() {
        tarikObje.last7DaysLink.click();
        Assert.assertTrue(tarikObje.rapor.isDisplayed());
    }

    @Then("Custom kutucugundan ozel bir tarih araligi secilebildigi dogrulanir")
    public void customKutucugundanOzelBirTarihAraligiSecilebildigiDogrulanir() {
        tarikObje.customBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tarikObje.gunler.get(15).click();
        tarikObje.gunler.get(25).click();
        tarikObje.customBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(tarikObje.seciliGunlerText.isDisplayed());
    }

    @Then("Secilen tarih araliginin raporunun goruntulendigi dogrulanir")
    public void secilenTarihAraligininRaporununGoruntulendigiDogrulanir() {
        tarikObje.customBox.click();
        wait.until(ExpectedConditions.visibilityOf(tarikObje.takvim));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        tarikObje.gunler.get(15).click();
        tarikObje.gunler.get(25).click();
        tarikObje.customBox.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(tarikObje.rapor.isDisplayed());
    }


}