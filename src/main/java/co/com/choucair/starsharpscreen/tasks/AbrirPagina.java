package co.com.choucair.starsharpscreen.tasks;

import co.com.choucair.starsharpscreen.userinterfaces.PaginaSerenityis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private PaginaSerenityis paginaSerenityis;

    public static AbrirPagina urlApp(){
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaSerenityis));

    }
}