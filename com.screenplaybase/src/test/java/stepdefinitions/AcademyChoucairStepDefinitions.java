package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.Login;
import task.OpenUp;
import task.Search;

public class AcademyChoucairStepDefinitions {

    @Before
    public void setStage () {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than Carolina wants to learn automation at the academy Choucair$")
    public void thanCarolinaWantsToLearnAutomationAtTheAcademyChoucair(){
        OnStage.theActorCalled("Carolina").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
    }

    @When("^she search for the course Recursos Automatizacion Bancolombia on the Choucair Academy platform$")
    public void sheSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(/*String course*/){/*
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));*/
    }

    @Then("^she finds the course called resources Recursos Automatizacion Bancolombia$")
    public void sheFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(){
    }
}
