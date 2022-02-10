package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.*;

public class VerificarTotalComprar implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(MENSAJE_TOTAL_COMPRA).viewedBy(actor).asString();
    }

    public static VerificarTotalComprar verificarTotalComprar() {
        return new VerificarTotalComprar();
    }
}
