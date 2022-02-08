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

    //Frase de validacion
    public static final Target FRASE_ESPERADA = Target.the("Frase esperada").located(By.xpath("//*[@id='login_credentials']/h4"));


}