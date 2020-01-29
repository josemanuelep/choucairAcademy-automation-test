package co.com.choucair.certification.cacademy.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ChoucairAcademy.feature",
        tags = "@Tag1",
        glue = {"co.com.choucair.certification.cacademy.stepsdefinitions", "co.com.choucair.certification.cacademy.util"},
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
