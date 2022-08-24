Feature: DB kullarak personelleri dogrulayin

  Scenario: TC06 ft DB baglanarak doktor bilgilerini dogrular
    Given ft DB ile Medunna veri tabanina baglanir
    When ft DB ile "staff" tablosundaki butun verilerini alir
    And ft DB ile "staff" tablosundaki "id" 217647 olan personelin verilerini alir
    And ft DB ile personelin verileri okur
    Then ft DB ile alinan datalari validate eder
    And ft DB tüm veri kayıtlarını ilgili dosyalara kaydeder
    And ft veritabanı bağlantısını kapat