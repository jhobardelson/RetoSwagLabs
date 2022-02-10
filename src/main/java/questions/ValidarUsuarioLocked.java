package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.FRASE_USERLOCKED;

public class ValidarUsuarioLocked implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FRASE_USERLOCKED).viewedBy(actor).asString();
    }

    public static ValidarUsuarioLocked validarUsuarioLocked() {
        return new ValidarUsuarioLocked();
    }
}
