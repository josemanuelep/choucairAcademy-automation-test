package co.com.choucair.certification.airbnb.stepsdefinitions;

import co.com.choucair.certification.airbnb.model.Information;
import co.com.choucair.certification.airbnb.model.User;
import co.com.choucair.certification.airbnb.questions.IsLoggedIn;
import co.com.choucair.certification.airbnb.tasks.Login;
import co.com.choucair.certification.airbnb.tasks.Navigate;
import co.com.choucair.certification.airbnb.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepsDefinitions {

    @Given("^Given that Jose wants to enter to the web page$")
    public void givenThatJoseWantsToEnterToTheWebPage(List<User> users)  {
        theActorCalled("Jose").wasAbleTo(OpenThe.page(), Login.with(users));
    }


    @Then("^He should  see the top-screen message of welcome with the text \"([^\"]*)\"$")
    public void heShouldSeeTheTopScreenMessageOfWelcomeWithTheTextChoucair(String label)  {
        theActorInTheSpotlight().should(seeThat(IsLoggedIn.inThe(label)));
    }

    @Given("^that Jose go to the edit profile page$")
    public void thatJoseGoToTheEditProfilePage()  {
        theActorCalled("Jose").wasAbleTo(Navigate.toEditProfile());
    }

    @When("^Jose add the missing information$")
    public void joseAddTheMissingInformation(List<Information> informations)  {

    }

    @Then("^Jose should see a top middle message like \"([^\"]*)\"$")
    public void joseShouldSeeATopMiddleMessageLike(String arg1) {

    }

}
