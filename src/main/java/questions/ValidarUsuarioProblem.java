package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static userinterfaces.ElementosWebSwagLabs.FRASE_PROBLEM_USER;

public class ValidarUsuarioProblem implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(FRASE_PROBLEM_USER).viewedBy(actor).asString();
    }

    public static ValidarUsuarioProblem validarUsuarioProblem() {
        return new ValidarUsuarioProblem();
    }
}
