Feature: Area

  Scenario: Area insertar nuevo registro
    Given Accedo a la pagina
    When Navego al tab "Administration"
    And Ingreso sub menu "Areas"
    And Hacer click en add
    And Lleno datos del Area dialog
      | name | Quality |
      | description | new data |
      | department |  Marketing and Advertising |
