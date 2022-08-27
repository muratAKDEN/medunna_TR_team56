Feature: US04 Giriş sayfası yalnızca geçerli kimlik bilgileriyle erişilebilir olmalıdır.

  Scenario: TC06 basarili giris mesaji görünmeli
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    Then kullanici gecerli bir username girer
    And  kullanici gecerli bir password girer
    Then sign in butonuna tiklar
    And basarili bir giris yaptigini test eder

  Scenario: Beni hatirla secenegine tiklayabilmeli
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    Then kullanici gecerli bir username girer
    And  kullanici gecerli bir password girer
    And kullanici beni hatirla butonunun oldugunu kontrol eder

  Scenario: TC07 Sifremi unuttum secenegine tiklayabilmeli
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And sifremi unuttum seceneginin oldugunu test eder

  Scenario: TC08 Register a new account secenegi olmalı
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And register a new account seceneginin oldugunu test eder

  Scenario: TC09 cancel secenegi olmalı
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And Cancel secenegininin gorundugunu test eder