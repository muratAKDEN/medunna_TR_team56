Feature: US07 Kullanici appointment datalariyla DB dogrulamasi yapar

  Scenario: DB test ile appointment datalari dogrulanir

    Given Kullanici Medunna db ile baglanti kurar
    When Kullanici gerekli sorgulamayi yaparak butun appointmentleri cagirir
    Then Daha once olusturulan appointment id ile dogrulama yapar