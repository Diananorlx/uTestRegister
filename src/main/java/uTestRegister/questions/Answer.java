package uTestRegister.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import uTestRegister.userinterface.finalConfirmation;

public class Answer implements Question<Boolean> {
   private String question;

   public Answer(String question){
       this.question = question;

   }

    public static Answer toThe(String question){
       return new Answer(question);



    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String finalconfirmationMessage = Text.of(finalConfirmation.FINALCONFIRMATION_MESSAGE).viewedBy(actor).asString();
        if (question.equals(finalconfirmationMessage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
