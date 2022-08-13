Feature: US_08 Ana sayfadaki sifre bolumu duzenlenebilir olmalidir

  Background: ortak adimlar
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "DrMuratAkdeniz" girer
    And kullanici password olarak "drMuratsifre1" girer
    And kullanici Sign In butonuna tiklar
    And kullanici account buttona tiklar
    And  password buttona tiklar
    And current Password Kutusuna "drMuratsifre1" girer


  @asd
  Scenario: TC01 "New password confirmation" onaylanabilmelidir.


    And new password kutusuna "drMuratsifre1" girer
    And confirm the password kutusuna "drMuratsifre1" girer
    And save butonuna basar
    And password changed yazisinin gorundugunu test eder




  Scenario: TC02 Daha guclü sifre icin en az 1 kucuk harf olmalı ve "Password strength" seviyesinin degistigi gorulmelidir



    And new password kutusuna "drMuratsifre5" girer
    And password strenght seviyesinin "koyu yesil" oldugunu test eder

    And Kullanici sayfayi kapatir


  Scenario: TC03 sifre en az 1 büyük harf icermeli ve "Password strength" seviyesinin degistigi gorulmelidir

    And new password kutusuna "drMuratsifre6" girer

    And Kullanici sayfayi kapatir

  Scenario: TC04 sifre en az 1 rakam icermeli ve "Password strength" seviyesinin degistigi gorulmelidir


    And new password kutusuna "drMuratsifre7" girer

    And Kullanici sayfayi kapatir


  Scenario: TC05 sifre en az 1 ozel karakter icermeli ve"Password strength" seviyesinin degistigi gorulmelidir



    And new password kutusuna "drMuratsifre8" girer
    And Kullanici sayfayi kapatir


  Scenario: TC06 guclu bir parola için sifre en az 7 karakterden oluşmalıdır


    And new password kutusuna "drMuratsifre9" girer

    And Kullanici sayfayi kapatir


  Scenario: TC07 Eski sifre kullanılmamalıdır

    And current Password Kutusuna "drMuratsifre2" girer
    And new password kutusuna "drMuratsifre2" girer
    And confirm the password kutusuna "drMuratsifre2" girer
    And save butonuna basar
    And password changed yazisinin gorunmedigini test eder


    And Kullanici sayfayi kapatir

