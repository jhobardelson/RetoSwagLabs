package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class ValidarUsuariosCondicionales implements Task {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (mapDatos.get("username").contains("standard_user")) {
            //login
            actor.attemptsTo(Login.login(mapDatos));
            //Agregar productos
            actor.attemptsTo(AgregarProductos.agregarProductos());

            //Ingresar al carrito
            actor.attemptsTo(IngresaCarrito.ingresaCarrito());
            actor.attemptsTo(ChequearCompra.chequearCompra());

            //Ingresar datos de compra
            actor.attemptsTo(DatosComprador.datosComprador(mapDatos));

            //Finalizar compra
            actor.attemptsTo(FinalizarCompra.finalizarCompra());
        }

        if (mapDatos.get("username").contains("locked_out_user")) {
            //login
            actor.attemptsTo(Login.login(mapDatos));
        }

        if (mapDatos.get("username").contains("problem_user")) {
            //login
            actor.attemptsTo(Login.login(mapDatos));

            //Agregar productos
            actor.attemptsTo(AgregarProductos.agregarProductos());

            //Ingresar al carrito
            actor.attemptsTo(IngresaCarrito.ingresaCarrito());
            actor.attemptsTo(ChequearCompra.chequearCompra());

            //Ingresar datos de compra
            actor.attemptsTo(DatosComprador.datosComprador(mapDatos));
            actor.attemptsTo(Scroll.to(TXT_NOMBRE));
        }

        if (mapDatos.get("username").contains("performance_glitch_user")) {
            //login
            actor.attemptsTo(Login.login(mapDatos));
            //Agregar productos
            actor.attemptsTo(AgregarProductos.agregarProductos());

            //Ingresar al carrito
            actor.attemptsTo(IngresaCarrito.ingresaCarrito());
            actor.attemptsTo(ChequearCompra.chequearCompra());

            //Ingresar datos de compra
            actor.attemptsTo(DatosComprador.datosComprador(mapDatos));;

            //Finalizar compra
            actor.attemptsTo(FinalizarCompra.finalizarCompra());
        }

    }

    public static ValidarUsuariosCondicionales validarUsuariosCondicionales(Map<String,String> mapDatos) {
        return instrumented(ValidarUsuariosCondicionales.class, mapDatos);
    }
}
