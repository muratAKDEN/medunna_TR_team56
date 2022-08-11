Feature: US04 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

  Scenario: TC06 basarili giris mesaji görünmeli
    Given kullanici "medunnaUrl" anasayfasinda
    Then dropdown menusune tiklar
    Then sign in butonuna basar
    Then kullanici gecerli bir username girer
    And  kullanici gecerli bir password girer
    Then sign in butonuna tiklar
    And basarili bir giris yaptigini test eder

  Scenario: Beni hatirla secenegine tiklayabilmeli
    Given kullanici "medunnaUrl" anasayfasinda
    Then dropdown menusune tiklar
    Then sign in butonuna basar
    Then kullanici gecerli bir username girer
    And  kullanici gecerli bir password girer
    And kullanici beni hatirla butonunun oldugunu kontrol eder

  Scenario: TC07 Sifremi unuttum secenegine tiklayabilmeli
    Given kullanici "medunnaUrl" anasayfasinda
    Then dropdown menusune tiklar
    Then sign in butonuna basar
    And sifremi unuttum seceneginin oldugunu test eder

  Scenario: TC08 Register a new account secenegi olmalı
    Given kullanici "medunnaUrl" anasayfasinda
    Then dropdown menusune tiklar
    Then sign in butonuna basar
    And register a new account seceneginin oldugunu test eder

  Scenario: TC09 cancel secenegi olmalı
    Given kullanici "medunnaUrl" anasayfasinda
    Then dropdown menusune tiklar
    Then sign in butonuna basar
    And Cancel secenegininin gorundugunu test eder