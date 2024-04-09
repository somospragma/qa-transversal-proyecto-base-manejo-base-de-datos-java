package question.login;

import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.login.LoginUI;

import static hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class loginQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        pragma.attemptsTo(WaitUntil.the(LoginUI.LOGGED_SUCCESSFULLY, containsText("Logged In Successfully")).forNoMoreThan(20).seconds());
        Wait.theSeconds(2);
        return true;
    }
    public static Question <Boolean> moduleIsVisible  (){
        return new loginQuestion();
    }
}
