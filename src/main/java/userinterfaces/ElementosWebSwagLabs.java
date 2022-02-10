package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebSwagLabs {

    //Login
    public static final Target TXT_USERNANE = Target.the("Caja de texto para ingresar el nombre del usuario").located(By.xpath("//input[@id='user-name']"));
    public static final Target TXT_PASSWORD = Target.the("Caja de texto para ingresar la contrasena").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_LOGIN = Target.the("Boton de logueo").located(By.xpath("//input[@id='login-button']"));

    //AgregarProductos
    public static final Target BTN_AGREGARCARRITOMOCHILA = Target.the("Boton agregar carrito").located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    public static final Target BTN_AGREGARCARRITOLUZ = Target.the("Boton agregar carrito").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));

    //Carrito
    public static final Target LINK_CARRITO = Target.the("Link para ingresar al carrito").located(By.xpath("//a[@class='shopping_cart_link']"));
    public static final Target CANTIDADPRODUCTOS = Target.the("Cantidad de productos en el carrito").located(By.xpath("//span[@class='shopping_cart_badge']"));

    //menu principal
    public static final Target BTN_MENUPRINCIPAL = Target.the("Boton menu principal").located(By.xpath("//*[@id='react-burger-menu-btn']"));
    public static final Target LINK_TODOPRODUCTOS = Target.the("Link de todos lo0s productos").located(By.xpath("//*[@id='inventory_sidebar_link']"));
    public static final Target LINK_RESTARBLECERAPP = Target.the("Link de restablecer app").located(By.xpath("//*[@id='reset_sidebar_link']"));
    public static final Target LINK_CERRARSESION = Target.the("Link de cerrar sesion").located(By.xpath("//*[@id='logout_sidebar_link']"));
    public static final Target LINK_ACERCADE = Target.the("Link de acerca de ").located(By.xpath("//*[@id='about_sidebar_link']"));

    //Frase de validacion menu
    public static final Target FRASE_ESPERADA = Target.the("Frase esperada").located(By.xpath("//*[@id='entry-3qDFahnypj1KkiORyU1Zyh']/div/div/div/div[1]/div/h2"));

    //Boton de chequear compra
    public static final Target BTN_CHEKEAR_COMPRA = Target.the("Boton de chequear compra").located(By.xpath("//*[@id='checkout']"));

    //Formulario de datos de comprador
    public static final Target TXT_NOMBRE = Target.the("Caja de texto de ingresa nombre del comprador").located(By.xpath("//*[@id='first-name']"));
    public static final Target TXT_APELLIDO = Target.the("Caja de texto de ingresar apellido").located(By.xpath("//*[@id='last-name']"));
    public static final Target TXT_CODPOSTAL = Target.the("Caja de texto para ingresar el codigo postal").located(By.xpath("//*[@id='postal-code']"));
    public static final Target BTN_CONTINUAR = Target.the("Boton de continuar con la compra").located(By.xpath("//*[@id='continue']"));
    public static final Target BTN_FINISH = Target.the("Boton de finalizar").located(By.xpath("//*[@id='finish']"));
    public static final Target FRASE_ESPERADA_COMPRA = Target.the("Frase esperada").located(By.xpath("//*[@id='header_container']/div[2]/span"));

    //Mensajes de para validar los usuarios
    public static final Target FRASE_USERLOCKED = Target.the("Mensaje de usuario bloqueado").located(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3"));
    public static final Target FRASE_PROBLEM_USER = Target.the("Mensaje de problema de usuario").located(By.xpath("//*[@id='checkout_info_container']/div/form/div[1]/div[4]/h3"));

    //Impuesto y compra
    public static final Target MENSAJE_IMPUESTO = Target.the("Mensaje impuesto").located(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[6]"));
    public static final Target MENSAJE_TOTAL_COMPRA = Target.the("Mensaje de total compra").located(By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[7]"));

    //Precio y filtro
    public static final Target PRECIO_MAYOR = Target.the("Producto de mayor precio").located(By.xpath("//*[@id='inventory_container']/div/div[1]/div[2]/div[2]/div"));
    public static final Target SELCT_FILTER = Target.the("Seleccion de filtros").located(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select"));
    public static final Target FILTER_PRICE_HIGH = Target.the("Filtro de mayor a menor").located(By.xpath("//*[@id='header_container']/div[2]/div[2]/span/select/option[4]"));

}