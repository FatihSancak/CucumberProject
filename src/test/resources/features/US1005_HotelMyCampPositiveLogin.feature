Feature: US 1005 dogru kullanici adi ve sifre ile giri yapılabilmeli.
  @hmc
  Scenario: TC08 positif login test
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And sayfayi kapatir
