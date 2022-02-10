package tasks;

import interactions.Login;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class ComprobarFiltroTask implements Task {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //login
        actor.attemptsTo(Login.login(mapDatos));

        //Selecionar filtro de mayor a menor
        actor.attemptsTo(Click.on(SELCT_FILTER));
        actor.attemptsTo(Click.on(FILTER_PRICE_HIGH));
    }

    public static ComprobarFiltroTask comprobarFiltroTask(Map<String, String> mapDatos) {
        return instrumented(ComprobarFiltroTask.class, mapDatos);
    }
}
