Feature: US26 Mesaj gonderme

  @tt
Scenario: US26_TC01 İletişim Mesajı (Contact messages)
  Given Kullanici "medunnaUrl" adresine gider
  And  content butonuna tiklar
  And  mesaj icin gerekli olan name kutucugu doldurur
  And  mesaj icin gerekli olan email kutucugu doldurur
  And  mesaj icin gerekli olan Subject kutucugu doldurur
  And  mesaj icin gerekli olan Message kutucugu doldurur
  Then Send butonuna taklar
  Then Kullanici sayfayi kapatir