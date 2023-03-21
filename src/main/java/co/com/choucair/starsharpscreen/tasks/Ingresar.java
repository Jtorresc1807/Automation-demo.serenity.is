package co.com.choucair.starsharpscreen.tasks;

import co.com.choucair.starsharpscreen.userinterfaces.PaginaSerenityis;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales(){
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue("admin").into(PaginaSerenityis.TXT_USUARIO),
                     Enter.theValue("serenity").into(PaginaSerenityis.TXT_CONTRASENA),
                     Click.on(PaginaSerenityis.BTN_SING_IN));
    }

}