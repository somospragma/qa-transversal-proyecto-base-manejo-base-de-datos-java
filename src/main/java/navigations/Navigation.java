package navigations;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigation {
    public static Performable theTestAutomation(){
        return Task.where("{0} opens the google page",
                Open.browserOn().thePageNamed("login.page")
        );
    }
}


