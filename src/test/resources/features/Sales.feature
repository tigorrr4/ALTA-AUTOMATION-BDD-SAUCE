@Sales
  Feature: Sales
    As a user I want Add item and do check out

#                  #Screnario 1
#    Scenario Outline: User do checkout item
#      Given User already login
#      When User sort product list by "<filter>"
#      And User click add Labs onesie too cart button
#      And User click add RedT shirt too cart button
#      And User click cart button
#      When User click remove RedT shirt on cart button
#      And User click checkout button
#      And User input "<firstName>" as firstname and input "<lastName>" as lastname and input "<zipCode>" as zipCode
#      When User click continue button
#      And User see items on checkout overview page
#      And User click finish button
#      Then User confirmation order item on checkout complete page
#      Examples:
#        | firstName | lastName | zipCode |
#        | Rolando   | Tigor    | 55000   |
#      Examples:
#        | filter        |
#        | Name (Z to A) |



                #Screnario 1
    Scenario Outline: User do checkout item
      Given User already login
      When  User sort product list by "Name (Z to A)"
      And   User click add Labs onesie too cart button
      And   User click add RedT shirt too cart button
      When  User click cart button
      And   User click remove RedT shirt on cart button
      And   User click checkout button
      When  User input "<firstName>" as firstname and input "<lastName>" as lastname and input "<zipCode>" as zipCode
      And   User click continue button
      Then  User see items on checkout overview page
      And   User click finish button
      Then  User confirmation order item on checkout complete page
      Examples:
        | firstName | lastName | zipCode |
        | Rolando   | Tigor    | 55000   |
#


##               Screnario 1
#    Scenario Outline: User do checkout item
##      Given User already login
##      When  User sort product list by "Name (Z to A)"
##      And   User click add Labs onesie too cart button
##      And   User click add RedT shirt too cart button
##      When  User click cart button
#      Given User already remove  item
#      And   User click checkout button
#      When  User input "<firstName>" as firstname and input "<lastName>" as lastname and input "<zipCode>" as zipCode
#      And   User click continue button
#      Then  User see items on checkout overview page
#      And   User click finish button
#      Then  User confirmation order item on checkout complete page
#      Examples:
#        | firstName | lastName | zipCode |
#        | Rolando   | Tigor    | 55000   |
