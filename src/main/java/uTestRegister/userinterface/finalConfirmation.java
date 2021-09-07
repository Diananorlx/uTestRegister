package uTestRegister.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class finalConfirmation {
    public static final Target FINALCONFIRMATION_MESSAGE = Target.the("Confirm text")
            .located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
