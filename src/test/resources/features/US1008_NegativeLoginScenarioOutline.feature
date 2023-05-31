Feature: US1008 kullanici farklı kullanici adı ve şifre ile giriş yapamaz -  Hotel My Camp Negative Login Outline

  Scenario: TC13 yanlis kullanici adi ve sifrelerle giris yapilamaz
    Given kullanici "HMCUrl" anasayfasinda
    Then Login yazisina tiklar
    And gecersiz kullanici "<username>" girer
    And gecersiz parola "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
      | username | password  |
      | Manager5 | Manager5! |
      | Manager6 | Manager6! |
      | Manager7 | Manager7! |
      | Manager8 | Manager8! |
      | Manager9 | Manager9! |

