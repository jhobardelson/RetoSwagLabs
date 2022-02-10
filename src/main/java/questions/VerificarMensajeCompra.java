package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class VerificarMensajeCompra implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FRASE_ESPERADA_COMPRA).viewedBy(actor).asString();
    }

    public static VerificarMensajeCompra verificarMensajeCompra() {
        return new VerificarMensajeCompra();
    }
}
