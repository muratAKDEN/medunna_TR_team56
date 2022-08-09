Feature: US09 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.

  Scenario: TC04 Kullanıcı, API kullanarak tüm hasta bilgilerini doğrulamalıdır.
    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    Then Kullanici API icin Url set eder
    And kullanici expected datalari girer
    When kullanici request gonderir ve response alir
    And kullanici hasta bilgilerini dogrular
