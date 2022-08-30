@US15
Feature: Admin tarafindan hasta oluşturma ve düzenleme

  Background: Ortak Adimlar

    * Admin Medunna Url'e gider
    * Admin dropdown ikonuna tiklar
    * Admin sign in elementini tiklar
    * Admin username ve password girer
    * Admin sign in butonunu tiklar
    * "Items&Titles" basliga tiklar
    * "Patient" basliga tiklar

  Scenario: TC01 Yeni hastalar yalnizca yonetici tarafindan oluşturulabilir Then kullanici "created" uyarisinin ciktigini test eder
    * "Create a new Patient" basliga tiklar
    * kullanici gerekli alanlari doldurur
    * kullanici Save butonuna tiklar
    * kullanici "created" uyarisinin gorundugunu test eder
    * kullanici sayfayi kapatir

  Scenario:TC02 Yonetici "SSN, First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, Created Date, User, Country and state / City" gibi hasta bilgilerini gorebilir

    * kullanici "ID" bilgisinin goruntulendigini test eder
    * kullanici "SSN" bilgisinin goruntulendigini test eder
    * kullanici "First Name" bilgisinin goruntulendigini test eder
    * kullanici "Last Name" bilgisinin goruntulendigini test eder
    * kullanici "Birth Date" bilgisinin goruntulendigini test eder
    * kullanici "Phone" bilgisinin goruntulendigini test eder
    * kullanici "Gender" bilgisinin goruntulendigini test eder
    * kullanici "Blood Group" bilgisinin goruntulendigini test eder
    * kullanici "Address" bilgisinin goruntulendigini test eder
    * kullanici "Description" bilgisinin goruntulendigini test eder
    * kullanici "Created Date" bilgisinin goruntulendigini test eder
    * kullanici "User" bilgisinin goruntulendigini test eder
    * kullanici "Country" bilgisinin goruntulendigini test eder
    * kullanici "State/City" bilgisinin goruntulendigini test eder
    * kullanici sayfayi kapatir
  @US15
  Scenario:TC03 Hasta oluşturulduğunda veya güncellendiğinde yukarıdaki öğelere data girişi yapılabilmeli.
    * "Create a new Patient" basliga tiklar
    * kullanici First Name, Last Name, Birth Date, Phone, Gender, Blood Group, Address, Description, User, Country and state City butonlarinin enable oldugunu test eder
    * kullanici sayfayi kapatir




