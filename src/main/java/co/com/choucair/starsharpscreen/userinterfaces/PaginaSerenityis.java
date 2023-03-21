package co.com.choucair.starsharpscreen.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/Account/Login/")
public class PaginaSerenityis extends PageObject {
    public static final Target TXT_USUARIO = Target.the("Ingresar Usuario").
            located(By.xpath("//input[@id='LoginPanel0_Username']"));
    public static final Target TXT_CONTRASENA = Target.the("Ingresar Clave").
            located(By.xpath("//input[@id='LoginPanel0_Password']"));
    public static final Target BTN_SING_IN = Target.the("Boton Ingresar").
            located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));

    public static final Target Valida_ingreso= Target.the("Dashboard").
            located(By.xpath("//section[@class=\"content-header\"]"));
    public static final Target BTN_ORGANIZATION = Target.the("Menu Organization").
            located(By.xpath("//span[contains(text(),'Organization')]"));
    public static final Target BTN_BUSINESS_UNITS = Target.the("Menu Business Units").
            located(By.xpath("//span[contains(text(),'Business Units')]"));

    public static final Target BTN_NEW_BUSINESS_UNITS = Target.the("Menu New Business Units").
            located(By.xpath("//body/main[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"));
    public static final Target TXT_NAME = Target.the("Ingresar Name").
            located(By.xpath("/html[1]/body[1]/div[4]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public static final Target SLT_PARENT_UNIT = Target.the("Select Parent Unit").
            located(By.xpath("//span[@id=\"select2-chosen-1\"]"));
    public static final Target TECHNOLOGY = Target.the("Technology").
            located(By.xpath("//div[@id=\"select2-result-label-17\"]"));
    public static final Target SAVE = Target.the("Save").
            located(By.xpath("(//span[@class=\"button-inner\"])[4]"));
    public static final Target BTN_MEETING = Target.the("Select Meeting").
            located(By.xpath("(//span[contains(text(),'Meeting')])[1]"));
    public static final Target BTN_MEETINGS = Target.the("Select Meetings").
            located(By.xpath("(//span[contains(text(),'Meetings')])"));
    public static final Target BTN_NEW_MEETING = Target.the("Select New Meeting").
            located(By.xpath("(//span[@class=\"button-inner\"])[1]"));
    public static final Target TXT_MEETING_NAME = Target.the("Nombre de Reunion").
            located(By.xpath("//input[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));

    public static final Target SLT_MEETING_TYPE = Target.the("Tipo de reunion").
            located(By.xpath("//div[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId\"]"));

    public static final Target SLT_GENERAL = Target.the("General").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[3]"));

    public static final Target TXT_START_DATE = Target.the("Start Date").
            located(By.xpath("//input[@id=\"Serenity_Pro_Meeting_MeetingDialog10_StartDate\"]"));

    public static final Target SLT_HOUR = Target.the("Start Hour").
            located(By.xpath("(//select[@class=\"editor s-DateTimeEditor time\"])[1]"));

    public static final Target SLT_HOUR_START = Target.the("Start Hour Start").
            located(By.xpath("//option[@value=\"16:00\"]"));

    public static final Target SLT_LOCATION = Target.the("Select Location").
            located(By.xpath("//div[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId\"]"));

    public static final Target SLT_LOCATION2 = Target.the("Select Location2").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[3]"));

    public static final Target SLT_ORGANIZER = Target.the("Select Organizer").
            located(By.xpath("//div[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId\"]"));
    public static final Target SLT_ORGANIZER_TO = Target.the("Select Organizer To").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[8]"));

    public static final Target SLT_CHOSEN = Target.the("Select Chosen").
            located(By.xpath("//span[@id=\"select2-chosen-12\"]"));
    public static final Target SLT_CHOSEN_TO = Target.the("Select Chosen To").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[4]"));
    public static final Target SLT_CHOSEN2 = Target.the("Select Chosen2").
            located(By.xpath("//span[@id=\"select2-chosen-12\"]"));
    public static final Target SLT_CHOSEN_TO2 = Target.the("Select Chosen To2").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[7]"));

    public static final Target SLT_MEETING_NUMBER = Target.the("Select Meeting Number").
            located(By.xpath("//input[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));
    public static final Target TXT_MEETING_NUMBER = Target.the("Numero de Reunion").
            located(By.xpath("//input[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));

    public static final Target TXT_FINAL_DATE = Target.the("Final Date").
            located(By.xpath("//input[@id=\"Serenity_Pro_Meeting_MeetingDialog10_EndDate\"]"));

    public static final Target SLT_HOUR_FINAL = Target.the("Start Hour Final").
            located(By.xpath("//select[@class=\"editor s-DateTimeEditor time valid\"]"));

    public static final Target SLT_HOUR_FINAL2 = Target.the("Start Hour Final2").
            located(By.xpath("(//option[@value=\"18:00\"])[2]"));

    public static final Target SLT_UNID = Target.the("Select Unid").
            located(By.xpath("//div[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId\"]"));
    public static final Target SLT_UNID_TO = Target.the("Select Unid To").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[18]"));

    public static final Target SLT_REPORT = Target.the("Select Report").
            located(By.xpath("//div[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId\"]"));

    public static final Target SLT_REPORT_TO = Target.the("Select Report To").
            located(By.xpath("(//div[@class=\"select2-result-label\"])[46]"));

    public static final Target SLT_SAVE = Target.the("Select Save").
            located(By.xpath("//i[@class=\"fa fa-clipboard-check text-purple\"]"));

    public static final Target Valida_reunion= Target.the("Reunion General").
            located(By.xpath("//div[@class=\"panel-titlebar-text\"]"));

}
