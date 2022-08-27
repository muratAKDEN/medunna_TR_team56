Feature:physician api test
  Scenario: API kullanarak doktorları doğrulayın
    Given kullanici physicianslar icin Get request yapar
    When kullanici gelen physician datayi desarialize yapar
    Then kullanici physician datasini validate eder