package userInterface.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {


    public static final Target INPUT_USERNAME = Target.the("Input para ingresar el usuario").located(By.xpath("//*[@id=\"username\"]"));
    public static final Target INPUT_PASSWORD = Target.the("Input para ingresar el usuario").located(By.xpath("//*[@id=\"password\"]"));

    public static final Target BUTTON_SUBMIT = Target.the("boton submit para hacer login").located(By.xpath("//*[@id=\"submit\"]"));

    public static final Target LOGGED_SUCCESSFULLY = Target.the("copy logueo exitoso").located(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));

    public static final Target BUTTON_LOGOUT = Target.the("Boton para cerrar la sesion").located(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));

}
