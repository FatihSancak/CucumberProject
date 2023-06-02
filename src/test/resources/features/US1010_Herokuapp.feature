Feature: US1010 herokuapp Delete testi

  Scenario: TC15 herokuapp'dan delete butonu calismali
  Given kullanici "herokuappURL" anasayfasinda
  And add element butonuna basar
  Then Delete butonu gorunur olucaya kadar bekler
  And Delete butonunun gorunur oldugunu test eder
  Then Delete butonuna basar
  And Delete butonunun gorunmedigini test eder
  And sayfayi kapatir

  
