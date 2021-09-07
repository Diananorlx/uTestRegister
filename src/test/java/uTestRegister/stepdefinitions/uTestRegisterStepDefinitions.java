package uTestRegister.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import uTestRegister.questions.Answer;



import uTestRegister.tasks.Diligence;
import uTestRegister.tasks.OpenUp;
import uTestRegister.tasks.Register;
import uTestRegister.model.uTestRegisterData;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class uTestRegisterStepDefinitions {

    @Before
    public void setStage () {
        setTheStage(new OnlineCast());

    }

    @Given("^than a user called Diana who enters the test page and click the register button$")
    public void thanAUserCalledDianaWhoEntersTheTestPageAndClickTheRegisterButton() {
        theActorCalled("Diana").wasAbleTo(OpenUp.thePage(), (Register.onThePage()));
    }

    @When("^she Diligence the form$")
    public void sheDiligenceTheForm(List<uTestRegisterData> datos)  {
        theActorInTheSpotlight().attemptsTo(Diligence.information(datos.get(0)));
    }

    @Then("^it is registered on the web$")
    public void itIsRegisteredOnTheWeb(String question)  {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
