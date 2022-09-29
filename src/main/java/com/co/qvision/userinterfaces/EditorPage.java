package com.co.qvision.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class EditorPage extends PageObject {

    public static final Target BUTTON_NEW_ARTICLE = Target.the("Boton para acceder al editor").locatedBy("//a[@routerlink='/editor']");
    public static final Target INPUT_ARTICLE_TITLE = Target.the("Campo de titulo").locatedBy("//input[@formcontrolname='title']");
    public static final Target INPUT_ARTICLE_ABOUT = Target.the("Campo de acerca del tema").locatedBy("//input[@formcontrolname='description']");
    public static final Target INPUT_ARTICLE = Target.the("Campo de articulo").locatedBy("//textarea[@formcontrolname='body']");
    public static final Target INPUT_TAG = Target.the("Campo de tags").locatedBy("//input[@placeholder='Enter tags']");
    public static final Target BUTTON_PUBLISH = Target.the("Boton pata prublicar").locatedBy("//button[@type='button']");
    public static final Target LABEL_TITLE = Target.the("Titulo del articulo").locatedBy("//div[@class='container']/h1[text()='{0}']");
    public static final Target BUTTON_DELETE_ARTICLE = Target.the("Boton de eliminacion del articulo").locatedBy("//i[@class='ion-trash-a']");

}
