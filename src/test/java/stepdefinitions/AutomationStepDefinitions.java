package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationStepDefinitions {
    AutomationPage automationPage = new AutomationPage();
    Faker faker = new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        automationPage.singInButton.click();
    }

    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        automationPage.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationPage.createAccountButton.click();
    }

    @Given("kullanici kayit icin gerekli bilgileri girer")
    public void kullanici_kayit_icin_gerekli_bilgileri_girer()  {

        Actions actions = new Actions(Driver.getDriver());

        actions.click(automationPage.gender)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("18")
                .sendKeys(Keys.TAB)
                .sendKeys("March")
                .sendKeys(Keys.TAB)
                .sendKeys("1977")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).perform();



    }

    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(automationPage.registerButton).perform();
    }

    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        Assert.assertTrue(automationPage.positiveResultText.isDisplayed());
    }

    @And("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void emailKutusunaIsaretiOlmayanEmailAdresiYazarVeEnterATiklar() {
        automationPage.textBoxEmailSignIn.sendKeys(ConfigReader.getProperty("wrongMailAutomation"));
        //automationPage.singInButton.click();
        automationPage.btnSubmit.click();
    }

    @Then("error mesajinin invalid email address oldugunu dogrulayin")
    public void error_mesajinin_invalid_email_address_oldugunu_dogrulayin()  {
        Assert.assertTrue(automationPage.negativeResultText.isDisplayed());
    }
}
