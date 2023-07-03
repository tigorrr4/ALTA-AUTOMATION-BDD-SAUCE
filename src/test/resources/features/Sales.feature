@Sales
  Feature: Sales
    As a user I want Add item and do check out

#              #Screnario 1
#    Scenario: User Add item on cart
#      Given User already login
#      And User Click add Labonesie too cart button
#      And User Click add RedTshirt too cart button
#      Then Item added to cart
#
#
#              #Screnario 2
#    Scenario: User Add 2 item and remove 1 item on cart
#      Given User already login
#      And User Click add Labonesie too cart button
#      And User Click add RedTshirt too cart button
#      And User click cart button
#      When User Click Remove RedTshirt on cart button
#      Then User Click checkout button
#
                  #Screnario 1
    Scenario Outline: User do checkout item
      Given User already login
      When User sort product list by "Name (Z to A)"
      And User Click add Labonesie too cart button
      And User Click add RedTshirt too cart button
      And User click cart button
      When User Click Remove RedTshirt on cart button
      And User Click checkout button
      And User input "<firstName>" as firstname and input "<lastName>" as lastname and input "<zipCode>" as zipCode
      When User Click Continue button
      And User see items on checkout overview page
      And User click finish button
      Then User Confirmation order item on chekcout compelete page
      Examples:
        | firstName | lastName | zipCode |
        | Rolando   | Tigor    | 55000   |








#    Scenario Outline: User fill check out information
#      Given User Click checkout button
#      And User input "<firstName>" as firstname and input "<lastName>" as lastname and input "<zipCode>" as zipCode
#      When User Click Continue button
#      Then  User see items on checkout overview page
#      Examples:
#        | firstName | lastName | zipCode |
#        | Rolando   | Tigor    | 55000   |
#
#
#
#              #Scenario 3
#  Scenario: User sort product cart
#    Given  User already on website sauce demo
#    When User input "standard_user" as userName and input "secret_sauce" as password
#    Then User already on product page
#    When User sort product list by "Price (high to low)"


#    Scenario 4
#  Scenario: Confirm items check out
#    Given User already fill check out data
#    And User see items on checkout overview page
#    Then User confirm order on checkout complete page





