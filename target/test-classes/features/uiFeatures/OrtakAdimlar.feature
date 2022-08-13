Feature: ortak

  Scenario: asdf

    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "String" girer
    And kullanici password olarak "String" girer
    And kullanici Sign In butonuna tiklar
    And Kullanici sayfayi kapatir