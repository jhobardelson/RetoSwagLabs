package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.*;

public class VerificarNumeroProductosAgregados implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CANTIDADPRODUCTOS).asInteger();
    }

    public static VerificarNumeroProductosAgregados verificarNumeroProductosAgregados() {
        return new VerificarNumeroProductosAgregados();
    }
}
