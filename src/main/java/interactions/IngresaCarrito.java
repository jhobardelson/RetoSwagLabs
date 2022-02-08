package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.ElementosWebSwagLabs.*;

public class IngresaCarrito implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_CARRITO));
    }

    public static IngresaCarrito ingresaCarrito() {
        return instrumented(IngresaCarrito.class);
    }
}
