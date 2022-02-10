Feature: Menu principal
  Yo como usuario del servicio
  necesito probar las opciones del menú principal
  para comprobar su funcionamiento

  Scenario Outline: Verificar Funcionamineto del menu principal
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"
    When Revisar el menu
      | username | <username> |
      | password | <password> |
    Then Valida que se alla cerrado sesion y verifica que exitas esta frase "Pass or fail. The world relies on your code."

    Examples:
      | username      | password      |
      | standard_user | secret_sauce  |