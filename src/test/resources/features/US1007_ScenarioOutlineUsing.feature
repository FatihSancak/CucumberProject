# Amazon sayfasında sırasıyla;
# nutella, java, elma, armut aratıp
# sonuçların arama yaptığımız kelimeyi içerdiğini test edelim


Feature: US1007 kullanici amazonda istedigi kelimeleri aratir.
  Scenario Outline: TC12 amazonda listedeki eleementleri aratma
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    And sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime |  | istenenKelimeKontrol |  |
      | nutella       |  | nutella              |  |
      | java          |  | java                 |  |
      | elma          |  | elma                 |  |
      | armut         |  | armut                |  |
