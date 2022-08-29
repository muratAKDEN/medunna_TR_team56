Feature: Hasta Test sonuclari (Staff)

  Scenario: Kullanici (Staff) hastanin SSN id ile arama yapabilir
    Given Staff medunna sitesine gider
    Then Staff User simgesine tiklar
    Then Staff Sign in secenegini tiklar
    Then Staff gecerli bir username girer
    Then Staff gecerli bir password girer
    Then Staff Sign in butonuna tiklar
    Then Staff My Pages butonuna tiklar
    Then Staff acilan pencereden Search Patient butonuna tiklar
    Then Staff Patient SSN kutusuna gecerli bir SSN girer
    Then Staff bu SSN kimligine kayitli hastanin kaydina erismeyi dogrulamalidir
    And Staff sayfayi kapatir

    Scenario: Kullanici (Staff) test sonuclarini görebilmelidir
      Given Staff medunna sitesine gider
      Then Staff User simgesine tiklar
      Then Staff Sign in secenegini tiklar
      Then Staff gecerli bir username girer
      Then Staff gecerli bir password girer
      Then Staff Sign in butonuna tiklar
      Then Staff My Pages butonuna tiklar
      Then Staff acilan pencereden Search Patient butonuna tiklar
      Then Staff Patient SSN kutusuna gecerli bir SSN girer
      Then Staff Show Appoinments butonuna tiklar
      Then Staff Show Test butonuna tiklar
      Then Staff View Results butonuna tiklar
      Then Staff test sonuclarinin gorulebildigini test eder
      And Staff sayfayi kapatir

      Scenario: Kullanici (Staff) "ID, Date, Result, description, Created date, ..." gibi sonuc
      bilgilerini gorebilmeli ve guncelleyebilmelidir
        Given Staff medunna sitesine gider
        Then Staff User simgesine tiklar
        Then Staff Sign in secenegini tiklar
        Then Staff gecerli bir username girer
        Then Staff gecerli bir password girer
        Then Staff Sign in butonuna tiklar
        Then Staff My Pages butonuna tiklar
        Then Staff acilan pencereden Search Patient butonuna tiklar
        Then Staff Patient SSN kutusuna gecerli bir SSN girer
        Then Staff Show Appoinments butonuna tiklar
        Then Staff Show Test butonuna tiklar
        Then Staff View Results butonuna tiklar
        Then Staff test sonuclarinin gorulebildigini test eder
        Then Staff edit butonuna tiklar
        Then Staff edit sayfasinda description kutusuna tiklar
        Then Staff edit sayfasinda description kutusuna -ifade- yazar
        Then Staff Save butonuna tiklar
        Then Staff Test Result Updated mesajinin goruldugunu dogrular
        And Staff sayfayi kapatir

