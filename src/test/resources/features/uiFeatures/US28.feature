@US28
Feature:Admin olarak; Country oluşturma / Okuma ve Silme


  Background:Ortak adimlar
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And Admin adi ve sifresiyle siteye girer
    And kullanici Sign In butonuna tiklar
    And Items&Titles butonuna tiklar
    #And Kullanici sayfayi kapatir

  Scenario:TC01
    Given Country secenegine tiklar
    Then Create a new Country butonuna tiklar
    And Name kismina Ülke adini yazar
    And Save butonuna tiklar
    Then Admin yeni ulke olusturdugunu cikan yaziyla dogrular



  Scenario:TC02
    Given StateCity secenegine tiklar
    Then Create a new StateCity butonuna tiklar
    Then Acilan sayfada Name kismina eyalet veya sehrini yazar
    Given StateCity kismina olusturdugu ulkeyi yazar
    And Save butonuna tiklar
    Then kullanici 3 saniye bekler
    And Admin yeni StateCity olusturdugunu cikan yaziyla dogrular


  Scenario:TC03
    Given Country secenegine tiklar
    Then Create a new Country butonuna tiklar
    And Name kismina Ülke adini yazar
    And Save butonuna tiklar
    Then kullanici 3 saniye bekler
    When Delete butonuna basar
    When Cikan dogrulama ekranindan da Delete butonuna basar
    Then kullanici 3 saniye bekler
    And Ulkenin silindiginden emin olur
    Then kullanici 3 saniye bekler
