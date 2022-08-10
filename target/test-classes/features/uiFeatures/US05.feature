Feature: US05 Hastalar (patients), hastahaneden randevu (Appointment) oluşturabilmelidir.

  @us05tc01
  Scenario: TC01 Kullanıcının herhangi bir karakter içeren First Name yazması gerekir ve boş bırakılamaz.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And My Pages(patient)e tiklar
    And Make an Appointmenta tiklar
    Then First Name kutusunun bos birakilamayacagini kontrol eder
    And Sayfayi kapatir

  @us05tc02
  Scenario: TC02 Kullanıcı SSN numarası girmeli (kayıtlı SSN) boş bırakılamaz.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And My Pages(patient)e tiklar
    And Make an Appointmenta tiklar
    And SSN kutusunun bos birakilamayacagini kontrol eder
    And Sayfayi kapatir

  @us05tc03
  Scenario: TC03 Kullanıcı, herhangi bir karakter içeren Last Name yazması gerekir, boş bırakılamaz.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And My Pages(patient)e tiklar
    And Make an Appointmenta tiklar
    And Last Name kutusunun bos birakilamayacagini kontrol eder
    And Sayfayi kapatir

  @us05tc04
  Scenario: TC04 Kullanıcı, 3. ve 6. rakamdan sonra "-" olan 10 rakamlı telefon numarasını gireli, boş bırakılamaz.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And My Pages(patient)e tiklar
    And Make an Appointmenta tiklar
    And Phone kutusunun bos birakilamayacagini kontrol eder
    And Sayfayi kapatir

  @us05tc05
  Scenario: TC05 Kullanıcı randevu alıp kaydolduğunda, profillerini görebilir ve uygulamada oturum açabilir.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And My Pages(patient)e tiklar
    And Make an Appointmenta tiklar
    And Randevu formuna telefon numarasi girer
    And Send an Appointment Requeste tiklar
    And Randevu olusturuldugunu kontrol eder
    And My Pages(patient)e tiklar
    And My Appointmentsa tiklar
    And Ramdevularin goruntulendigini kontrol eder
    And Sayfayi kapatir