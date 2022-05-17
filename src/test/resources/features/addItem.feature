@addItem
Feature: To add item in Warenkorb
  To add item in Warenkorb and check by name

  Scenario: Successful add item in Warenkorb
    Given Navigate to Homepage
    When Click on Anmelden icon
    Then Login page displayed

    When Enter valid user credentials
    And Click on Anmelden button
    Then Homepage displayed

    When Click on the Möbel menu
    And Click on the article menu
    And Click on the chosen article
    And Click on In den Warenkorb button
    And Click on button Warenkorb
    Then Selected article displayed