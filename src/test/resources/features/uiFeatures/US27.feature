Feature: US27 Messages by Admin Validate with API and DB


  @mesaj
  Scenario: TC01 Admin, mesaj portalına gidebilir ve tüm mesajları, yazarlarını ve e-postalarını görüntüleyebilir
    Given Admin medunna ana sayfasina gider
    When Anasayfada giris butonuna tiklar
    Then SignIn secenegine tiklar
    And Gecerli bir admin kullaniciAdi girer
    And Gecerli bir sifre girer
    And SignIn buttonuna tiklar
    Then kullanici 3 saniye bekler
    And Items & Titles menusune tiklar
    And Items & Titles menusunden Messages'i secer
    And Tum mesajlari, yazarlarini ve e-postalarini goruntuleyebilir
    And kullanici sayfayi kapatir


    @delete
    Scenario: TC02 Admin, mesajları oluşturabilir, güncelleyebilir, silebilir
      Given Admin medunna ana sayfasina gider
      When Anasayfada giris butonuna tiklar
      Then SignIn secenegine tiklar
      And Gecerli bir admin kullaniciAdi girer
      And Gecerli bir sifre girer
      And SignIn buttonuna tiklar
      Then kullanici 3 saniye bekler
      Then Items & Titles menusune tiklar
      And Items & Titles menusunden Messages'i secer
      And Create and new message menusune tiklar
      Then kullanici 3 saniye bekler
      Then Name, e-mail, subject, message alanlarini doldurur
      Then kullanici 3 saniye bekler
      And Save tusuna basar
      Then kullanici 3 saniye bekler
      Then Yeni bir mesaj olusturuldu yazısı goruntulenir
      Then kullanici 6 saniye bekler
      And Admin edit tusuna basar
      And Cikan ekranda message yazisini günceller ve save tusuna basar
      Then kullanici 3 saniye bekler
      And Mesaj guncellendi yazisi goruntulenir
      Then kullanici 6 saniye bekler
      Then Admin delete tusuna basar, cikan onay tusuna tiklar
      Then kullanici 3 saniye bekler
      And Mesaj silindi yazisi goruntulenir
      And kullanici sayfayi kapatir
