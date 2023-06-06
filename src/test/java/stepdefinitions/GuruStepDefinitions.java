package stepdefinitions;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();

    @And("{string} sutunundaki tum degerleri yazdirir.")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {
        List<WebElement> tabloBaslikListesi = guruPage.basliklistesi;
        // Liste WebElement'lerden oluþuyor
        // doslayýsýyla bu Web Element'lerden hangisi
        // istenen sutun basligini tasiyor bilemeyiz.

        int istenenBaslikIndexi = -3;

        for (int i = 0; i < tabloBaslikListesi.size(); i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi = i + 1;
                break;
            }
        }

        // ForLoop ile tüm sutun basliklarini bana verilen istenenSutun degeri ile karsilatirildi
        // loop bittiginde basligi bulunup bulunmadigini kontrol etmek ve
        // bulundu ise yoluna devam etmek gerekir.

        if (istenenBaslikIndexi != -3) { // baslik bulundu
            List<WebElement> istenenSutundakiElementler = Driver.getDriver().findElements(By.xpath("//tbody//tr//td[" + istenenBaslikIndexi + "]"));

            for (WebElement each : istenenSutundakiElementler
            ) {
                System.out.println(each.getText());
            }

        } else { // baþlýk bulunamadý
            System.out.println("Ýstenen Baþlýk Bulunamadý.");
        }
    }
}

