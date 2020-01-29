package co.com.choucair.certification.airbnb.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.choucair.certification.airbnb.userinterface.EditProfile.LABEL_SAVED;
import static co.com.choucair.certification.airbnb.userinterface.LoginPage.LABEL_LOGIN;

public class IsSavedEdit implements Question<Boolean> {
    private String label;

    public IsSavedEdit(String label) {
        this.label = label;
    }
    public static IsSavedEdit inTheProfile(String question) {
        return new IsSavedEdit(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        String labelEdit = LABEL_SAVED.resolveFor(actor).getText();
        return (this.label.equals(labelEdit));
    }
}
