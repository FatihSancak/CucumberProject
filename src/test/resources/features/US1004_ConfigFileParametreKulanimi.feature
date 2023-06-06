Feature: US1004 kullanici paremetre ile configuration file'ı kullanılabilmeli

  @config @pr2
  Scenario: TC07 configuration properties dosyasından parametre kullanımı

    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici 1 saniye bekler
    And Url "amazon" icerdigini test eder
    Then sayfayi kapatir