Feature: DB kullanarak staff leri doğrulayın

  @US19_TC06
  Scenario : TC06 ft DB baglanarak staff bilgilerini dogrular
    Given ft DB ile Medunna veri tabanina baglanir
    Then Personel Kimliğini veritabanı kimliğiyle doğrular
    And ft DB ile "staff" tablosundaki "id" 205227 olan staff in verilerini alir
    Then ft DB ile alinan datalari validate eder