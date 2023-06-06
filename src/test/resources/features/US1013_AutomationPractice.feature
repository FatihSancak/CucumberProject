Feature: US1013 Yanlis Email Giris Testi

  Scenario: TC17 Kullanici yanlis mail adresi ile giris yapamaz

  Given kullanici "automationURL" anasayfasinda
  And user sign in linkine tiklar
  And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
  Then error mesajinin invalid email address oldugunu dogrulayin