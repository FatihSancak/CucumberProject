package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        dataTablesPage.newButton.click();
    }

    @Then("isim bolumune {string} yazar")
    public void isim_bolumune_yazar(String isim) {
        dataTablesPage.firstName.sendKeys(isim);
    }

    @Then("soyisim bolumune {string} yazar")
    public void soyisim_bolumune_yazar(String soyisim) {
        dataTablesPage.lastName.sendKeys(soyisim);
    }

    @Then("pozisyon bolumune {string} yazar")
    public void pozisyon_bolumune_yazar(String pozisyon) {
        dataTablesPage.position.sendKeys(pozisyon);
    }

    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String ofis) {
        dataTablesPage.office.sendKeys(ofis);

    }

    @Then("extension bolumune {string} yazar")
    public void extension_bolumune_yazar(String extension) {
        dataTablesPage.extension.sendKeys(extension);

    }

    @Then("Start Date bolumune {string} yazar")
    public void staart_date_bolumune_yazar(String baslamaTarihi) {
        dataTablesPage.startDate.sendKeys(baslamaTarihi);
    }

    @Then("Salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Then("create tusuna basar")
    public void create_tusuna_basar() {
        dataTablesPage.createButton.click();
    }


    @When("Isim Ara : {string} ismini aratir")
    public void kullanici_isim_ismini_aratir(String ilkIsim)  {
        dataTablesPage.searchButton.sendKeys(ilkIsim);
    }

    @Then("Arama sonucunun {string} isminin oldugu test edilir")
    public void aranilanIsmininOlduguTestEdilir(String firstName) {
        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstName));
    }
}
