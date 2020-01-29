package co.com.choucair.certification.cacademy.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.cacademy.userinterface.LoginPage.LABEL_LOGIN;

public class IsLoggedIn implements Question<Boolean> {

    private String labelWelcome;

    public IsLoggedIn(String src) {
        this.labelWelcome = src;
    }

    public static IsLoggedIn inThe(String question) {
        return new IsLoggedIn(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String label = LABEL_LOGIN.resolveFor(actor).getText();
        return (this.labelWelcome.equals(label));
    }
}