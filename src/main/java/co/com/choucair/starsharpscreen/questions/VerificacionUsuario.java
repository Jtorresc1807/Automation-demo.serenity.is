package co.com.choucair.starsharpscreen.questions;

import co.com.choucair.starsharpscreen.userinterfaces.PaginaSerenityis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionUsuario implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare= PaginaSerenityis.Valida_ingreso.resolveFor(actor).getText().equals("Dashboard");
        return  compare;
    }
    public static VerificacionUsuario verificacionUsuario(){return new VerificacionUsuario();}
}