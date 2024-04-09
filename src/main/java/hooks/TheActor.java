package hooks;

import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

public class TheActor {

    public static Actor pragma;

    @Managed
    public static WebDriver hisBrowser;

    @Before
    public static void setTheActor(){
        pragma = Actor.named("pragma");
        pragma.can(BrowseTheWeb.with(hisBrowser));
    }
}
