Feature: Home Page Features

  Scenario: Accept cookies and start new user registration
    Given the user accept cookies
    When the user click Register button
    Then the Registration form opens