@US02_UI
Feature:US02 Kayıt olmak için email and username bilgileri girilebilmelidir.
  Background: Kullanici register sayfasina gider
    Given Kullanici "medunnaUrl" adresine gider
    Then Kullanici sayfanin sag ust kosesinde yer alan insan ikonuna tiklar
    Then Hg Register butonuna tiklar


  @TC001
    @Tamamen_bos_username
    Scenario:TC01 bos username kutusu
    * Hg username kutusuna tiklar
    * Hg bos alana tiklar
    * Hg Your username is required mesajinin gorundugunu test eder
    @ozel_karakter_username
    Scenario Outline: TC01 ozel karakter username
      *  Hg username kutusuna tiklar
      *  Hg ozel karakter iceren "<username>" olusturur
      *  Hg bos alana tiklar
      *  Hg Your username is invalid mesajinin gorundugunu test eder

      Examples:
        |username|
        |!ali#|

      @bosluk_username
      Scenario Outline: TC01 bosluk username
      * Hg username kutusuna tiklar
      * Hg bosluk iceren "<username>" olusturur
      * Hg bos alana tiklar
      * Hg Your username is invalid mesajinin gorundugunu test eder
        Examples:
          |username|
          |ali baba|

  @TC003
        Scenario Outline: Gecersiz email
    * Hg e-mail kutusuna tiklar
    * Hg yeni "<email>"  olusturur
    * Hg bos alana tiklar
    * Hg This field is invalid yazisinin goruntulendigini dogrular
    Examples:|email|
      |alibabagmailcom |
      |@alibabagmail.com|
      |alibaba@gmail    |
      |alibaba.gmail@com |

  @TC004
    Scenario: E-mail boş bırakılamaz
    * Hg e-mail kutusuna tiklar
    * Hg bos alana tiklar
    * Hg Your email is required yazisinin goruntulendigini  dogrular



