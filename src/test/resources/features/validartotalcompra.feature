Feature: Validar Total del compra
  Yo como usuario del servicio
  necesito validar que el valor final (impuesto + producto)
  si sea el valor correcto

  Scenario Outline: Validar total de producto mas impuesto
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"

    When Consultar el valor del pruducto mas el valor del impuesto
      | username      | <username>      |
      | password      | <password>      |
      | nombre        | <nombre>        |
      | apellido      | <apellido>      |
      | codigopostal  | <codigopostal>  |

    Then Valido el total de la suma de impuesto mas producto
      | total | <total> |

    Examples:
      | username      | password      | nombre  | apellido  | codigopostal  | total         |
      | standard_user | secret_sauce  | Carlos  | Zapata    | 1004          | Total: $43.18 |