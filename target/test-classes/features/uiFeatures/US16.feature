Feature: US 16 Admin oda olusturur siler duzenler

  Background: ortak adimlar
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    And kullanici acilan dropdown menude signIn butonuna tiklar
    And kullanici username olarak "admin" girer
    And kullanici password olarak "password" girer
    And kullanici Sign In butonuna tiklar
    And Items&Titles elementine tiklar
    And admin room sekmesine tiklar
    And create a new Room sekmesine tiklar

  Scenario: TC 01 admin yatan adimlar icin oda olusturabilir

    And Create a new room yazi elementinin gorunur oldugu test edilir

  Scenario: TC 02 Oda olusturulurken Room Number mutlaka olmali ve Room Type TWIN DELUXE PREMIUM_DELUXE SUIT ve DAYCARE olmali

    And admin acilan sayfada room number sekmesini doldurur
    And Room Type TWIN DELUXE PREMIUM_DELUXE SUIT ve DAYCARE olmali
    And kullanici sayfayi kapatir

  Scenario: TC 03 Oda icin status ayarlanabilir olmali
    And admin status checkbox tiklar
    And admin status checkbox tiklandgini test eder
    And admin status checkbox tiklar
    And admin status checkbox tiklanmadigini test eder
    And kullanici sayfayi kapatir

  Scenario:TC 04 fiyat girilebilir olmali bos birakilmamali
    # admin room sekmesine tiklar
    And admin status checkbox tiklar
    And hata mesajinin gorundugunu test eder
    And admin acilan sayfada room number sekmesini doldurur
    And price kismina tiklar
    And  description kismina tiklar
    And price hata mesajinin gorundugunu test eder
    And fiyat bilgisi girer
    And save butonuna basar
    And kullanici sayfayi kapatir

