package com.co.qvision.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.SingInUpPage.BUTTON_PROFILE;

public class VerifyProfile implements Question<Boolean> {

    private String userName;

    public VerifyProfile(String userName) {
        this.userName = userName;
    }

    public static VerifyProfile verify(String userName) {
        return new VerifyProfile(userName);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        userName = userName.replace("#", Serenity.sessionVariableCalled("numberRandom"));
        return BUTTON_PROFILE.of(userName).isVisibleFor(actor);
    }

}
