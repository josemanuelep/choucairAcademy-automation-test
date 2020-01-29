package co.com.choucair.certification.airbnb.tasks;

import co.com.choucair.certification.airbnb.model.Information;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.airbnb.userinterface.EditProfile.*;
import static co.com.choucair.certification.airbnb.util.Constants.INDEX_0;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class FillEditProfile implements Task {
    private List<Information> informations;

    public FillEditProfile(List<Information> informations) {
        this.informations = informations;
    }

    public static FillEditProfile forThePrfile(List<Information> informations) {
        return Tasks.instrumented(FillEditProfile.class, informations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BUTTON_EXPAND_ALL, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_EXPAND_ALL),
//                Enter.theValue(this.informations.get(INDEX_0).getDescription()).into(INPUT_DESCRIPTION),
                Enter.theValue(this.informations.get(INDEX_0).getPhoneticName()).into(INPUT_PHONETIC_NAME),
                Enter.theValue(this.informations.get(INDEX_0).getPhoneticLastName()).into(INPUT_PHONETIC_LASTNAME),
                Enter.theValue(this.informations.get(INDEX_0).getInterests()).into(INPUT_INTERESTS).thenHit(Keys.ENTER),
                Enter.theValue(this.informations.get(INDEX_0).getWebpage()).into(INPUT_WEBPAGE),
                Enter.theValue(this.informations.get(INDEX_0).getSkype()).into(INPUT_SKYPE),
                Enter.theValue(this.informations.get(INDEX_0).getId().toString()).into(INPUT_ID),
                Enter.theValue(this.informations.get(INDEX_0).getPhone1().toString()).into(INPUT_PHONE1),
                Enter.theValue(this.informations.get(INDEX_0).getPhone2().toString()).into(INPUT_PHONE2),
                Enter.theValue(this.informations.get(INDEX_0).getAddress()).into(INPUT_ADDRESS),
                Click.on(BUTTON_SAVE_INFORMATION)
        );
    }
}
