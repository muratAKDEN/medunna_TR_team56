Feature: US14 Physician (Doctor) "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli

  @Giris
  Scenario:  TC01 Doktor Edit Inpatient bilgilerini görüntülüyebilmeli

    Given Doktor Medunna ana sayfasina gider
    When Anasayfada giris butonuna tiklar
    Then Sign in secenegine tiklar
    And Gecerli bir kullaniciAdi girer
    And Gecerli bir sifre girer
    And SignIn buttonuna tiklar
    Then kullanici 3 saniye bekler
    Then MY PAGES menusune tiklar
    And MY PAGES menuden My Inpatients'i secer
    And Cikan sayfada ""ID, Start Date, End date, Satatus, Description, Created Date, Room, Appointment id and Patient" bilgilerinin goruntulenebildigini test eder
    And kullanici sayfayi kapatir



  @Status
  Scenario:  TC02 Doktor status bilgilerini guncelleyebilmeli
    Given Doktor Medunna ana sayfasina gider
    When Anasayfada giris butonuna tiklar
    Then Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    Then kullanici 3 saniye bekler
    Then MY PAGES menusune tiklar
    And MY PAGES menuden My Inpatients'i secer
    And Cikan sayfada edit butonuna tiklanir
    Then kullanici 3 saniye bekler
    Then status menusunden "UNAPPROVED" sekmesi secilerek save tusuna basilir. "UNAPPROVED"yazisi goruntulenir
    And status menusunden "STAYING" sekmesi secilerek save tusuna basilir. "STAYING"yazisi goruntulenir
    And status menusunden "DISCHARGED" sekmesi secilerek save tusuna basilir. "DISCHARGED"yazisi goruntulenir
    And status menusunden "CANCELLED" sekmesi secilerek save tusuna basilir. "CANCELLED"yazisi goruntulenir



  @Rezerve
  Scenario:  TC03 Doktor rezerve edilmiş odayı güncelleyebilmeli

    Given Doktor Medunna ana sayfasina gider
    When Anasayfada giris butonuna tiklar
    Then Sign in secenegine tiklar
    And Gecerli bir username girer
    And Gecerli bir parola girer
    And Sign in buttonuna tiklar
    Then kullanici 3 saniye bekler
    Then MY PAGES menusune tiklar
    And MY PAGES menuden My Inpatients'i secer
    And Cikan sayfada yatan bir hastanin edit butonuna tiklanir
    Then kullanici 3 saniye bekler
    And "Room" menusunden herhangi bir oda secilerek save tusuna basilir.
    Then kullanici 3 saniye bekler
    And Yeni sayfada degisikligin oldugu goruntulenir.