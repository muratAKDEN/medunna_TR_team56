Feature: US06 Kullanici bilgisi sekmesi (Setting) Ana Sayfada duzenlenebilir olmalidir.

  @us06tc01
  Scenario: TC01 Kullanici bilgileri firstname, lastname, email girerken doldurulan kullanici bilgileri olmalidir.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayf giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Anasayfada giris ikonuna tiklar
    And Settingse tiklar
    And First Name bilgisinin dogrulugunu kontrol eder
    And Last Name bilgisinin dogrulugunu kontrol eder
    And Email bilgisinin dogrulugunu kontrol eder
    And Sayfayi kapatir

  @us06tc02
  Scenario: TC02 Firstname guncelleme secenegi olmalidir.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Anasayfada giris ikonuna tiklar
    And Settingse tiklar
    And First Name bilgisinin degistirilebildigini kontrol eder
    And Sayfayi kapatir

  @us06tc03
  Scenario: TC03 Lastname guncelleme secenegi olmalidir.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Anasayfada giris ikonuna tiklar
    And Settingse tiklar
    And Last Name bilgisinin degistirilebildigini kontrol eder
    And Sayfayi kapatir

  @us06tc04
  Scenario: TC04 Email guncelleme secenegi olmalidir.
    Given Hasta "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Anasayfada giris ikonuna tiklar
    And Settingse tiklar
    And Email bilgisinin degistirilebildigini kontrol eder
    And Sayfayi kapatir