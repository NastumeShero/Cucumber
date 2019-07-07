package com.xiao.study.cucumber.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class WithoutScenarioOutlineStepdefs {

    private Boolean login;

    @Given("^open the login page$")
    public void openTheLoginPage() throws Throwable {

    }

    @When("^user \"([^\"]*)\" with password \"([^\"]*)\"$")
    public void userWithPassword(String username, String password) throws Throwable {

        this.login=(username.equals("Tami") && password.equals("123456"));

    }


    @Then("^the user login failed$")
    public void theUserLoginFailed() throws Throwable {

        assertThat(this.login,equalTo(false));
    }

    @Then("^the user login success$")
    public void theUserLoginSuccess() throws Throwable {

        assertThat(this.login,equalTo(true));
    }

}
