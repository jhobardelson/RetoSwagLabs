package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static userinterfaces.ElementosWebSwagLabs.*;

public class VerificarMensajeMenuPrincipal implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FRASE_ESPERADA).viewedBy(actor).asString();
    }

    public static VerificarMensajeMenuPrincipal verificarMensaje() {
        return new VerificarMensajeMenuPrincipal();
    }
}
