Feature: Physician (Doktor) test isteyebilmeli (My Appointments/Edit/Request A Test)

  @US12_01
  Scenario: Test içeriğinde "Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin" seçenekleri olmalı
    Given Doktor "medunnaUrl" gider
    When Anasayfada giris ikonuna tiklar
    Then Sign in secenegine tiklar
    And Gecerli kullanici adi ve gecerli sifre ile giris yapar
    And Sign in butonuna tiklar
    And My Pages(patient)e tiklar
    And My appointments'e tiklar
    And Edit butonuna tiklar
    And Request A Test  butonuna tiklar
    And Test items tablosu gorunur olmali
    And sayfayi kapatir

   @US12_02
   Scenario: Test içeriğinde "Glucose, Urea, Creatinine, Sodium Potassium, Total protein, Albumin, Hemoglobin" seçenekleri olmalı
     Given Doktor "medunnaUrl" gider
     When Anasayfada giris ikonuna tiklar
     Then Sign in secenegine tiklar
     And Gecerli kullanici adi ve gecerli sifre ile giris yapar
     And Sign in butonuna tiklar
     And My Pages(patient)e tiklar
     And My appointments'e tiklar
     And Edit butonuna tiklar
     And Request A Test  butonuna tiklar
     And Testlere tiklar
     And Test içeriğinde Glucose Urea Creatinine Sodium Potassium Total protein Albumin Hemoglobin seçenekleri olmalı
     And save butonuna tiklar
     And sayfayi kapatir







