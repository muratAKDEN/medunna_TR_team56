Feature: DB kullarak doktorlari dogrulayin

  Scenario: TC06 Admin DB baglanarak doktor bilgilerini dogrular
    Given kullanici DB ile Medunna veri tabanina baglanir
    And kullanici DB ile "physician" tablosundaki "id" 164031 olan doktorun verilerini alir
    And kullanici DB ile doktorun verileri okur
    Then kullanici DB ile alinan datalari validate eder