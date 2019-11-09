Feature: Login

  Acceptance Criteria:
  * In order to favourite a car
  As a user
  I want to know if my login is successful

  Rules:
  * The user must be informed if the login information is incorrect
  * The user must be taken to My Profile page if the login is successful

  @high-impact
  Scenario Outline: a registered user logs into the website
    Given I am logged out
    When I enter username "<username>" and "<password>"
    Then The user is taken to My Profile page
    Examples:
    | username                   | password
    | mishal.shah@somoglobal.com | London145
    | mishalshah_1@hotmail.com   | London145
    | mishalashah.01@gmail.com   | London145

