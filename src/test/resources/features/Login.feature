@Login
  Feature:
    As a user I want to login website sauce demo

  Scenario: Normal Login
    Given  User already on website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    Then User already on product page

    Scenario: Invalid Login
      Given  User already on website sauce demo
      When User input "standard_user" as userName and input "" as password
      Then User see "Epic sadface: Password is required" as error text on login page

    Scenario Outline:
      Given  User already on website sauce demo
      When User input "<userName>" as userName and input "<password>" as password
      Then User see "<errorText>" as error text on login page
Examples:
  | userName      | password     | errorText                                                                 |
  | standard_user |              | Epic sadface: Password is required                                        |
  |               | secret_sauce | Epic sadface: Username is required                                        |
  |               |              | Epic sadface: Username is required                                        |
  | Tigor         | Keren        | Epic sadface: Username and password do not match any user in this service |