package co.com.choucair.starsharpscreen.tasks;

import co.com.choucair.starsharpscreen.userinterfaces.PaginaSerenityis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Reunion implements Task {
    public static Reunion nueva() {
        return Tasks.instrumented(Reunion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenityis.BTN_MEETING),
                Click.on(PaginaSerenityis.BTN_MEETINGS),
                Click.on(PaginaSerenityis.BTN_NEW_MEETING),
                Enter.theValue("Reunion General").into(PaginaSerenityis.TXT_MEETING_NAME),
                Click.on(PaginaSerenityis.SLT_MEETING_TYPE),
                Click.on(PaginaSerenityis.SLT_GENERAL),
                Enter.theValue("30/03/2023").into(PaginaSerenityis.TXT_START_DATE),
                Click.on(PaginaSerenityis.SLT_HOUR),
                Click.on(PaginaSerenityis.SLT_HOUR_START),
                Click.on(PaginaSerenityis.SLT_LOCATION),
                Click.on(PaginaSerenityis.SLT_LOCATION2),
                Click.on(PaginaSerenityis.SLT_ORGANIZER),
                Click.on(PaginaSerenityis.SLT_ORGANIZER_TO),
                Click.on(PaginaSerenityis.SLT_CHOSEN),
                Click.on(PaginaSerenityis.SLT_CHOSEN_TO),
                Click.on(PaginaSerenityis.SLT_CHOSEN2),
                Click.on(PaginaSerenityis.SLT_CHOSEN_TO2),
                Click.on(PaginaSerenityis.SLT_MEETING_NUMBER),
                Enter.theValue("12345").into(PaginaSerenityis.TXT_MEETING_NUMBER),
                Enter.theValue("30/03/2023").into(PaginaSerenityis.TXT_FINAL_DATE),
                Click.on(PaginaSerenityis.SLT_HOUR_FINAL),
                Click.on(PaginaSerenityis.SLT_HOUR_FINAL2),
                Click.on(PaginaSerenityis.SLT_UNID),
                Click.on(PaginaSerenityis.SLT_UNID_TO),
                Click.on(PaginaSerenityis.SLT_REPORT),
                Click.on(PaginaSerenityis.SLT_REPORT_TO),
                Click.on(PaginaSerenityis.SLT_SAVE)

                );

    }

    }
