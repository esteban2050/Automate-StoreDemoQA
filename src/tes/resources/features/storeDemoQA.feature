@BuyProduct
Feature: Buy a product
  As a web user
  I want to use the store demo QA page 
  to buy a product

  @Buy
  Scenario: Buy a product
    Given Esteban open the browser in the store demo QA
    When he search a product
      | product |
      | as      |
    When he add to car
      | numberInTheList |
      |               2 |
    When he increase the product
      | quantity |
      |        2 |
    Then he will compare the element
