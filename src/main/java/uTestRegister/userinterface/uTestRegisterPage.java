package uTestRegister.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class uTestRegisterPage extends PageObject {
    public static final Target REGISTER_BUTTON = Target.the("Register button")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}