Feature: US_08 Ana sayfadaki sifre bolumu duzenlenebilir olmalidir

  Background: ortak adimlar
    Given kullanici "medunnaUrl" anasayfasindaa
    Then doktor signInbutonu tiklar
    And doktor loginButonu tiklar
    And doktor "doctorUser" ve "password" girer SignIn tıklar


  Scenario: TC01 "New password confirmation" onaylanabilmelidir.
    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    Then Kullanıcı 'Search Patient' sekmesinde hasta bilgilerinin görünür oldugunu test eder
    And Kullanıcı sayfayı kapatır



  Scenario: TC02 Daha guclü sifre icin en az 1 kucuk harf olmalı ve "Password strength" seviyesinin degistigi gorulmelidir

    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    Then Kullanıcı tablo bilgilerini düzenlemek istediği hastanın yanındaki 'edit' butonuna tıklar
    And Kullanıcı hasta bilgilerinin düzenlenebilir olduğunu test eder
    And Kullanıcı sayfayı kapatır


  Scenario: TC03 sifre en az 1 büyük harf icermeli ve "Password strength" seviyesinin degistigi gorulmelidir

    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    And Kullanici Patient SSN kısmına hastanın SSN bilgisini girer
    Then Kullanici Ilgili hastanın yanındaki 'view' butonuna tıklar
    And Kullanici kayit bilgilerinin gorunur oldugunu test eder
    And Kullanici sayfayi kapatir

  Scenario: TC04 sifre en az 1 rakam icermeli ve "Password strength" seviyesinin degistigi gorulmelidir

    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    Then Kullanıcı tablo bilgilerini düzenlemek istediği hastanın yanındaki edit butonuna tıklar
    And Kullanıcı kayıt bilgilerini siler ve save butonuna tıklar
    And Kullanıcı bilgilerin silinip silinmediğini test eder
    And Kullanıcı sayfayı kapatır

  Scenario: TC05 sifre en az 1 ozel karakter icermeli ve"Password strength" seviyesinin degistigi gorulmelidir
    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    Then Kullanıcı hastaların silinmediğini test eder
    And Kullanici Hasta idsini silemedigini test eder
    And Kullanıcı sayfayı kapatır


  Scenario: TC06 guclu bir parola için sifre en az 7 karakterden oluşmalıdır

    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    And Kullanici Patient SSN kısmına hastanın SSN bilgisini girer
    And Kullanici Arama yapabildigini ve istenilen hastanın gorunur oldugunu test eder
    And Kullanici sayfayi kapatir

  Scenario: TC07 Eski sifre kullanılmamalıdır

    Given Kullanici "Medunnaurl" adresine gider
    And Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then kullanici acilan dropdown menude 'Sign in' butonuna tıklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then Kullanıcı 'My Pages' dropdown menusunu tiklar
    And Kullanıcı 'Search Patient' butonunu tiklar
    And Kullanici Patient SSN kısmına hastanın SSN bilgisini girer
    And Kullanici Arama yapabildigini ve istenilen hastanın gorunur oldugunu test eder
    And Kullanici sayfayi kapatir


