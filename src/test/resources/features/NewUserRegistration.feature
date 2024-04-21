Feature: New User Registration Functionality

  Scenario Outline: Register different user credentials
    Given the user set first name "<firstName>"
    Given the user set family name "<familyName>"
    Given the user set e-mail "<email>"
    Given the user set password "<password>"
    Given the user set quiz number "<quizNumber>"
    Given the user accept GDPR conditions
    When the user click Submit button
    Then a result for incorrect user data happens

    Examples:
      | firstName | familyName | email      | password | quizNumber |
      |           | Георгиева  | abv@aaa.bg | parola   | 100        |
      | Ваня      |            | abv@aaa.bg | parola   | 100        |
      | Ваня      | Георгиева  |            | parola   | 100        |
      | Ваня      | Георгиева  | abv@abv.bg |          | 100        |
      | Ваня      | Георгиева  | abv@abv.bg | parola   |            |