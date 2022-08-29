@US23
Feature: US023 Kullanici Staff rolu ile fatura olusturup dogrulayabilmeli

  Background:

    Given kullanici medunna anasayfasina gider

  Scenario: US023-TC001 Kullanici Hasta olarak randevu olusturur
    And kullanici hasta rolu ile oturum acar
    Then kullanici hasta mypage acilir butonuna tiklar
    And kullanici make an appointment butonuna tiklar
    And kullanici randevu bilgilerini doldurur
    And kullanici send an appointment butonunu tiklar

  Scenario: US023-TC002 Kullanici Staff rolu ile olusturulan randevuyu onaylar
    And kullanici staff rolu ile oturum acar
    Then kullanici staff mypage acilir butonuna tiklar
    And kullanici search patient butonuna tiklar
    Then kullanici patient SSN bolumune "123-45-4326" nolu SSN no girer
    And kullanici show appointments butonuna tiklar
    And kullanici alinan randevunun edit butonuna tiklar
    And kullanici status bolumune pending secenegini secer
    And kullanici Physician bolumune "154299:Doktor Team50:PATHOLOGY" ID nolu doktor atamasini yapar
    And kullanici save butonuna tiklar

  Scenario: US023-TC003 Kullanici Doktor rolu ile atanan randevunun islemlerini tamamlar
    And kullanici doktor rolu ile oturum acar
    Then kullanici doktor mypage acilir butonuna tiklar
    And kullanici my appointments butonuna tiklar
    And kullanici atanan randevunun edit butonuna tiklar
    Then kullanici Request A Test butonuna tiklar
    And kullanici cccs, Sodium ve Urea testlerini secer
    And kullanici test bolumu save butonuna tiklar
    Then kullanici status kutusundan completed secenegini secer
    And kullanici anamneis, treatment, diagnosis kutularini doldurur
    And kullanici create bolumu save butonuna tiklar

  Scenario: US023-TC004
    And kullanici staff rolu ile oturum acar
    Then kullanici staff mypage acilir butonuna tiklar
    And kullanici search patient butonuna tiklar
    Then kullanici patient SSN bolumune "123-45-4326" nolu SSN no girer
    And kullanici show appointments butonuna tiklar
    Then kullanici fatura icin hastanin payment butonuna tiklar
    And kullanici create invoice butonuna tiklar
    And kullanici create or edit sayfasinda save butonuna tiklar
    Then kullanici patient SSN bolumune "123-45-4326" nolu SSN no girer
    And kullanici show appointments butonuna tiklar
    Then kullanici fatura icin hastanin payment butonuna tiklar
    And kullanici show invoice butonuna tiklar
    And kullanici faturanin olustugunu dogrular
