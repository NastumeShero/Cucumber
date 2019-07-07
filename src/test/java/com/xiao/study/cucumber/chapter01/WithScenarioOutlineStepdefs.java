package com.xiao.study.cucumber.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class WithScenarioOutlineStepdefs {

    private Boolean login;

    @Given("^open the login page testing scenario outline$")
    public void openTheLoginPageTestingScenarioOutline() throws Throwable {

    }


    @When("^user \"([^\"]*)\" with password \"([^\"]*)\" testing scenario outline$")
    public void userWithPasswordTestingScenarioOutline(String username, String password) throws Throwable {
        this.login=(username.equals("Tami") && password.equals("123456"));
    }


    @Then("^the username and password is correct$")
    public void theUsernameAndPasswordIsCorrect() throws Throwable {

    }

    @Then("^the user or password is invalid$")
    public void theUserOrPasswordIsInvalid() throws Throwable {

    }
}
