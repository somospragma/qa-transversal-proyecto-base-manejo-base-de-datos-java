package stepdefinitions.login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigations.Navigation;
import net.serenitybdd.screenplay.actions.Click;
import question.login.loginQuestion;
import task.BD.ReadDataBDTaks;
import userInterface.login.LoginUI;

import static hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class LoginStep {

    @Given("el usuario esta en la pagina de Practice Test Automation")
    public void elUsuarioEstaEnEaPaginaDePracticeTestAutomation() {
        pragma.attemptsTo(
                Navigation.theTestAutomation()
        );
    }
    @When("ingresa el usuario y el password leidos de la base de datos")
    public void ingresaElUsuarioYElPasswordLeidosDeLaBaseDeDatos() {
        pragma.attemptsTo(
                ReadDataBDTaks.conCredencialesBD(1)
        );
    }
    @When("valida el login exitoso")
    public void validaElLoginExitoso() {
        pragma.should(seeThat(
                loginQuestion.moduleIsVisible())
        );
    }
    @Then("cierra sesion")
    public void cierraSesion() {
        pragma.attemptsTo(
              Click.on(LoginUI.BUTTON_LOGOUT)
        );
    }
}
