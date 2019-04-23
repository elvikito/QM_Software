# Login feature review the behavior in thie feature
Feature: Adidas

  Scenario: Get Element and purchases
    Given 'Adidas' page is loaded
    And Hover men link 'Header'
    And click in 'Futbol' seccition 'Tennis'
    And check get price tennis of futbol value is "$1,329"
    And click in Calzado de Fútbol X 18.3 TF
    And select size for carrito
    And click add in carrito
    Then verified quantity is "Cantidad: 1" modal
    And click ver carrito link
    Then verified "calzado de fútbol x 18.3 tf" title is displayed
    Then price should be "$1,329.00"
    Then total should be "$1,428.00"

