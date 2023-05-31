package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;

public class HMCStepDefinitions {

    HotelMyCampPage hmcPage = new HotelMyCampPage();

    @Then("Login yazisina tiklar")
    public void logInYazisinaTiklar() {
        hmcPage.loginLink.click();
    }

    @And("gecerli username girer")
    public void gecerliUsernameGirer() {
        hmcPage.userName.sendKeys(ConfigReader.getProperty("HMCValidUser"));
    }

    @And("gecerli password girer")
    public void gecerliPasswordGirer() {
      hmcPage.passWord.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
      hmcPage.loginButton.click();
    }

    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfayaGirisYaptiginiKontrolEder() {
      Assert.assertTrue(hmcPage.hotelManagement.isDisplayed());
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.passWord.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(hmcPage.loginButton.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.userName.sendKeys(ConfigReader.getProperty("HMCWrongUser"));
    }

    @And("gecersiz kullanici {string} girer")
    public void gecersiz_kullanici_girer(String userName) {
        hmcPage.userName.sendKeys(userName);
    }

    @And("gecersiz parola {string} girer")
    public void gecersiz_parola_girer(String parola) {
        hmcPage.passWord.sendKeys(parola);
    }
}
