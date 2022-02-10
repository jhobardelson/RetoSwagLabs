package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.BTN_FINISH;
import static userinterfaces.ElementosWebSwagLabs.BTN_MENUPRINCIPAL;

public class FinalizarCompra implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_FINISH));
        actor.attemptsTo(Click.on(BTN_FINISH));
        actor.attemptsTo(Scroll.to(BTN_MENUPRINCIPAL));
    }

    public static FinalizarCompra finalizarCompra() {
        return instrumented(FinalizarCompra.class);
    }
}
