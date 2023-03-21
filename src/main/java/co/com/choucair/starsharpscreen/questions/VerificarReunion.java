package co.com.choucair.starsharpscreen.questions;

import co.com.choucair.starsharpscreen.userinterfaces.PaginaSerenityis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarReunion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare= PaginaSerenityis.Valida_reunion.resolveFor(actor).getText().equals("Editar Meeting (Reunion General)");
        return  compare;
    }
    public static VerificarReunion verificarReunion(){return new VerificarReunion();}
}
