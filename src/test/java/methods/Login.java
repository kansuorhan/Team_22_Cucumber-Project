package methods;

import Pages.ZelihaPage;

import utilities.ConfigReader;
import utilities.Driver;

public class Login {

    static ZelihaPage page;

    public static void login() {

        page = new ZelihaPage();
        Driver.getDriver().get(ConfigReader.getProperty("projeUrl"));
        page.ilkSignIn.click();
        page.emailBox.sendKeys(ConfigReader.getProperty("projeEmail"));
        page.passwordBox.sendKeys(ConfigReader.getProperty("projePassword"));
        page.ikinciSignIn.click();
    }
}
