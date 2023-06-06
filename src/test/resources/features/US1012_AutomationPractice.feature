Feature: US1012 Kullanıcı Register yapabilmeli.
  @aut
  Scenario:TC17 Kullanici uygun datalarla register olabilmeli.

  Given kullanici "automationURL" anasayfasinda
    And user sign in linkine tiklar
    And user Create and account bolumune email adresi girer
    And Create an Account butonuna basar
    And kullanici 3 saniye bekler
    Given kullanici kayit icin gerekli bilgileri girer
    And user Register butonuna basar
    Then hesap olustugunu dogrular
    And sayfayi kapatir