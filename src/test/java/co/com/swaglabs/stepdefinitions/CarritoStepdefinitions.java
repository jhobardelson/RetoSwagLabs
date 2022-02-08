package co.com.swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.VerificarMensaje;
import questions.VerificarNumeroProductosAgregados;
import tasks.FuncionamientoCarritoTasks;
import tasks.MenuPrincipalTasks;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CarritoStepdefinitions {


    //Verificar Funcionamiento del carrito
    @Given("{string} ingresa al link de la tienda online {string}")
    public void ingresaAlLinkDeLaTiendaOnline(String nombreActor, String url) {
        setTheStage(new OnlineCast());
        theActorCalled(nombreActor).wasAbleTo(Open.url(url));
    }

    @When("Ingresa sucredenciales y agrega productos al carrito")
    public void ingresaSucredencialesYAgregaProductosAlCarrito(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(FuncionamientoCarritoTasks.funcionamientoCarritoTasks(mapDatos));
    }

    @Then("Se valida que los productos agregados en el carrito en total sean")
    public void seValidaQueLosProductosAgregadosEnElCarritoEnTotalSean(Map<String, String> mapDatos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarNumeroProductosAgregados.verificarNumeroProductosAgregados(), Matchers.is(Matchers.equalTo(mapDatos.get("NumeroDeProductos")))));
    }




    //Verificar Menu Principal
    @When("Revisar el menu")
    public void revisarElMenu(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(MenuPrincipalTasks.menuPrincipalTasks(mapDatos));
    }

    @Then("Valida que se alla cerrado sesion y verifica que exitas esta frase {string}")
    public void validaQueSeAllaCerradoSesionYVerificaQueExitasEstaFrase(String fraseEsperada) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensaje.verificarMensaje(), Matchers.is(Matchers.equalTo(fraseEsperada))));
    }


    //Realizar Compra

    @When("Agrego un producto al carrito y comprarlo")
    public void agregoUnProductoAlCarritoYComprarlo(Map<String, String> mapDatos) {

    }
    @Then("Se valida la frase {string}")
    public void seValidaLaFrase(String fraseEsperada) {

    }


}
