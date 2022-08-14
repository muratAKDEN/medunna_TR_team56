Feature: US09 Staff (Personel), hasta bilgilerini gorebilmeli, duzenleyebilmeli ve silebilmelidir.


  Scenario: TC04 Kullanıcı, API kullanarak tüm hasta bilgilerini doğrulamalıdır.
    Given Kullanici GET request gonderir
    And status kodunun 200 oldugu gorulur
    Then Kullanici tum hasta bilgilerini API response ile alir
    Then Kullanici medunna database e baglanir
    And Kullanici database'den tum hasta bilgilerini alir
    Then Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then NBH 'My Pages' dropdown menusunu tiklar
    And NBH 'Search Patient' butonunu tiklar
    Then kullanici sayfanin en altindaki kayitli hasta sayisini alir
    And Kullanici API ile kayitli hasta sayisini DB ve UI ile gercekler


