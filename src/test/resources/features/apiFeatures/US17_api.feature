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
#    And Sayfayi kapatir