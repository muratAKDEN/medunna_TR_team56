Feature: DB kullanarak doktorları doğrulayın

  @US18_TC06
  Scenario : TC06 Admin DB baglanarak doktor bilgilerini dogrular
    Given kullanici DB ile Medunna veri tabanina baglanir
    And kullanici DB ile "physician" tablosundaki "id" 164031 olan doktorun verilerini alir
    And kullanici DB ile "id" 164031 olan doktorun verileri okur
    Then DB ile alinan datalari validate eder



