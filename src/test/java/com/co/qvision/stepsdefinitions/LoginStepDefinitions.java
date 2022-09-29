package com.co.qvision.stepsdefinitions;

import com.co.qvision.models.AccountModel;
import com.co.qvision.models.ArticleModel;
import com.co.qvision.questions.VerifyCreatedArticle;
import com.co.qvision.questions.VerifyLogin;
import com.co.qvision.questions.VerifyProfile;
import com.co.qvision.tasks.CreateAccountTask;
import com.co.qvision.tasks.CreateArticleTask;
import com.co.qvision.tasks.DebugPlatformTask;
import com.co.qvision.tasks.LogInAccountTask;
import com.co.qvision.userinterfaces.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static com.co.qvision.userinterfaces.EditorPage.BUTTON_DELETE_ARTICLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinitions {
    @Before
    public void iniciarConfiguracion() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("Maria");
    }

    @Given("accedo a la plataforma conduit")
    public void accedoALaPlataformaConduit() {
        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.browserOn().the(HomePage.class)
        );
    }

    @When("registro la informacion")
    public void registroLaInformacion(List<List<String>> listDataAccount) {

        AccountModel accountModel = new AccountModel(listDataAccount.get(0));
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateAccountTask.createAccount(accountModel)
        );

    }

    @When("realizo el logueo")
    public void realizoElLogueo(List<List<String>> listDataAccount) {
        AccountModel accountModel = new AccountModel(listDataAccount.get(0).get(0), listDataAccount.get(0).get(1));


        OnStage.theActorInTheSpotlight().attemptsTo(
                LogInAccountTask.logIn(accountModel)
        );

    }

    @When("realizo una publicacion de articulo")
    public void realizoUnaPublicacionDeArticulo(List<List<String>> listDataArticle) {
        ArticleModel articleModel = new ArticleModel(listDataArticle.get(0));
        OnStage.theActorInTheSpotlight().attemptsTo(
                CreateArticleTask.createArticle(articleModel)
        );
    }

    @Then("Verificar la creacion a la cuenta {string}")
    public void verificarLaCreacionALaCuenta(String userName) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerifyProfile.verify(userName))
        );

    }

    @Then("Verificar inicio de sesion {string}")
    public void verificarInicioDeSesion(String userName) {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerifyLogin.verify(userName))
        );

    }

    @Then("verificar que la publicacion se creo {string}")
    public void verificarQueLaPublicacionSeCreo(String title) {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(VerifyCreatedArticle.verify(title))
        );
    }

    @After
    public void endAutomation() {
        theActorInTheSpotlight().attemptsTo(
                Check.whether(BUTTON_DELETE_ARTICLE.isVisibleFor(OnStage.theActorInTheSpotlight()))
                        .andIfSo(DebugPlatformTask.withData())
        );
        Serenity.getWebdriverManager().closeCurrentDrivers();
    }
}
