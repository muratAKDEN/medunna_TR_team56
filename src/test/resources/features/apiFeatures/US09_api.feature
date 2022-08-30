Feature: US09 Staff (Personel), hasta bilgilerini gorebilmeli, duzenleyebilmeli ve silebilmelidir.

@zxc
  Scenario: TC04 Kullanıcı, API kullanarak tüm hasta bilgilerini doğrulamalıdır.
    Given Kullanici GET request gonderir
    And status kodunun 200 oldugu gorulur
    Then Kullanici tum hasta bilgilerini API response ile alir


