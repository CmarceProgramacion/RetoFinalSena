package com.co.qvision.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SingInUpPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Cuadro de texto para ingresar el usuario").locatedBy("//input[@placeholder='Username']");
    public static final Target INPUT_EMAIL = Target.the("Cuadro de texto para ingresar el email").locatedBy("//input[@formcontrolname='email']");
    public static final Target INPUT_PASSWORD = Target.the("Cuadro de texto para ingresar el password").locatedBy("//input[@formcontrolname='password']");
    public static final Target BUTTON_SUBMIT = Target.the("Boton de registar cuenta").locatedBy("//button[@type='submit']");
    public static final Target BUTTON_PROFILE = Target.the("Boton de perfil").locatedBy("//a[contains(text(),'{0}')]");

}
