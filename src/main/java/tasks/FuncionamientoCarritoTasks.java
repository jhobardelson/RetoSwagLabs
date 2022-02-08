package tasks;

import interactions.AgregarProductos;
import interactions.IngresaCarrito;
import interactions.Login;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class FuncionamientoCarritoTasks implements Task {

    private final Map<String, String> mapDatos;


    @Override
    public <T extends Actor> void performAs(T actor) {
        //login
        actor.attemptsTo(Login.login(mapDatos));

        //Agregar productos al carrito
        actor.attemptsTo(AgregarProductos.agregarProductos());

        //Ingresar al carrito
        actor.attemptsTo(IngresaCarrito.ingresaCarrito());
    }

    public static FuncionamientoCarritoTasks funcionamientoCarritoTasks(Map<String, String> mapDatos) {
        return instrumented(FuncionamientoCarritoTasks.class, mapDatos);
    }


}
