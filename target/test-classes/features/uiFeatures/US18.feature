Feature: Admin olarak; Yeni Physicians Olustur / Guncelle / Goruntule ve Sil

  @US18_TC01
  Scenario: Admin, doktorların bilgilerini görebilmelidir.
    Given Admin "medunnaUrl" gider
    When Admin Giris ikonuna tiklar
    And Admin Sign in secenegine tiklar
    And Admin valid "adminErva" ve valid "adminErvaPassword" ile giris yapar
    And Admin Sign in butonuna tiklar
    And Admin ItemsTitles butonuna tiklar
    And Admin Physician secenegine tiklar
    And Admin Physicians tablosundaki butun doktorlarin bigilerinin gorunur oldugunu test eder
    Then Admin Sayfayi kapatir


  @US18_TC02
  Scenario: Admin, SSN kimligine göre kayıtlı bir kisiyi secebilir/arayabilir
    Given Admin "medunnaUrl" gider
    When Admin Giris ikonuna tiklar
    And Admin Sign in secenegine tiklar
    And Admin valid "adminErva" ve valid "adminErvaPassword" ile giris yapar
    And Admin Sign in butonuna tiklar
    And Admin ItemsTitles butonuna tiklar
    And Admin Physician secenegine tiklar
    And Admin Create a new physician butonuna tiklar
    And Admin SSN kutusuna kayitli bir "ssnErva" numarasi girer
    And Admin Search User butonuna tiklar
    And Admin alert mesajinin "User found with search SSN" icerdigini test eder
    Then Admin Sayfayi kapatir


  @US18_TC03
  Scenario: Admin, Doktorların bilgilerini düzenleyebilir
    Given Admin "medunnaUrl" gider
    When Admin Giris ikonuna tiklar
    And Admin Sign in secenegine tiklar
    And Admin valid "adminErva" ve valid "adminErvaPassword" ile giris yapar
    And Admin Sign in butonuna tiklar
    And Admin ItemsTitles butonuna tiklar
    And Admin Physician secenegine tiklar
    And Admin ilk edit butonuna tiklar
    And Admin doktor bilgilerini gunceller
    And Admin Save butonuna tiklar
    And Admin alert mesajinin "A Physician is updated with identifier" icerdigini test eder
    Then Admin Sayfayi kapatir

  @US18_TC04
  Scenario: Admin mevcut doktorları silebilir
    Given Admin "medunnaUrl" gider
    When Admin Giris ikonuna tiklar
    And Admin Sign in secenegine tiklar
    And Admin valid "adminErva" ve valid "adminErvaPassword" ile giris yapar
    And Admin Sign in butonuna tiklar
    And Admin ItemsTitles butonuna tiklar
    And Admin Physician secenegine tiklar
    And Admin son sayfaya gider ve son siradaki delete butonuna tiklar
    And Admin alert mesajinin "A Physician is deleted with identifier" icerdigini test eder
    Then Admin Sayfayi kapatir