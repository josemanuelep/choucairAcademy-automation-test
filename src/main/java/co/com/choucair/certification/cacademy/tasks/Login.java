package co.com.choucair.certification.cacademy.tasks;

import co.com.choucair.certification.cacademy.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.certification.cacademy.userinterface.LoginPage.*;
import static co.com.choucair.certification.cacademy.util.Constants.INDEX_0;

public class Login implements Task {
    private List<User> users;

    public Login(List<User> users) {
        this.users = users;
    }

    public static Login with(List<User> loginData) {
        return Tasks.instrumented(Login.class, loginData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SHOW_LOGIN_BUTTON),
                Enter.theValue(users.get(INDEX_0).getEmail()).into(INPUT_USERNAME),
                Enter.theValue(users.get(INDEX_0).getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
