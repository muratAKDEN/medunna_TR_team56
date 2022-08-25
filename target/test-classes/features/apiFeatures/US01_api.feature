@US_01_API
Feature: registrant_data_api_test

  @Api
  @GetApiRegistrants
  Scenario: TC05 Swagger kullanarak tüm kayıt bilgilerini alın ve doğrulayın
    * Kullanici tum kayit edilenler icin end point belirler
    * Kullanici request gonderir
    * Kullanici request gonderir
    * Kullanici tum kayit edilenlerin sayisinin beklenen sonucla ayni olduğunu dogrular
  @PostApiRegistrants
  Scenario:TC06 API kullanarak kayıtlı kişiler oluşturun ve doğrulayın
    * Kullanici API icin Url set ederr
    * Kullanici expected datalari girerr
    * Kullanici request gonderir ve response alirr
    * Kullanici  bilgileri dogrularr
