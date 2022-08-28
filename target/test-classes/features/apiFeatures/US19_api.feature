@staff
Feature:Staff dogrulamalari

  Scenario Outline: ft api ile staff bilgilerini almali ve dogrulamali
    Given Kullanici "<id>" icin get request yapar
    And ft staff bilgilerini kaydeder
    And ft gelen datayi validate eder "<id>" "<firstName>" "<lastName>" "<phone>" "<ssn>" "<email>"
    Examples: staff data
      | id     | firstName | lastName | phone        | ssn         | email                    |
      | 214870 | Katharine | Ryan     | 541-789-5632 | 757-86-3347 | hunter.treutel@yahoo.com |
