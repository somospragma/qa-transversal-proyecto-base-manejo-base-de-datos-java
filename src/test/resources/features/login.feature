Feature: yo como usuario quiero hacer login
  en el portal de Practice Test Automation
  y así poder realizar mis funcionalidades

  Background: login
    Given el usuario esta en la pagina de Practice Test Automation

  @loginExitosoConCredencialesEnBaseDeDatos
  Scenario: login en el portal de Practice Test Automation
    When ingresa el usuario y el password leidos de la base de datos
    And valida el login exitoso
    Then cierra sesion