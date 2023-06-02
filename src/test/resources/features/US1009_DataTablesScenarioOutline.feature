Feature: US1009 Datatables sitesine 5 farkli giris yapin

  @datatable
  Scenario Outline: TC14 Bes farkli kayit girisi yapilabilmeli

    When kullanici "datatablesURL" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstName>" yazar
#    And kullanici 1 saniye bekler
    And soyisim bolumune "<lastName>" yazar
#    And kullanici 1 saniye bekler
    And pozisyon bolumune "<position>" yazar
#    And kullanici 1 saniye bekler
    And ofis bolumune "<office>" yazar
#    And kullanici 1 saniye bekler
    And extension bolumune "<extension>" yazar
#    And kullanici 1 saniye bekler
    And Start Date bolumune "<startDate>" yazar
#    And kullanici 1 saniye bekler
    And Salary bolumune "<salary>" yazar
#    And kullanici 1 saniye bekler
    And create tusuna basar
#    And kullanici 2 saniye bekler
    When Isim Ara : "<firstName>" ismini aratir
    Then Arama sonucunun "<firstName>" isminin oldugu test edilir
    And sayfayi kapatir

    Examples:
      | firstName | lastName | position | office   | extension | startDate  | salary |
      | Alim      | Alimoğlu | QA       | NewYork  | UI        | 2022-10-11 | 10000  |
      | Berk      | Can      | SDET     | Ankara   | API       | 2022-05-05 | 11000  |
      | Huseyin   | Testci   | BA       | Berlin   | -         | 2022-07-10 | 40000  |
      | Fatih     | kueyci   | PO       | Helsinki | -         | 2022-03-12 | 45000  |
      | Ahmet     | Kaya     | Tester   | Paris    | DB        | 2022-06-06 | 11000  |

