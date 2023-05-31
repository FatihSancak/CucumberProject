package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfasinda")
    public void kullaniciAmazonAnasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullniciNutellaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String expectResult = "Nutella";
        String actualResult = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualResult.contains(expectResult));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Java icin arama yapar")
    public void kullaniciJavaIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Java", Keys.ENTER);
    }

    @And("sonuclarin Java icerdigini test eder")
    public void sonuclarinJavaIcerdiginiTestEder() {
        String expectResult = "Java";
        String actualResult = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualResult.contains(expectResult));
    }

    @And("kullanici Iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Iphone", Keys.ENTER);
    }

    @Then("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String expectedResult = "Iphone";
        String actualResult = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


    @Given("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualResult = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualResult.contains(arananKelime));
    }

    @And("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String istenenKelime) {
        amazonPage.aramaKutusu.sendKeys(istenenKelime, Keys.ENTER);

    }

    @Given("kullanici {string} anasayfasinda")
    public void kullaniciAnasayfasinda(String isteneURL) {
        Driver.getDriver().get(ConfigReader.getProperty(isteneURL));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklenenSaniye) {
        try {
            Thread.sleep(beklenenSaniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("Url {string} icerdigini test eder")
    public void urlIcerdiginiTestEder(String istenilenUrl) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        System.out.println(actualURL);
        Assert.assertTrue(actualURL.contains(istenilenUrl));
    }
}
