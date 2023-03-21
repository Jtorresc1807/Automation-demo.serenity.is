package co.com.choucair.starsharpscreen.tasks;

import co.com.choucair.starsharpscreen.userinterfaces.PaginaSerenityis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;

public class Crear implements Task {
    public static Crear unidad(){
        return Tasks.instrumented(Crear.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenityis.BTN_ORGANIZATION),
        Click.on(PaginaSerenityis.BTN_BUSINESS_UNITS),
                Click.on(PaginaSerenityis.BTN_NEW_BUSINESS_UNITS),
                Enter.theValue("Desarrollo").into(PaginaSerenityis.TXT_NAME),
                Click.on(PaginaSerenityis.SLT_PARENT_UNIT),
                Click.on(PaginaSerenityis.TECHNOLOGY),
                Click.on(PaginaSerenityis.SAVE));
    }
}
