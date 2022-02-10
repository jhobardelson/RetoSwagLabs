package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.Map;

import static userinterfaces.ElementosWebSwagLabs.*;

@AllArgsConstructor
public class ValidarMensajeUsuario implements Question {

    private final Map<String, String> mapDatos;

    @Override
    public Object answeredBy(Actor actor) {

        if (mapDatos.get("username").contains("standard_user")) {
            return Text.of(FRASE_ESPERADA_COMPRA).viewedBy(actor).asString();
        }

        if (mapDatos.get("username").contains("locked_out_user")) {
            return Text.of(FRASE_USERLOCKED).viewedBy(actor).asString();
        }

        if (mapDatos.get("username").contains("problem_user")) {
            return Text.of(FRASE_PROBLEM_USER).viewedBy(actor).asString();
        }

        if (mapDatos.get("username").contains("performance_glitch_user")) {
            return Text.of(FRASE_ESPERADA_COMPRA).viewedBy(actor).asString();
        }

        else {
            return null;
        }

    }

    public static ValidarMensajeUsuario validarMensajeUsuario(Map<String, String> mapDatos) {
        return new ValidarMensajeUsuario(mapDatos);
    }
}
