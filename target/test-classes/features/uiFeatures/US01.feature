@US01_UI
Feature:US01 Kayıt olmak için SSN, Firstname ve Lastname bilgileri girililebilmelidir.
  Background: Kullanici_register_sayfasina_gider
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then Hg Register butonuna tiklar
    And Kullanici sayfayi kapatir
  @TC001
  Scenario Outline: Gecerli bir SSN uc ve besinci rakamdan sonra - icermeli ve dokuz rakamdan olusmalıdır.
    * Hg ssn kutucuguna tiklar
    * Hg dokuz haneli "<ssn>" girer
    * Hg bos alana tiklar
    * Hg Your SSN is required yazisinin gorunmedigini test eder
    Examples:
      |ssn|
      |123-56-1235|
      |243-41-6534|
      |567-12-2145|
      |467-54-5242|


  @TC002
  Scenario: SSN bos birakilamaz
    *  Hg ssn kutucuguna tiklar
    *  Hg firstname kutucuguna tiklar
    *  Hg Your SSN is required yazisinin goruntulendigini dogrular
  @TC003
  Scenario Outline: Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir FirstName  olmalıdır
    * Hg firstname kutucuguna tiklar
    * Hg firstname kutucuguna karakter iceren "<isim>" girer
    * Hg hata metni goruldugunu dogrular
    Examples:|isim|
      |ali*|
    @TC003_1
      Scenario:firstname kutucugunun bos olup olmadigini dogrular
      * Hg firstname kutucuguna tiklar
      * Hg lastname kutucuguna tiklar
      * Hg firstname kutucugunun bos olup olmadigini dogrular
  @TC004
  Scenario Outline: Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir LastName  olmalıdır
    * Hg lastname kutucuguna tiklar
    * Hg lastname kutucuguna karakter iceren "<soyisim>" girer
    * Hg hata metni goruldugunu dogrular
    Examples:|soyisim|
    |ali*|
  @TC004_1
  Scenario:Lastname kutucugunun bos olup olmadigini dogrular
    * Hg lastname kutucuguna tiklar
    * Hg bos alana tiklar
    * Hg lastname kutucugunun bos olup olmadigini dogrular