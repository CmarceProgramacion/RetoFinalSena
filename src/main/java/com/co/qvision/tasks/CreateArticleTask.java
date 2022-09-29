package com.co.qvision.tasks;

import com.co.qvision.models.ArticleModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.qvision.userinterfaces.EditorPage.*;

public class
CreateArticleTask implements Task {
    private final ArticleModel articleModel;

    public CreateArticleTask(ArticleModel articleModel) {
        this.articleModel = articleModel;
    }

    public static Performable createArticle(ArticleModel articleModel) {
        return Tasks.instrumented(CreateArticleTask.class, articleModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_NEW_ARTICLE),
                Enter.theValue(articleModel.getTitle()).into(INPUT_ARTICLE_TITLE),
                Enter.theValue(articleModel.getAbout()).into(INPUT_ARTICLE_ABOUT),
                Enter.theValue(articleModel.getArticle()).into(INPUT_ARTICLE),
                Enter.theValue(articleModel.getTags()).into(INPUT_TAG),
                Click.on(BUTTON_PUBLISH)
        );

    }
}
