@US_01_API
Feature: registrant_data_api_test

  @Api
  @GetApiRegistrants
  Scenario: TC05 Swagger kullanarak tüm kayıt bilgilerini alın ve doğrulayın
    * Kullanici tum kayit edilenler icin end point belirler
    * Kullanici request gonderirr ve response alirr
    * Kullanici status kodun ikiyuz oldugunu dogrular

  @PostApiRegistrants
  Scenario:TC06 API kullanarak kayıtlı kişiler oluşturun ve doğrulayın
    * Kullanici API icin Url set ederr
    * Kullanici expected datalari girerr
    * Kullanici request gonderir ve response alirr
    * Kullanici  bilgileri dogrularr
