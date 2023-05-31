@Tumu
Feature: amazonsearch.feature

  @Nutella @ikisi
  Scenario: TC01 Kullanıcı Amazonda kelime aratır.
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  @Java @ikisi
  Scenario: TC02 Kullanıcı Amazonda kelime aratır.
    Given kullanici amazon anasayfasinda
    Then kullanici Java icin arama yapar
    And sonuclarin Java icerdigini test eder
    And sayfayi kapatir

  @Iphone
  Scenario: TC03 kullanici iphone aratır
    When kullanici amazon anasayfasinda
    And kullanici Iphone icin arama yapar
    Then sonuclarin iphone icerdigini test eder
    And sayfayi kapatir


#    Given kullanici amazon sayfasina gider
#    And iPhone icin arama yapar
#    Then sonuclarin Iphone icerdigini test eder
#    Given kullanici amazon sayfasina gider
#    And tea pot icin arama yapar
#    Then sonuclarin tea pot icerdigini test eder
#    Given kullanici amazon sayfasina gider
#    And flower icin arama yapar
#    Then sonuclarin flower icerdigini test eder