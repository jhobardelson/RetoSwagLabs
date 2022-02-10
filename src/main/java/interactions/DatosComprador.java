package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class DatosComprador implements Interaction {

    private final Map<String, String> mapDatos;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(mapDatos.get("nombre")).into(TXT_NOMBRE));
        actor.attemptsTo(Enter.theValue(mapDatos.get("apellido")).into(TXT_APELLIDO));
        actor.attemptsTo(Enter.theValue(mapDatos.get("codigopostal")).into(TXT_CODPOSTAL));
        actor.attemptsTo(Scroll.to(BTN_CONTINUAR));
        actor.attemptsTo(Click.on(BTN_CONTINUAR));
    }

    public static DatosComprador datosComprador(Map<String, String> mapDatos) {
        return instrumented(DatosComprador.class, mapDatos);
    }
}
