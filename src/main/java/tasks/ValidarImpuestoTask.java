package tasks;

import interactions.*;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class ValidarImpuestoTask implements Task {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Login
        actor.attemptsTo(Login.login(mapDatos));

        //Agregar productos
        actor.attemptsTo(AgregarProductos.agregarProductos());

        //Ingresar al carrito
        actor.attemptsTo(IngresaCarrito.ingresaCarrito());
        actor.attemptsTo(ChequearCompra.chequearCompra());

        //Ingresar datos de compra
        actor.attemptsTo(DatosComprador.datosComprador(mapDatos));
        actor.attemptsTo(Scroll.to(MENSAJE_IMPUESTO));
    }

    public static ValidarImpuestoTask validarImpuesto(Map<String, String> mapDatos) {
        return instrumented(ValidarImpuestoTask.class, mapDatos);
    }
}
