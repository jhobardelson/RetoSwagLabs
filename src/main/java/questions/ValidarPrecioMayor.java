package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.*;

public class ValidarPrecioMayor implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(PRECIO_MAYOR).viewedBy(actor).asString();
    }

    public static ValidarPrecioMayor validarPrecioMayor() {
        return new ValidarPrecioMayor();
    }
}
