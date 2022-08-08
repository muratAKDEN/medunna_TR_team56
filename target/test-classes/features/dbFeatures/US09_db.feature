Feature: US09 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.

  Scenario: TC04 Kullanıcı, DB kullanarak tüm hasta bilgilerini doğrulamalıdır.
    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    Then Kullanıcı Database'e  password ve username ile baglantı kurar
    Then Kullanıcı DB den veri almak icin SQl kodları olusturulur
    And Kullanıcı data result setten ilk hastayi secer
    And kullanıcı do assertion yapar
