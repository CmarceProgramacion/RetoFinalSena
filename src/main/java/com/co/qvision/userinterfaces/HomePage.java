package com.co.qvision.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {
    public static final Target BUTTON_SIGN_UP = Target.the("Boton para crear cuenta").locatedBy("//a[@href='/register']");
    public static final Target BUTTON_SIGN_IN = Target.the("Boton para iniciar sesion").locatedBy("//a[@href='/login']");


}
