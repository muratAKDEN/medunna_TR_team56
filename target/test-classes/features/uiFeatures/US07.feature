Feature:Hastalar randevu tarihi olusturabilmelidir.

   @US07_TC01
   Scenario:Gecerli tarih girilmeli
     Given kullanici Medunna internet sitesinin anasayfasina gider
     Then Hasta dropdown ikonuna tiklar
     And  Hasta sign in elementini tiklar
     And  Hasta gecerli bir username girer
     And  Hasta gecerli bir password girer
     And Hasta signinButonuna tiklar
     And Hasta My Pages-patient elementine tiklar
     And Hasta Make an Appointment butonuna tiklar
     Then Hasta Phone boxa telefon numarasi girer
     And  Hasta appointment DateTime Gecmis bir tarih girer
     And Hasta gecmis bir tarihle randevu alinamayacagini test eder
     Then Hasta Guncel tarihle randevu alinabilecegini test eder
     And Hasta appointment DateTime Boxa guncel veya gelecekteki bir tarih girer
     And Hasta appointment request butonunu tiklar
     And Hasta guncel veya gelecek bir tarih girilebilecegini dogrular
     And Hasta Sayfayi kapatir



  @US07_TC02
  Scenario:Gecerli tarih girilmeli
    Given kullanici Medunna internet sitesinin anasayfasina gider
    Then Hasta dropdown ikonuna tiklar
    And  Hasta sign in elementini tiklar
    And  Hasta gecerli bir username girer
    And  Hasta gecerli bir password girer
    And Hasta signinButonuna tiklar
    And Hasta My Pages-patient elementine tiklar
    And Hasta Make an Appointment butonuna tiklar
    Then Hasta Phone boxa telefon numarasi girer
    And Hasta appointment DateTime Boxa guncel veya gelecekteki bir tarih girer
    And Hasta appointment request butonunu tiklar
    And Hasta girilen tarihin gg.aa.yyyy formunda oldugunu dogrular
    And Hasta Sayfayi kapatir

