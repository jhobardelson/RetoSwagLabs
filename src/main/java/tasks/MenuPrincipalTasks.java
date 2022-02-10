package tasks;

import interactions.AgregarProductos;
import interactions.Login;
import interactions.VerificarBotones;
import interactions.VerificarBotones2;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class MenuPrincipalTasks implements Task {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //login
        actor.attemptsTo(Login.login(mapDatos));

        //Agregar productos al carrito
        actor.attemptsTo(AgregarProductos.agregarProductos());

        //Verificar botones
        actor.attemptsTo(VerificarBotones.verificarBotones());

        //login
        actor.attemptsTo(Login.login(mapDatos));

        //verificar botones
        actor.attemptsTo(VerificarBotones2.verificarBotones2());
    }

    public static MenuPrincipalTasks menuPrincipalTasks(Map<String, String> mapDatos) {
        return instrumented(MenuPrincipalTasks.class, mapDatos);
    }
}
