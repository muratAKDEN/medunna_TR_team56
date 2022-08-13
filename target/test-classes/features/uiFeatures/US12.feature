Feature: Physician (Doktor) test isteyebilmeli (My Appointments/Edit/Request A Test)

  @US12_01
  Scenario: Doktor test isteyebilmeli "Request A Test"
    Given Doktor "medunnaUrl" gider
    When  Doktor Giris ikonuna tiklar
    Then  Doktor Sign in secenegine tiklar
    And  Doktor valid "doktorErva" ve valid "passwordErva" ile giris yapar
    And  Doktor Sign in butonuna tiklar
    And  Doktor My Pages'e tiklar
    And  Doktor My appointments'e tiklar
    And  Doktor Edit butonuna tiklar
    And  Doktor Request A Test butonuna tiklar
    And  Doktor Test items tablosunun gorunur oldugunu test eder
    Then Doktor sayfayi kapatir

  @US12_02
  Scenario: Test iceriginde "Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin" secenekleri olmalı
    Given Doktor "medunnaUrl" gider
    When Doktor Giris ikonuna tiklar
    Then Doktor Sign in secenegine tiklar
    And Doktor valid "doktorErva" ve valid "passwordErva" ile giris yapar
    And Doktor Sign in butonuna tiklar
    And Doktor My Pages'e tiklar
    And Doktor My appointments'e tiklar
    And Doktor Edit butonuna tiklar
    And Doktor Request A Test butonuna tiklar
    And Doktor Testlere tiklar
    And Doktor Test iceriginde (glucose, Urea, Creatinine-, Sodium-, Potassium-, Albumin, Hemoglobin) seceneklerinin oldugunu test eder
    And Doktor save butonuna tiklar
    Then Doktor sayfayi kapatir







