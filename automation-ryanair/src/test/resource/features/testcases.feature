Feature: Card Decline

  @tag1
  Scenario Outline: Verify Error Message For Invalid Card Data
    Given I am logged in to the application with <username> and <password>
    And I make a booking from <source> to <destination> on <date> for <no_adults> adults , <no_teen> teen , <no_child> child and <no_infant> infant
    When I pay for booking with card details <card_number> , <card_exp> and <card_cvv>
    Then I should get payment declined message

    Examples: 
      | username              | password | source | destination | date       | no_adults | no_teen | no_child | no_infant | card_number         | card_exp | card_cvv |
      | testkiprosh@gmail.com | Test@123 | Madrid | Dublin      | 18/10/2018 |         1 |       1 |        0 |         0 | 5555 5555 5555 5557 |     1018 |      265 |
