@US10_API
Feature: US10_DoktorRandevulari

  @Api
  Scenario: API ile randevuları doğrulayın
    Given user set the URL
    Then user sends GET request for appointments
    When user receives response with status code two hundred
    Then user verifies that response contains physicianID