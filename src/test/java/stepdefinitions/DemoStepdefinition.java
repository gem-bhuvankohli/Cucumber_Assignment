package stepdefinitions;

import implementations.DemoImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoStepdefinition {

    @Given("^user is on homepage$")
    public void openUrl(){
DemoImplementation.openAmazonUrl();
    }
    @Then("^user verifies amazon.in is visible$")
    public void validateAmazonText(){
        DemoImplementation.validateAmazonText();
    }
    @Then("^user validates the search$")
    public void validateSearch(){
        DemoImplementation.validateSearch();
    }
    @When("^user enters \"books\" in search box$")
    public void enterValue(){
        DemoImplementation.enterValue();
    }
}
