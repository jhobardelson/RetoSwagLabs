package tasks;

import interactions.*;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class ComprarProductoTask implements Task {

    private final Map<String,String> mapDatos;

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

        //Finalizar compra
        actor.attemptsTo(FinalizarCompra.finalizarCompra());

    }

    public static ComprarProductoTask comprarProductoTask(Map<String, String> mapDatos) {
        return instrumented(ComprarProductoTask.class, mapDatos);
    }
}
