Feature: Validar impuesto
  Yo como usuario del servicio
  quiero consultar el valor del impuesto
  para comprobar que están calculados correctamente (Recordar que el impuesto es el 8% del valor del producto)

  Scenario Outline: Validar impuesto de los pruductos
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"

    When Consultar el impuesto de la suma de los dos primero productos de la tienda
      | username      | <username>      |
      | password      | <password>      |
      | nombre        | <nombre>        |
      | apellido      | <apellido>      |
      | codigopostal  | <codigopostal>  |

    Then Valida que el impuesto de los dos productos correcto
      |impuestos | <impuestos> |

    Examples:
      | username      | password      | nombre  | apellido  | codigopostal  | impuestos  |
      | standard_user | secret_sauce  | Carlos  | Zapata    | 1004          | Tax: $3.20 |