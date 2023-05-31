@wip
#  Work In Progress

Feature: US1002 Kullanıcı ortak adımları Backgorund ile çalıştırır.

  Background: Ortak Adım
    Given kullanici amazon anasayfasinda

  Scenario: TC04 amazon nutella arama
    And kullanici Nutella icin arama yapar
    Then sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir

  Scenario: TC05 amazon Java arama
    And kullanici Java icin arama yapar
    Then sonuclarin Java icerdigini test eder
    And sayfayi kapatir