Feature: US_19 Admin olarak Yeni Staff (Personel) Olusturma / Guncelleme / Goruntuleme ve Silme

  @US19_TC01
  Scenario Outline: TC01 Admin SSN kullanarak kayitli kisiler arasında Staff arayabilir
    Given ft  "medunnaUrl" sitesine gider
    Then  ft account-menu yi tiklar
    When ft  login butonunu tiklar
    And ft "staffUsername" ve "StaffPassword" bilgilerini girer ve sign in butonuna tiklar
    And ft items-titles e butonuna tiklar
    And ft acilan sekmede Staff 'a tiklar
    And ft Create a new Staff 'a tiklar
    And ft Use Search tiklar
    And ft "<SSN>" girer
    And ft Search User ' tiklar
    And ft search de "User found with search SSN" mesajini gorur
    And ft sayfayi kapatir

    Examples:
      | SSN         |
      | 123-10-1004 |
      | 555-55-1119 |

  @US19_TC02
  Scenario Outline: TC02 Tüm bilgileri doldurulmalıdır
    Given ft  "medunnaUrl" sitesine gider
    Then  ft account-menu yi tiklar
    When ft  login butonunu tiklar
    And ft "staffUsername" ve "StaffPassword" bilgilerini girer ve sign in butonuna tiklar
    And ft items-titles e butonuna tiklar
    And ft acilan sekmede Staff 'a tiklar
    And ft kayitli Staff'in Editine tiklar
    And ft Use Search tiklar
    And ft "<SSN>" girer
    And ft Search User ' tiklar
    Given ft "<BirthDate>"  ve "<phone>" bilgilerini girer
    And ft Gender ve Blood Group secer
    And ft "<address>","<description>" bilgilerini girer
    And ft User, Country ve State City secer
    And ft save butonuna tiklar
    And ft "A new Staff is created" mesajini gorur
    And ft sayfayi kapatir



    Examples:
      | SSN         | BirthDate  | phone        | address                 | description |
      | 111-22-1930 | 01/01/2002 | 555-555-5555 | mehmet mah cetin cad 16 | Fatih Staff |

  @US19_TC03
  Scenario: TC03 Admin kayıtlı kişilerden bir kullanıcı seçebilir

    Given ft  "medunnaUrl" sitesine gider
    Then  ft account-menu yi tiklar
    When ft  login butonunu tiklar
    And ft "staffUsername" ve "StaffPassword" bilgilerini girer ve sign in butonuna tiklar
    And ft items-titles e butonuna tiklar
    And ft acilan sekmede Staff 'a tiklar
    And ft bir kullanici secer
    And ft kayitli kullanicinin tum bilgilerinin gorunurlugunu dogrular
    And ft sayfayi kapatir

  @US19_TC04
  Scenario Outline: TC04 Admin kullanıcı bilgilerini düzenleyebilir

    Given ft  "medunnaUrl" sitesine gider
    Then  ft account-menu yi tiklar
    When ft  login butonunu tiklar
    And ft "staffUsername" ve "StaffPassword" bilgilerini girer ve sign in butonuna tiklar
    And ft items-titles e butonuna tiklar
    And ft acilan sekmede Staff 'a tiklar
    And ft acilan kayitli Staff i edit butonuna tiklar
    And ft "<firstname>" ve "<lastname>" degistirir
    And ft "<birthdate>" ve "<phone>" ogelerini doldurur
    And ft blood group degistirir
    And ft "<adress>" ve "<description>" doldurur
    And ft Country ve City degistir
    When ft save butonuna tiklar
    And ft "A Staff is updated" mesajinin gorunur oldugunu dogrular
    Then ft sayfayi kapatir

    Examples:
      | firstname | lastname | birthdate  | phone        | adress               | description |
      | Yavuz     | Turk     | 06/12/2013 | 123-451-6787 | New York 9876 street | Temizlikci  |

  @US19_TC05
  Scenario: TC05 Admin kullanıcı bilgilerini silebilir

    Given ft  "medunnaUrl" sitesine gider
    Then  ft account-menu yi tiklar
    When ft  login butonunu tiklar
    And ft "staffUsername" ve "StaffPassword" bilgilerini girer ve sign in butonuna tiklar
    And ft items-titles e butonuna tiklar
    And ft acilan sekmede Staff 'a tiklar
    And ft delete dugmesine tiklar
    And ft alert deki delete dugmesine tiklar
    And ft "A Staff is deleted" mesajinin gorundugunu dogrular
    And ft sayfayi kapatir
