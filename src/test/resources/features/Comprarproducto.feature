Feature: Comprar producto
  Yo como usuario del servicio
  quiero completar una compra
  para validar que está hecha correctamente

  Scenario Outline: Verificar comprar de un producto
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"

    When Agrego un producto al carrito y comprarlo
      | username      | <username>      |
      | password      | <password>      |
      | nombre        | <nombre>        |
      | apellido      | <apellido>      |
      | codigopostal  | <codigopostal>  |

    Then Se valida la frase "THANK YOU FOR YOUR ORDER"

      Examples:
        | username      | password      | nombre  | apellido  | codigopostal  |
        | standard_user | secret_sauce  | Carlos  | Zapata    | 1004          |
