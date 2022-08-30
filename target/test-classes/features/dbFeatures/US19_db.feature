@DbStaff
Feature: Admin DB kullanarak staff dogrular

  Scenario Outline:Admin staff id ile sorgulama yapar.
    Given Admin sataff icin DB ile baglanti kurar
    Given Admin "<id>"ile staff sorgulama yapar
    And Admin "<last_name>" staff bilgisini validate eder
    And ft DB baglantisini kapatir
    Examples: Data
      | id     | last_name |
      | 214338 | world     |
