Feature: US_08 Ana sayfadaki sifre bolumu duzenlenebilir olmalidir

  Background: ortak adimlar
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "doktorErva" girer
    And kullanici password olarak "passwordErva" girer
     And kullanici Sign In butonuna tiklar
    And Kullanici sayfayi kapatir




  Scenario: TC01 "New password confirmation" onaylanabilmelidir.



    And Kullanici sayfayi kapatir






  Scenario: TC02 Daha guclü sifre icin en az 1 kucuk harf olmalı ve "Password strength" seviyesinin degistigi gorulmelidir







  Scenario: TC03 sifre en az 1 büyük harf icermeli ve "Password strength" seviyesinin degistigi gorulmelidir



  Scenario: TC04 sifre en az 1 rakam icermeli ve "Password strength" seviyesinin degistigi gorulmelidir




  Scenario: TC05 sifre en az 1 ozel karakter icermeli ve"Password strength" seviyesinin degistigi gorulmelidir




  Scenario: TC06 guclu bir parola için sifre en az 7 karakterden oluşmalıdır




  Scenario: TC07 Eski sifre kullanılmamalıdır



