@us17
Feature: Test items(oge) Olustur / Guncelle / Sil

  @us17tc01
  Scenario: TC01 Admin yeni test ogeleri olusturabilir
    And Admin olarak "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Admin olarak gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Items&Titles elementine tiklar
    And Test Item elementine tiklar
    And Create a new Test Item elementine tiklar
    And Yeni test ogesi olusturulabildigini kontrol eder
    And Olusturulan test items verisini siler
    And Sayfayi kapatir

  @us17tc02
  Scenario: Admin, test items; Name, Description, price Default min value,
  Default max value ve created date (Gun/Ay/Yil) olusturabilir ve guncelleyebilir.
    And Admin olarak "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Admin olarak gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Items&Titles elementine tiklar
    And Test Item elementine tiklar
    And Create a new Test Item elementine tiklar
    And Test Item formunun doldurulabildigini kontrol eder
    And Test Item formunun guncellenebildigini kontrol eder
    And Olusturulan test items verisini siler
    And Sayfayi kapatir

  @us17tc03
  Scenario: Admin test ogelerini goruntuleyebilir.
    Given Admin olarak "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Admin olarak gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Items&Titles elementine tiklar
    And Test Item elementine tiklar
    And Create a new Test Item elementine tiklar
    And Test Item formunu doldurur
    And Olusturulan test ogesininin goruntulendigini kontrol eder
    And Olusturulan test items verisini siler
    And Sayfayi kapatir

  @us17tc04
  Scenario: Admin test öğelerini silebilir.
    Given Admin olarak "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Admin olarak gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Items&Titles elementine tiklar
    And Test Item elementine tiklar
    And Create a new Test Item elementine tiklar
    And Test Item formunu doldurur
    And Olusturulan test items verisini siler
    And Test items silindigini kontrol eder
    And Sayfayi kapatir

  @us17tc05
  Scenario: API ile dogrulayin.
    Given Admin olarak "medunnaUrl" ana sayfasina gider
    And Anasayfada giris ikonuna tiklar
    And Sign in secenegine tiklar
    And Admin olarak gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    And Items&Titles elementine tiklar
    And Test Item elementine tiklar
    And Create a new Test Item elementine tiklar
    And Test Item formunu doldurur
    And Test items olusturuldugunu API ile kontrol eder
    And Test items formunu gunceller
    And Test items guncellendigini API ile kontrol eder
    And Olusturulan test items verisini siler
    And Test items silindigini API ile kontrol eder
    And Sayfayi kapatir

  @us17tc06
  Scenario: API ile test items oluşturun.
    Given Admin API ile test items olusturur
    And API ile Test items olusturuldugunu API ile kontrol eder
    And Sayfayi kapatir

 #@us17tc07
 #Scenario: DB ile dogrulayin.
 #  Given Admin olarak "medunnaUrl" ana sayfasina gider
 #  And Anasayfada giris ikonuna tiklar
 #  And Sign in secenegine tiklar
 #  And Admin olarak gecerli bir username girer
 #  And Gecerli bir parola girer
 #  And Sign in buttonuna tiklar
 #  And Items&Titles elementine tiklar
 #  And Test Item elementine tiklar
 #  And Create a new Test Item elementine tiklar
 #  And Test Item formunu doldurur
 #  And Test items olusturuldugunu DB ile kontrol eder
 #  And Test items formunu gunceller
 #  And Test items guncellendigini DB ile kontrol eder
 #  And Olusturulan test items verisini siler
 #  And Test items silindigini DB ile kontrol eder
 #  And Sayfayi kapatir





