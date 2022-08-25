Feature:Admin, kayıtlı kişilerin "firstname, lastname, email... Gibi bilgilerini görebilmeli.

  Background:US20 Ortak Steps
    Given Admin Ayse Medunna Url'e gider
    And Admin Ayse dropdown ikonuna tiklar
    And Admin Ayse sign in elementini tiklar
    Then Admin Ayse username ve password girer
    And Admin Ayse sign in butonunu tiklar
    And  Admin Ayse Administration butonunu tiklar
    And Admin Ayse User Management butonunu tiklar



  @US20_TC01
  Scenario: Firstname, lastname,email bilgileri gorunur olmalidir
    And Admin Ayse kullaniciyi secer ve view butonunu tiklar
    And Admin Ayse firstname, lastname,email bilgilerinin gorunur oldugunu test eder
    And Admin Ayse sayfayi kapatir



  @US20_TC02
  Scenario:Admin kullanıcılıar aktive edebilmeli ve rollerini "ADMIN, USER
  PATIENT, STAFF ve PHYSICIAN" olarak atayabilmeli
    And Admin Ayse kullaniciyi secer ve edit butonunu tiklar
    And Admin Ayse activated box i tiklayarak kullanici aktive edebilir veya iptal edebilir
    And Admin Ayse profils seceneginden Role-Admin atayabildigini test eder
    And Admin Ayse profils seceneginden Role-User atayabildigini test eder
    And Admin Ayse profils seceneginden Role-Patient atayabildigini test eder
    And Admin Ayse profils seceneginden Role-Staff atayabildigini test eder
    And Admin Ayse profils seceneginden Role-Physician atayabildigini test eder
    And Admin Ayse sayfayi kapatir



  @US20_TC03
  Scenario:Admin kullanicilari silebilmeli
    And Admin Ayse kullaniciyi secer ve delete butonunu tiklar
    And Admin Ayse sayfayi kapatir







