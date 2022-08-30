Feature: US_24 My Appointments (Randevular) (Patient)

  Background:
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "NBHHastaUserName" girer
    And kullanici password olarak "NBHHastaSifre" girer
    And kullanici Sign In butonuna tiklar
    Then NBH 'My Pages' dropdown menusunu tiklar


  @t
  Scenario: US_24 TC01 Test sonuclari
    Then NBH My Appointments butonuna tiklar
    And NBH gecerli bir tarih girer
    And NBH Show Tests butonuna tiklar
    Then NBH View Results butonuna tiklar
    And NBH acilan sayfada kan tahlili bolumlerinin gorunur oldugunu test eder
    And Kullanici sayfayi kapatir

    @te
  Scenario: US24 TC02 My Appointments Recete Bilgisi
    And NBH My Appointments butonuna tiklar
    Then NBH gecerli bir tarih girer
    And NBH Show Invoice butonuna tiklar
    And NBH Invoice'in gorunur oldugunu test eder
    And Kullanici sayfayi kapatir

