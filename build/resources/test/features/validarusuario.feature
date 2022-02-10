Feature: Validar usuarios
  Yo como usuario del servicio
  necesito validar que todos los usuarios con sus diferentes roles funcionen correctamente
  para verificar que su funcionamiento sea el correcto

  Scenario Outline: Validar usuarios
    Given "Carlos" ingresa al link de la tienda online "https://www.saucedemo.com/"

    When Se ingresen las credenciales de los distintos usuarios
      | username      | <username>      |
      | password      | <password>      |
      | nombre        | <nombre>        |
      | apellido      | <apellido>      |
      | codigopostal  | <codigopostal>  |

    Then Se validan los mesajes arrojados de cada usuario
      | username | <username> |
      | mensaje  | <mensaje>  |

    Examples:
      | username                  | password        | nombre  | apellido  | codigopostal  | mensaje                                             |
      | standard_user             | secret_sauce    | Carlos  | Zapata    | 1004          | CHECKOUT: COMPLETE!                                 |
      | locked_out_user           | secret_sauce    |         |           |               | Epic sadface: Sorry, this user has been locked out. |
      | problem_user              | secret_sauce    | Carlos  | Zapata    | 1004          | Error: Last Name is required                        |
      | performance_glitch_user   | secret_sauce    | Carlos  | Zapata    | 1004          | CHECKOUT: COMPLETE!                                 |




