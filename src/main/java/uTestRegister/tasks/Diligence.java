package uTestRegister.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import uTestRegister.userinterface.*;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import uTestRegister.model.uTestRegisterData;

import static uTestRegister.userinterface.uTestDiligenceBasic.*;
import static uTestRegister.userinterface.uTestDiligenceLocation.*;
import static uTestRegister.userinterface.uTestDiligenceDecives.*;
import static uTestRegister.userinterface.uTestPassword.*;

public class Diligence implements Task {
    uTestRegisterData datos;

    public Diligence(uTestRegisterData datos) {
        this.datos = datos;
    }
    public static Diligence information(uTestRegisterData uTestRegisterData) {
        return Tasks.instrumented(Diligence.class, uTestRegisterData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getFirst_name()).into(INPUT_FIRST_NAME),
                Enter.theValue(datos.getLast_name()).into(INPUT_LAST_NAME),
                Enter.theValue(datos.getEmail_address()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(datos.getMonth()).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(datos.getDay()).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(datos.getYear()).from(INPUT_YEAR),
                Click.on(uTestDiligenceBasic.NEXT_BUTTON),

                Enter.theValue(datos.getCity()).into(INPUT_CITY),
                Click.on(INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Enter.theValue(datos.getZip()).into(INPUT_ZIP),
                Click.on(INPUT_COUNTRY),
                Enter.theValue(datos.getCountry_a()).into(INPUT_COUNTRY_A),
                Hit.the(Keys.ENTER).into(INPUT_COUNTRY_A),
                Click.on(NEXT_LAST),
                Click.on(INPUT_COMPUTER),
                Enter.theValue(datos.getComputer_a()).into(INPUT_COMPUTER_A),
                Click.on(INPUT_VERSION),
                Enter.theValue(datos.getVersion_a()).into(INPUT_VERSION_A),
                Click.on(INPUT_LANGUAGE),
                Enter.theValue(datos.getLanguage_a()).into(INPUT_LANGUAGE_A),
                Click.on(INPUT_MOBILE),
                Enter.theValue(datos.getMobile()).into(INPUT_MOBILE_A),
                Hit.the(Keys.ENTER).into(INPUT_MOBILE_A),
                Click.on(INPUT_MODEL),
                Enter.theValue(datos.getModel()).into(INPUT_MODEL_A),
                Hit.the(Keys.ENTER).into(INPUT_MODEL_A),
                Click.on(INPUT_OPERATING),
                Enter.theValue(datos.getOperating()).into(INPUT_OPERATING_A),
                Hit.the(Keys.ENTER).into(INPUT_OPERATING_A),
                Click.on(LAST_BUTTON),
                Enter.theValue(datos.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(datos.getConfirm_password()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(INPUT_CHECK_A),
                Click.on(INPUT_CHECK_B),
                Click.on(COMPLETE_BUTTON)

        );

    }
}
