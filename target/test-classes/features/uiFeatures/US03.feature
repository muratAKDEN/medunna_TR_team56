@tumu
Feature: US03 Registration sayfasında güçlü şifre girilmeli ve "Password strength" seviyeleri görülebilmelidir.

  @TC01
  Scenario: TC01 guclu sifre giris
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then register butonuna basar
    And kullanici sayfada elementi bulana kadar asagiya iner
    Then password kutusuna en az bir kucuk harf gonderir
    And  password strenght seviyesinin kirmizi oldugunu test eder



  @TC02
  Scenario: TC02 guclu sifre giris
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then register butonuna basar
    And kullanici sayfada elementi bulana kadar asagiya iner
    Then password kutusuna en az bir buyuk harf gonderir
    And  password strenght seviyesinin turuncu oldugunu test eder


  @TC03
  Scenario: TC03 guclu sifre giris
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then register butonuna basar
    And kullanici sayfada elementi bulana kadar asagiya iner
    Then password kutusuna en az bir rakam gonderir
    And  password strenght seviyesinin acik yesil oldugunu test eder

  @TC04
  Scenario: TC04 guclu sifre giris
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then register butonuna basar
    And kullanici sayfada elementi bulana kadar asagiya iner
    Then password kutusuna en az bir ozel karakter gonderir
    And  password strenght seviyesinin koyu yesil oldugunu test eder

  @TC05
  Scenario: TC05 guclu sifre giris
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And register butonuna basar
    Then kullanici sayfada elementi bulana kadar asagiya iner
    Then password kutusuna en az yedi karakter gonderir
    And guclu bir parola oldugunu test eder
