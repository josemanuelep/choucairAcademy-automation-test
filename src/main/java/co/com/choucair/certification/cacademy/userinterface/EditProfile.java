package co.com.choucair.certification.cacademy.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EditProfile {

    public static final Target LABEL_SAVED = Target.the("Saved label").located(By.xpath("//H3[text()='Detalles de usuario']"));
    public static final Target BUTTON_DROPDOWN = Target.the("Button dropdown").located(By.id("dropdown-1"));
    public static final Target BUTTON_PROFILE = Target.the("Button profile").located(By.id("actionmenuaction-2"));
    public static final Target BUTTON_EDIT_PROFILE = Target.the("Button Edit profile").located(By.xpath("//A[@href='https://operacion.choucairtesting.com/academy/user/edit.php?id=8012&returnto=profile'][text()='Editar perfil']"));
    public static final Target INPUT_DESCRIPTION = Target.the("Description input").located(By.id("id_description_editoreditable"));
    public static final Target BUTTON_EXPAND_ALL = Target.the("Button expand all").located(By.xpath("//div[@class='collapsible-actions']/a"));
    public static final Target INPUT_PHONETIC_NAME = Target.the("Pname input").located(By.name("firstnamephonetic"));
    public static final Target INPUT_PHONETIC_LASTNAME = Target.the("PLast input").located(By.id("id_lastnamephonetic"));
    public static final Target INPUT_INTERESTS = Target.the("Interest input").located(By.xpath("((//div[@class='col-md-9 form-inline felement'])[16]/input)[2]"));
    public static final Target INPUT_WEBPAGE = Target.the("Webpage input").located(By.id("id_url"));
    public static final Target INPUT_SKYPE = Target.the("Skype input").located(By.id("id_skype"));
    public static final Target INPUT_ID = Target.the("id input").located(By.id("id_idnumber"));
    public static final Target INPUT_PHONE1 = Target.the("Phone1 input").located(By.id("id_phone1"));
    public static final Target INPUT_PHONE2 = Target.the("Phone2 input").located(By.id("id_phone2"));
    public static final Target INPUT_ADDRESS = Target.the("Address input").located(By.id("id_address"));
    public static final Target BUTTON_SAVE_INFORMATION = Target.the("Button save").located(By.id("id_submitbutton"));
    private EditProfile() {
    }

}
