package co.com.choucair.certification.airbnb.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EditProfile {

    public static final Target BUTTON_DROPDOWN = Target.the("Button login").located(By.id("dropdown-1"));
    public static final Target BUTTON_PROFILE = Target.the("Button login").located(By.id("actionmenuaction-2"));
    public static final Target BUTTON_EDIT_PROFILE = Target.the("Button login").located(By.xpath("//A[@href='https://operacion.choucairtesting.com/academy/user/edit.php?id=8012&returnto=profile'][text()='Editar perfil']"));
    public static final Target INPUT_DESCRIPTION = Target.the("Button login").located(By.id("id_description_editoreditable"));
    public static final Target BUTTON_EXPAND_ALL = Target.the("Button login").located(By.id("yui_3_17_2_1_1580309201277_768"));
    public static final Target INPUT_PHONETIC_NAME = Target.the("Button login").located(By.id("firstnamephonetic"));
    public static final Target INPUT_PHONETIC_LASTNAME = Target.the("Button login").located(By.id("id_description_editoreditable"));
    public static final Target INPUT_INTERESTS = Target.the("Button login").located(By.id("form_autocomplete_input-1580309201814"));
    public static final Target INPUT_WEBPAGE = Target.the("Button login").located(By.id("id_url"));
    public static final Target INPUT_SKYPE = Target.the("Button login").located(By.id("id_skype"));
    public static final Target INPUT_ID = Target.the("Button login").located(By.id("id_idnumber"));
    public static final Target INPUT_PHONE1 = Target.the("Button login").located(By.id("phone1"));
    public static final Target INPUT_PHONE2 = Target.the("Button login").located(By.id("id_phone2"));
    public static final Target INPUT_ADDRESS = Target.the("Button login").located(By.id("id_address"));
    public static final Target BUTTON_SAVE_INFORMATION = Target.the("Button login").located(By.id("id_submitbutton"));
}
