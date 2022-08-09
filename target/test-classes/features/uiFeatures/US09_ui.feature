Feature: US09 Staff (Personel), hasta bilgilerini görebilmeli, düzenleyebilmeli ve silebilmelidir.

  Scenario: TC01 Staff "My Pages" sekmesinden hasta bilgilerini görebilmelidir.
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



  Scenario: TC02 Staff bütün hasta bilgilerini düzenleyebilmelidir.
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


  Scenario: TC03 Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilmeli ve tüm kayıt bilgilerinin doldurulduğunu görebilmelidir.
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

  Scenario: TC06 Kullanıcı herhangi bir hasta bilgisini silebilir.
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

  Scenario: TC07 Staff hastaları silememeli.
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


  Scenario: TC08 Staff, hastalari SSN kimliklerine gore arayabilir
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


