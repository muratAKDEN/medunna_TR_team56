Feature: Physician (Doktor) "Test Results" işlemleri yapabilmeli (My Appointments / Edit / Test Results)
  @US13_01
  Scenario: Test sonuçları talep edildikten ve Staff test sonuçlarını güncelledikten sonra doktor "id, name(Urea, Sodium, Glucose etc..),default max value, default min value, test, description and the date" bilgilerini görebilmeli
    Given Doktor "medunnaUrl" gider
    When Anasayfada giris ikonuna tiklar
    Then Sign in secenegine tiklar
    And Gecerli kullanici adi ve gecerli sifre ile giris yapar
    And Sign in butonuna tiklar
    And My Pages(patient)e tiklar
    And My appointments'e tiklar
    And Edit butonuna tiklar
    And Show Test Result butonuna tiklar
    And View Results butonuna tiklar
    And id name(Urea Sodium Glucose etc) default maximum value default minimum value test description and date bilgileri gorunur olmali
    And sayfayi kapatir

  @US13_02
  Scenario: Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli
    Given Doktor "medunnaUrl" gider
    When Anasayfada giris ikonuna tiklar
    Then Sign in secenegine tiklar
    And Gecerli kullanici adi ve gecerli sifre ile giris yapar
    And Sign in butonuna tiklar
    And My Pages(patient)e tiklar
    And My appointments'e tiklar
    And Edit butonuna tiklar
    And Request Inpatient butonuna tiklar
    And A new In Patient is created with identifier mesaji gorunur olmali
    And sayfayi kapatir

