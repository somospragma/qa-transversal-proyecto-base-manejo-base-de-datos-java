package task.BD;

import interactions.ScrollTop;
import interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterface.login.LoginUI;
import utils.BD.AppBD;
import utils.BD.ConectionBD;
import utils.BD.QueriesBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static utils.BD.UtilConstants.MYSQL_URL;
import static utils.BD.UtilConstants.MYSQL_PASSWORD;
import static hooks.TheActor.pragma;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.BD.UtilConstants.MYSQL_USER;

public class ReadDataBDTaks implements Task {
    private final int id;
    public ReadDataBDTaks(int id) {
        this.id = id;
    }

    public static Performable conCredencialesBD(int id) {
        return instrumented(ReadDataBDTaks.class, id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ResultSet resultSet;
        HashMap<String, String> hashMap;
        try {
            Connection connection = ConectionBD.util().crearConexionMySql(MYSQL_URL, MYSQL_USER, MYSQL_PASSWORD);
            resultSet = AppBD.executeSelect(String.format(QueriesBD.SELECT_DATA_SEARCH_VALUES_BY_ID, id), connection);
            hashMap = (HashMap<String, String>) AppBD.fillHashWithResultSetRecord(resultSet);
            ConectionBD.util().closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException("error obteniendo valor de la base de datos, mensaje: " + e.getMessage());
        }
        pragma.attemptsTo(Enter.theValue(hashMap.get("username")).into(LoginUI.INPUT_USERNAME),
                Enter.theValue(hashMap.get("password")).into(LoginUI.INPUT_PASSWORD),
                Wait.theSeconds(3),
                ScrollTop.pagina("window.scrollBy(0, 500);"),
                Click.on(LoginUI.BUTTON_SUBMIT)
        );

    }
}
