package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;

public class S01_register {

  homePage home = new homePage();
    @Given("user open Register Link")
    public void openRegistration(){
     home.openRegisterpage();
    }

    @When("user enter personal data")
    public void userEnterPersonalData() {
    home.fillData();
    }

    @And("user click on Register button")
    public void userClickOnRegisterButton() {
    home.confirmation();
    }


  @Then("user is registered successfully")
  public void userIsRegisteredSuccessfully() {
  home.assertion();
  }
}
