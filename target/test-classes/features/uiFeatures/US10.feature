Feature: US10 Doktor randevuları


  @TC01
  Scenario: Kullanici randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmelidir
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "doctorUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    And  Doktor My Pages butonuna tiklar
    And  Doktor acilan pencereden My appointments butonuna tiklar
    And  Doktor randevu listesini gorebildigini test eder
    And  Doktor zaman dilimlerini gorebildigini test eder


    @TC02
    Scenario: Kullanici "patient id, start date, end date, status" bilgilerini görebilmelidir
      Given Kullanici "medunnaUrl" adresine gider
      Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
      And kullanici acilan dropdown menude signIn butonuna tiklar
      And kullanici username olarak "doctorUser" girer
      And kullanici password olarak "password" girer
      And kullanici Sign In butonuna tiklar
      And  Doktor My Pages butonuna tiklar
      And  Doktor acilan pencereden My appointments butonuna tiklar
      And  Doktor patient id, start date, end date, status bilgilerini gorebildigini test eder
