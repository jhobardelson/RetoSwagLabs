package tasks;

import interactions.ValidarUsuariosCondicionales;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ValidarUsuariosTask implements Task {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ValidarUsuariosCondicionales.validarUsuariosCondicionales(mapDatos));
    }

    public static ValidarUsuariosTask validarUsuarios(Map<String, String>mapDatos) {
        return instrumented(ValidarUsuariosTask.class, mapDatos);
    }
}
