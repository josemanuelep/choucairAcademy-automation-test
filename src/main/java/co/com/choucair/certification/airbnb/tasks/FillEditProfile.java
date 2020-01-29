package co.com.choucair.certification.airbnb.tasks;

import co.com.choucair.certification.airbnb.model.Information;
import kotlin.contracts.CallsInPlace;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class FillEditProfile implements Task {
    private List<Information> informations;

    public FillEditProfile(List<Information> informations) {
        this.informations = informations;
    }
    public static FillEditProfile forThePrfile(List<Information> informations){
        return Tasks.instrumented(FillEditProfile.class,informations);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }
}
