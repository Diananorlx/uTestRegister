package uTestRegister.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class uTestDiligenceLocation extends PageObject {
    public static final Target INPUT_CITY = Target.the("City")
            .located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Zip")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Country")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span"));
    public static final Target INPUT_COUNTRY_A = Target.the("Country select")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_LAST = Target.the("Button")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

}