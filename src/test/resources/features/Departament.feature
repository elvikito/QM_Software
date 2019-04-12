Feature: Departament
  @ABC
  Scenario: Departament insertar nuevo registro
    Given Accedo a la pagina initial
    When select 'departament' option from 'Administration'
    And Hacer click en new
    And Lleno datos del departament dialog
      | name | new data |
      | description |  The production department orders inventory for production when needed |
    Then Verificar si existe el nuevo dato en 'departament'

  @ABC
  Scenario: Eliminar un registro de Departament
    Given Accedo a la pagina initial
    When select 'departament' option from 'Administration'
    And Hacer click en Delete Item
    And Confirm delete element 'departament'
    Then Verificar si ya no existe el dato dentro 'departament'

  @ABC
  Scenario: Modificar un registro de Departamento
    Given Accedo a la pagina initial
    When select 'departament' option from 'Administration'
    And Hacer click en un 'Item' para modificarlo
    And datos actualizados para el 'Departament' dialog
      | name | Dato Actilizado|
      | description |  The New production department orders inventory for production when needed |
    Then Verificar dato cambiado dentro 'departament' "Dato Actilizado"
