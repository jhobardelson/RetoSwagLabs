package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.BTN_CHEKEAR_COMPRA;

public class ChequearCompra implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(BTN_CHEKEAR_COMPRA));
        actor.attemptsTo(Click.on(BTN_CHEKEAR_COMPRA));
    }

    public static ChequearCompra chequearCompra() {
        return instrumented(ChequearCompra.class);
    }
}
