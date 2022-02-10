package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.*;

public class VerificarImpuesto implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MENSAJE_IMPUESTO).viewedBy(actor).asString();
    }

    public static VerificarImpuesto validarImpuesto() {
        return new VerificarImpuesto();
    }
}
