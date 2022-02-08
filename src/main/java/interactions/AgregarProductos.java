package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

public class AgregarProductos implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_AGREGARCARRITOMOCHILA));
        actor.attemptsTo(Click.on(BTN_AGREGARCARRITOLUZ));
    }

    public static AgregarProductos agregarProductos() {
        return instrumented(AgregarProductos.class);
    }
}
