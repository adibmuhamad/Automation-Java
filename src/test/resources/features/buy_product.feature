Feature: Buy product

  Scenario: Buy 2 Blue Sauce Lab Back Packs
    Given user launches the app
    When user selects "Sauce Lab Back Packs"
    And user selects color "Blue"
    And user sets quantity to 2
    And user adds the item to the cart
    Then 2 item is added to the cart successfully
    And user opens the cart from the top navigation
    And user proceeds to checkout
    And user logs in with username "bod@example.com" and password "10203040"
    And user taps to payment with full name "Rebecca Winter", address "Mandorley 112", city "Truro", zip code "89750", and country "United Kingdom"
    And user reviews the order with full name "Rebecca Winter", card number "3258 1256 7568 7891", exp date "03/25" and security code "123"
    And user places the order
    And user continues shopping

