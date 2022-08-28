@w
Feature: US09 Staff (Personel), hasta bilgilerini gorebilmeli, duzenleyebilmeli ve silebilmelidir

  Background:
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "staffUser" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    Then NBH 'My Pages' dropdown menusunu tiklar
    And NBH 'Search Patient' butonunu tiklar




  Scenario: TC01 Staff "My Pages" sekmesinden hasta bilgilerini görebilmelidir
    Then NBH 'Search Patient' sekmesinde hasta bilgilerinin gorunur oldugunu test eder
    And Kullanici sayfayi kapatir


  Scenario: TC02 Staff butun hasta bilgilerini duzenleyebilmelidir.
    Then NBH tablo bilgilerini duzenlemek istediği hastanin yanindaki 'edit' butonuna tiklar
    And NBH hasta bilgilerinin duzenlenebilir oldugunu test eder
    And Kullanici sayfayi kapatir


  Scenario: TC03 Kullanici, SSN'lerine gore yeni bir basvuru sahibi arayabilmeli ve tum kayit bilgilerinin dolduruldugunu gorebilmelidir
    And NBH Patient SSN kismina hastanin SSN bilgisini girer
    Then NBH ilgili hastanin yanindaki 'view' butonuna tiklar
    And NBH kayit bilgilerinin gorunur oldugunu test eder
    And Kullanici sayfayi kapatir


  Scenario: TC06 Kullanici herhangi bir hasta bilgisini silebilir
    Then NBH tablo bilgilerini duzenlemek istediği hastanin yanindaki 'edit' butonuna tiklar
    Then NBH kayit bilgilerini siler ve save butonuna tiklar
    And NBH bilgilerin silinip silinmedigini test eder
    And Kullanici sayfayi kapatir

  Scenario: TC07 Staff hastalari silememeli
    Then NBH hastalarin silinmedigini test eder
    And Kullanici sayfayi kapatir


  Scenario: TC08 Staff, hastalari SSN kimliklerine gore arayabilir
    And NBH Patient SSN kismina hastanin SSN bilgisini girer
    And NBH Arama yapabildigini ve istenilen hastanin gorunur oldugunu test eder
    And Kullanici sayfayi kapatir




