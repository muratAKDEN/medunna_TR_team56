<<<<<<< HEAD
Feature: Physician (Doktor) "Test Results" islemleri yapabilmeli (My Appointments / Edit / Test Results)
  @US13_01
  Scenario: Test sonucları talep edildikten ve Staff test sonuclarını güncelledikten sonra doktor "id, name(Urea, Sodium, Glucose etc..),default max value, default min value, test, description and the date" bilgilerini görebilmeli
    Given Doktor "medunnaUrl" gider
    When Doktor Giris ikonuna tiklar
    Then Doktor Sign in secenegine tiklar
    And Doktor valid "doktorErva" ve valid "passwordErva" ile giris yapar
    And Doktor Sign in butonuna tiklar
    And Doktor My Pages'e tiklar
    And Doktor My appointments'e tiklar
    And Doktor Edit butonuna tiklar
    And Doktor Show Test Result butonuna tiklar
    And Doktor View Results butonuna tiklar
    And Doktor id,name(Urea Sodium Glucose etc),default maximum value, default minimum value, test, description, and date bilgilerinin gorunur oldugunu test eder
    And Doktor sayfayi kapatir
=======
Feature: Physician (Doktor) "Test Results" işlemleri yapabilmeli (My Appointments / Edit / Test Results)
 # @US13_01
 #Scenario: Test sonuçları talep edildikten ve Staff test sonuçlarını güncelledikten sonra doktor "id, name(Urea, Sodium, Glucose etc..),default max value, default min value, test, description and the date" bilgilerini görebilmeli
 #  Given Doktor "medunnaUrl" gider
 #  When Anasayfada giris ikonuna tiklar
 #  Then Sign in secenegine tiklar
 #  And Gecerli kullanici adi ve gecerli sifre ile giris yapar
 #  And Sign in butonuna tiklar
 #  And My Pages(patient)e tiklar
 #  And My appointments'e tiklar
 #  And Edit butonuna tiklar
 #  And Show Test Result butonuna tiklar
 #  And View Results butonuna tiklar
 #  And id name(Urea Sodium Glucose etc) default maximum value default minimum value test description and date bilgileri gorunur olmali
 #  And sayfayi kapatir
>>>>>>> a5f87c98f59dad174b5d57e0913d5934061eb487

  @US13_02
  Scenario: Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli
    Given Doktor "medunnaUrl" gider
    When Doktor Giris ikonuna tiklar
    Then Doktor Sign in secenegine tiklar
    And Doktor valid "doktorErva" ve valid "passwordErva" ile giris yapar
    And Doktor Sign in butonuna tiklar
    And Doktor My Pages'e tiklar
    And Doktor My appointments'e tiklar
    And Doktor Edit butonuna tiklar
    And Doktor Request Inpatient butonuna tiklar
    And Doktor My Pages'e tiklar
    And Doktor My Inpatients butonuna tiklar
    And Doktor yatan hastalar(Inpatients) tablosunda hasta bilgilerinin gorunur oldugunu test eder
    And Doktor sayfayi kapatir

