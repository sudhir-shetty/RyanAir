Feature: Card Decline

  @tag1
  Scenario Outline: Verify Error Message For Invalid Card Data
    Given I am logged in to the application with <username> and <password>
    And I make a booking from <source> to <destination> on <date> for <no_adults> , <no_teen> and <no_child>
    When I pay for booking with card details <card_number> , <card_type> , <card_exp_month> , <card_exp_year> , <card_cvv> and <card_holder>
    Then I should get payment declined message

    Examples: 
      | username              | password | source | destination | date       | no_adults | no_teen | no_child | card_number      | card_type  | card_exp_month | card_exp_year | card_cvv | card_holder |
      | testkiprosh@gmail.com | Test@123 | Madrid | Dublin      | 27/11/2018 |         1 |       1 |        1 | 5555555555555557 | MasterCard |             10 |          2019 |      265 | Pika Pika   |
