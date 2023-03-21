package co.com.choucair.starsharpscreen.stepdefinitions;

import co.com.choucair.starsharpscreen.questions.VerificacionUsuario;
import co.com.choucair.starsharpscreen.questions.VerificarReunion;
import co.com.choucair.starsharpscreen.tasks.AbrirPagina;
import co.com.choucair.starsharpscreen.tasks.Crear;
import co.com.choucair.starsharpscreen.tasks.Ingresar;
import co.com.choucair.starsharpscreen.tasks.Reunion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class MyStepDefinition {

    @Before
    public void iniciarEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Jaime ingresa a la pagina serenity.is")
    public void queJaimeIngresaALaPaginaSerenityIs() {
        OnStage.theActorCalled("Jaime").wasAbleTo(AbrirPagina.urlApp());
    }

    @Cuando("digita las credenciales e ingresa a la pagina")
    public void digitaLasCredencialesEIngresaALaPagina() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.credenciales());
    }

    @Entonces("verifica que pudo ingresar correctamente")
    public void verificaQuePudoIngresarCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionUsuario.verificacionUsuario(),Matchers.is(true)));
    }

    @Y("creo la unidad de negocio desde el menu organization")
    public void creoLaUnidadDeNegocioDesdeElMenuOrganization() {
        OnStage.theActorInTheSpotlight().attemptsTo(Crear.unidad());
    }

    @Y("creo una nueva reunion desde el menu meeting")
    public void creoUnaNuevaReunionDesdeElMenuMeeting() {
        OnStage.theActorInTheSpotlight().attemptsTo(Reunion.nueva());
    }

    @Entonces("verifica que pudo crear la reunion")
    public void verificaQuePudoCrearLaReunion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarReunion.verificarReunion(),Matchers.is(true)));
    }
}

