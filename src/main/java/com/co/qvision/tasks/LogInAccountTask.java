package com.co.qvision.tasks;

import com.co.qvision.models.AccountModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.qvision.userinterfaces.HomePage.BUTTON_SIGN_IN;
import static com.co.qvision.userinterfaces.SingInUpPage.*;

public class LogInAccountTask implements Task {
    private final AccountModel accountModel;

    public LogInAccountTask(AccountModel accountModel) {
        this.accountModel = accountModel;
    }

    public static Performable logIn(AccountModel accountModel) {
        return Tasks.instrumented(LogInAccountTask.class, accountModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SIGN_IN),
                Enter.theValue(accountModel.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(accountModel.getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_SUBMIT)
        );

    }
}
