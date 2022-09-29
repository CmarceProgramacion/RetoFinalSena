package com.co.qvision.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.co.qvision.userinterfaces.EditorPage.LABEL_TITLE;

public class VerifyCreatedArticle implements Question<Boolean> {
    private final String title;

    public VerifyCreatedArticle(String title) {
        this.title = title;
    }

    public static VerifyCreatedArticle verify(String title) {
        return new VerifyCreatedArticle(title);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return LABEL_TITLE.of(title).isVisibleFor(actor);
    }
}
