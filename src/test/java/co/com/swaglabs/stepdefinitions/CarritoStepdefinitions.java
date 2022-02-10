package co.com.swaglabs.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.*;
import tasks.*;
import tasks.ValidarImpuestoTask;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class CarritoStepdefinitions {

/*
    private final Map<String,String> mapDatosU;
*/

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
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensajeMenuPrincipal.verificarMensaje(), Matchers.is(Matchers.equalTo(fraseEsperada))));
    }

    //Realizar Compra
    @When("Agrego un producto al carrito y comprarlo")
    public void agregoUnProductoAlCarritoYComprarlo(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(ComprarProductoTask.comprarProductoTask(mapDatos));
    }

    @Then("Se valida la frase {string}")
    public void seValidaLaFrase(String fraseEsperadaCompra) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensajeCompra.verificarMensajeCompra(), Matchers.is(Matchers.equalTo(fraseEsperadaCompra))));
    }

    //Validar usuarios
    @When("Se ingresen las credenciales de los distintos usuarios")
    public void seIngresenLasCredencialesDeLosDistintosUsuarios(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(ValidarUsuariosTask.validarUsuarios(mapDatos));
    }

    @Then("Se validan los mesajes arrojados de cada usuario")
    public void seValidanLosMesajesArrojadosDeCadaUsuario(Map<String, String> mapDatos) {
        if (mapDatos.get("username").contains("standard_user")) {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensajeCompra.verificarMensajeCompra(), Matchers.is(Matchers.equalTo(mapDatos.get("mensaje")))));
        }

        if (mapDatos.get("username").contains("locked_out_user")) {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuarioLocked.validarUsuarioLocked(), Matchers.is(Matchers.equalTo(mapDatos.get("mensaje")))));
        }

        if (mapDatos.get("username").contains("problem_user")) {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarUsuarioProblem.validarUsuarioProblem(), Matchers.is(Matchers.equalTo(mapDatos.get("mensaje")))));
        }

        if (mapDatos.get("username").contains("performance_glitch_user")) {
            theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMensajeCompra.verificarMensajeCompra(), Matchers.is(Matchers.equalTo(mapDatos.get("mensaje")))));
        }
    }


    //Validar impuesto
    @When("Consultar el impuesto de la suma de los dos primero productos de la tienda")
    public void consultarElImpuestoDeLaSumaDeLosDosPrimeroProductosDeLaTienda(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(ValidarImpuestoTask.validarImpuesto(mapDatos));
    }
    @Then("Valida que el impuesto de los dos productos correcto")
    public void validaQueElImpuestoDeLosDosProductosCorrecto(Map<String, String> mapDatos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarImpuesto.validarImpuesto(), Matchers.is(Matchers.equalTo(mapDatos.get("impuestos")))));
    }


    //Validar total compra
    @When("Consultar el valor del pruducto mas el valor del impuesto")
    public void consultarElValorDelPruductoMasElValorDelImpuesto(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(ValidarTotalCompraTask.validarTotalCompra(mapDatos));
    }
    @Then("Valido el total de la suma de impuesto mas producto")
    public void validoElTotalDeLaSumaDeImpuestoMasProducto(Map<String, String> mapDatos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarTotalComprar.verificarTotalComprar(), Matchers.is(Matchers.equalTo(mapDatos.get("total")))));
    }

    //Comprobar funcionamiento de selcionar filtro
    @When("realizar la accion de utilizar filtro de mayor a menor")
    public void realizarLaAccionDeUtilizarFiltroDeMayorAMenor(Map<String, String> mapDatos) {
        theActorInTheSpotlight().attemptsTo(ComprobarFiltroTask.comprobarFiltroTask(mapDatos));
    }
    @Then("valido el producto con el mayor precio")
    public void validoElProductoConElMayorPrecio(Map<String, String> mapDatos) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecioMayor.validarPrecioMayor(), Matchers.is(Matchers.equalTo(mapDatos.get("precio")))));
    }

}
