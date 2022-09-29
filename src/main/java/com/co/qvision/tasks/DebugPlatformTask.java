package com.co.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.qvision.userinterfaces.EditorPage.BUTTON_DELETE_ARTICLE;


public class DebugPlatformTask implements Task {

    public static Performable withData() {
        return Tasks.instrumented(DebugPlatformTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_DELETE_ARTICLE),
                WaitUntil.the(BUTTON_DELETE_ARTICLE, WebElementStateMatchers.isNotVisible())
        );
    }
}

