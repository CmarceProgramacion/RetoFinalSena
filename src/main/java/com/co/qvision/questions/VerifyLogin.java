package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.SingInUpPage.BUTTON_PROFILE;

public class VerifyLogin implements Question<Boolean> {

    private final String userName;

    public VerifyLogin(String userName) {
        this.userName = userName;
    }

    public static VerifyLogin verify(String userName) {
        return new VerifyLogin(userName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        return BUTTON_PROFILE.of(userName).isVisibleFor(actor);
    }

}
