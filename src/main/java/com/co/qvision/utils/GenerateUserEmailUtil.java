package com.co.qvision.utils;

import com.co.qvision.models.AccountModel;
import net.serenitybdd.core.Serenity;

public class GenerateUserEmailUtil {

    public static AccountModel generateModel(AccountModel accountModel) {
        String userName = accountModel.getUserName();
        String email = accountModel.getEmail();
        String numberRandom = generateNumber();

        Serenity.setSessionVariable("numberRandom").to(numberRandom);

        accountModel.setUserName(userName.replace("#", numberRandom));
        accountModel.setEmail(email.replace("#", numberRandom));

        return accountModel;
    }

    private static String generateNumber() {
        return String.valueOf((int) (Math.random() * 9999) + 1);
    }

}
