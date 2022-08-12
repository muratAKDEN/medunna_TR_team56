@us06
Feature: US06 Kullanici bilgisi sekmesi (Setting) Ana Sayfada duzenlenebilir olmalidir.

  Background: US06 Ortak adimlar
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Anasayfada giris ikonuna tiklar
    And Settingse tiklar

  @us06tc01
  Scenario: TC01 Kullanici bilgileri firstname, lastname, email girerken doldurulan kullanici bilgileri olmalidir.
    And First Name bilgisinin dogrulugunu kontrol eder
    And Last Name bilgisinin dogrulugunu kontrol eder
    And Email bilgisinin dogrulugunu kontrol eder
    And Sayfayi kapatir

  @us06tc02
  Scenario: TC02 Firstname guncelleme secenegi olmalidir.
    And First Name bilgisinin degistirilebildigini kontrol eder
    And Sayfayi kapatir

  @us06tc03
  Scenario: TC03 Lastname guncelleme secenegi olmalidir.
    And Last Name bilgisinin degistirilebildigini kontrol eder
    And Sayfayi kapatir

  @us06tc04
  Scenario: TC04 Email guncelleme secenegi olmalidir.
    And Email bilgisinin degistirilebildigini kontrol eder
    And Sayfayi kapatir