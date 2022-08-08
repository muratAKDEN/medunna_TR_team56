@tum
Feature: Register giris
  Background: Ortak stepler
    Given Medunna url'sine tiklar
    * Kullanici sayfanin en ust sag kismindaki adam ikonuna tiklar
    * Kullanici Register buttonuna tiklar.
  @TC001
  Scenario: Geçerli bir SSN, 3. ve 5. rakamdan sonra "-" içermeli ve 9 rakamdan oluşmalıdır.
    * Kullanici ilk uc haneyi rakam girer; dorduncu haneyi '-' girer; besinci ve altinci haneyi rakam olarak girer; yedinci haneyi '-'girer; sekizinci ve onbirinci hane arasini rakam olarak girer.
    * Your SSN is required. yazisinin gorunmedigini test eder
  @TC002
  Scenario: SSN bos birakilamaz
    * Kullanici SSN kutucugu bos olup olmadigini kontrol eder
  @TC003
  Scenario: Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir FirstName  olmalıdır
    * Kullanici Name kutucuguna sembolik karakter icermeyen isim girer
    * Kullanici Name kutucugunun bos olup olmadigini konrol eder
  @TC004
  Scenario: Kullanici LastName kutucuguna sembolik karakter icermeyen soyisim girer
    * Kullanici LastName kutucuguna sembolik karakter icermeyen soyisim girer
    * Kullanici LastName kutucugunun bos olup olmadigini konrol eder