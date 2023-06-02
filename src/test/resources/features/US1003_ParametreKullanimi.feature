
Feature: US1003 Kullanici Paremetre kullanarak arama yapabilmeli


  @parametre
  Scenario: TC06 Kullanici parametre ile amazonda arama yapabilmeli
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Hava" icerdigini test eder
    Then sayfayi kapatir

