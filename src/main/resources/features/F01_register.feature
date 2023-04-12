Feature: F01_Register | user should be able to register

  Scenario: user can register
    Given user open Register Link
    When user enter personal data
    And user click on Register button
    Then user is registered successfully