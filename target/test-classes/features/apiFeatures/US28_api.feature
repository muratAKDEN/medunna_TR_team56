Feature: US28 API Admin olarak; Country oluşturma / Okuma ve Silme


  @US_28Api

  Scenario:Kullanici Country bilgilerini API ile dogrulayabilmelidir

    Given Kullanici country icin request gonderir ve response alir
    And Kullanici statuscodeun 200 oldugunu dogrular
    And Kullanici gelen Json Country datalarini javaya donusturur
    And Kullanici API ile gelen bilgileri dogrular

  @US_28Put
  Scenario:Kullanici API kullanarak mevcut ulkeleri guncelleyebilmelir

    Given Admin mevcut countryi gunceller
    And Admin country icin put request gonderir ve response alir
    And Admin statuscodeun 200 oldugunu dogrular
    And Admin API ile gelen bilgileri gunceller