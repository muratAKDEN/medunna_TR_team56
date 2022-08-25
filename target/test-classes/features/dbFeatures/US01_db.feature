@US_001_DB_test
Feature: database_read_feature
 Background: Server Baglanti
 * Kullanici database ile baglanti kurar
@db_ssn_kayit
 Scenario: TC_007_kayitli_ssn_bilgilerini_oku
   *  Kullanici "ssn" bilgilerini "jhi_user" tablosundan getirir
    * Kullanici Database baglatisini kapatir