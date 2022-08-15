
Feature:patient_data_api_test


  @GetApiAppointments
    Scenario:TC03 SwaggerDoc kullanarak appointmens alin ve dogrulayin
    Given Kullanici appointments icin endpoint belirler
    And Kullanici send request ve get response yapar
    Then Kullanici status code ikiYuz olarak dogrular

