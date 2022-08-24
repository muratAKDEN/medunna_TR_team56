Feature: US27 Messages by Admin Validate with API and DB

  @postMessage
  Scenario: TC01 Kullanıcı, API kullanarak ileti oluşturmayı doğrulamalıdır

    Given kullanici url'i hazirlar
    When kullanici expected datayi hazirlar
    And kullanici post request gonderir ve response u kaydeder
    Then kullanici gerekli dogrulamayi yapar

    @getMessage
  Scenario: TC02 Kullanıcı, API kullanarak ileti okumayı doğrulamalıdır

    Given kullanici url'i hazirlar
    When kullanici expected datayi hazirlar
    And kullanici get request gonderir ve response'u kaydeder
    Then kullanici iletiyi okumak icin gerekli dogrulamayi yapar




