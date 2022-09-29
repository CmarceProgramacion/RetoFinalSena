package com.co.qvision.tasks;

import com.co.qvision.models.AccountModel;
import com.co.qvision.userinterfaces.HomePage;
import com.co.qvision.utils.GenerateUserEmailUtil;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.qvision.userinterfaces.SingInUpPage.*;

public class CreateAccountTask implements Task {

    private final AccountModel account;

    public CreateAccountTask(AccountModel account) {
        this.account = account;
    }

    public static Performable createAccount(AccountModel account) {
        return Tasks.instrumented(CreateAccountTask.class, GenerateUserEmailUtil.generateModel(account));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_SIGN_UP),
                Enter.theValue(account.getUserName()).into(INPUT_USERNAME),
                Enter.theValue(account.getEmail()).into(INPUT_EMAIL),
                Enter.theValue(account.getPassword()).into(INPUT_PASSWORD),
                Click.on(BUTTON_SUBMIT)

        );
    }
}
