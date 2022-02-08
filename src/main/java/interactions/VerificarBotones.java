package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static userinterfaces.ElementosWebSwagLabs.*;

public class VerificarBotones implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_MENUPRINCIPAL));
        actor.attemptsTo(Click.on(LINK_TODOPRODUCTOS));
        actor.attemptsTo(Click.on(LINK_RESTARBLECERAPP));
        actor.attemptsTo(Click.on(LINK_CERRARSESION));
    }

    public static VerificarBotones verificarBotones() {
        return instrumented(VerificarBotones.class);
    }

}
