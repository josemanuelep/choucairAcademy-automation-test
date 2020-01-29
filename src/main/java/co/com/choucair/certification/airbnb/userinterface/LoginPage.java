package co.com.choucair.certification.airbnb.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target SHOW_LOGIN_BUTTON = Target.the("Button to show login form").located(By.xpath("(//A[@id=''])[1]"));
    public static final Target INPUT_PASSWORD = Target.the("Input password").located(By.id("password"));
    public static final Target INPUT_USERNAME = Target.the("Input user").located(By.id("username"));
    public static final Target BUTTON_LOGIN = Target.the("Button login").located(By.cssSelector(".btn-primary"));
}
