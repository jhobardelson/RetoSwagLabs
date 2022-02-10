Feature: Comprobar carrito
  Yo como usuario del servicio
  necesito operar con los productos
  para comprobar el funcionamiento del carrito de compra

  Scenario Outline: Comprobar funcion funcionamiento del carrito
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"
    When Ingresa sucredenciales y agrega productos al carrito
      | username | <username> |
      | password | <password> |

    Then Se valida que los productos agregados en el carrito en total sean
      | NumeroDeProductos | <NumeroDeProductos> |

    Examples:
      | username      | password      | NumeroDeProductos |
      | standard_user | secret_sauce  |         2         |