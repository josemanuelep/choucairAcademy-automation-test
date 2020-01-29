package co.com.choucair.certification.airbnb.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.airbnb.userinterface.EditProfile.*;

public class Navigate implements Task {

    public static Navigate toEditProfile() {
        return Tasks.instrumented(Navigate.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_DROPDOWN),
                Click.on(BUTTON_PROFILE),
                Click.on(BUTTON_EDIT_PROFILE));
    }
}
