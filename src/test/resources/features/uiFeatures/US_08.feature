Feature: US_08 Ana sayfadaki sifre bolumu duzenlenebilir olmalidir

  Background: ortak adimlar
    Given kullanici "medunnaUrl" anasayfasindaa
    Then doktor signInbutonu tiklar
    And doktor loginButonu tiklar
    And doktor "doctorUser" ve "password" girer SignIn tıklar
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And  Acilan drop down menude Password sekmesine tiklar



  Scenario: TC01 "New password confirmation" onaylanabilmelidir.






    Then Current password kutusuna mevcut şifreyi girer
    And Kullanıcı sayfayı kapatır






  Scenario: TC02 Daha guclü sifre icin en az 1 kucuk harf olmalı ve "Password strength" seviyesinin degistigi gorulmelidir







  Scenario: TC03 sifre en az 1 büyük harf icermeli ve "Password strength" seviyesinin degistigi gorulmelidir



  Scenario: TC04 sifre en az 1 rakam icermeli ve "Password strength" seviyesinin degistigi gorulmelidir




  Scenario: TC05 sifre en az 1 ozel karakter icermeli ve"Password strength" seviyesinin degistigi gorulmelidir




  Scenario: TC06 guclu bir parola için sifre en az 7 karakterden oluşmalıdır




  Scenario: TC07 Eski sifre kullanılmamalıdır



