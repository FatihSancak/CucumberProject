# Hotel My Camp sitesinde 3 adet negative testi senaryosu oluşturun:
# 1. VALID Username, WRONG password
# 2. WRONG Username, VALID password
# 3. WORNG Username, WRONG password

Feature: US1006 Yanlış bilgilerle siteye giriş yapılamaz

  Scenario: TC09 yanlıs PASSWORD adi ile giriş yapılamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    And gecerli username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC10 yanlış USERNAME ile giriş yapılamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

  Scenario: TC11 Yanlış USERNAME ve PASSWORD ile giriş yapılamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    And gecersiz username girer
    And gecersiz password girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir