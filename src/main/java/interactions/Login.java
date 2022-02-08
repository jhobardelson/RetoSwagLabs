package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class Login implements Interaction {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(mapDatos.get("username")).into(TXT_USERNANE));
        actor.attemptsTo(Enter.theValue(mapDatos.get("password")).into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
    }

    public static Login login(Map<String, String> mapDatos) {
        return instrumented(Login.class, mapDatos);
    }
}
