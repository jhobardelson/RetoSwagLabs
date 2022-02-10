Feature: Comprobar filtro
  Yo como usuario del servicio
  necesito validar si la opción filtro si funciona
  para validar que el primer ítem que aparezca sea el que tenga el precio mayor.

  Scenario Outline: Comprobar filtro de mayor a menor
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"

    When realizar la accion de utilizar filtro de mayor a menor
      | username | <username> |
      | password | <password> |

    Then valido el producto con el mayor precio
      | precio  | <precio>  |

    Examples:
      | username      | password      | precio |
      | standard_user | secret_sauce  | $49.99 |