@w
Feature: US09 Staff (Personel), hasta bilgilerini gorebilmeli, duzenleyebilmeli ve silebilmelidir

  Background:
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    And Kullanici sayfayi kapatir

  Scenario: TC01 Staff "My Pages" sekmesinden hasta bilgilerini görebilmelidir
    Then Kullanıcı 'Search Patient' sekmesinde hasta bilgilerinin görünür oldugunu test eder
    And Kullanici sayfayi kapatir


  Scenario: TC02 Staff bütün hasta bilgilerini düzenleyebilmelidir.
    Then Kullanıcı tablo bilgilerini düzenlemek istediği hastanın yanındaki 'edit' butonuna tıklar
    And Kullanıcı hasta bilgilerinin düzenlenebilir olduğunu test eder
    And Kullanici sayfayi kapatir


  Scenario: TC03 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir
    And Kullanici Patient SSN kısmına hastanın SSN bilgisini girer
    Then Kullanici Ilgili hastanın yanındaki 'view' butonuna tıklar
    And Kullanici kayit bilgilerinin gorunur oldugunu test eder
    And Kullanici sayfayi kapatir

  Scenario: TC06 Kullanıcı herhangi bir hasta bilgisini silebilir
    Then Kullanıcı tablo bilgilerini düzenlemek istediği hastanın yanındaki 'edit' butonuna tıklar
    And Kullanıcı kayıt bilgilerini siler ve save butonuna tıklar
    And Kullanıcı bilgilerin silinip silinmediğini test eder
    And Kullanici sayfayi kapatir

  Scenario: TC07 Staff hastaları silememeli
    Then Kullanıcı hastaların silinmediğini test eder
    And Kullanici sayfayi kapatir


  Scenario: TC08 Staff, hastalari SSN kimliklerine gore arayabilir
    And Kullanici Patient SSN kısmına hastanın SSN bilgisini girer
    And Kullanici Arama yapabildigini ve istenilen hastanın gorunur oldugunu test eder
    And Kullanici sayfayi kapatir



