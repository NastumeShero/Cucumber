package com.xiao.study.cucumber.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ArgumentStepdefs {

    private String name;
    private int age;
    private String result;

    @Given("^the name is \"([^\"]*)\" and the age is (\\d+)$")
    public void theNameIsAndTheAgeIs(String arg0, int arg1) throws Throwable {
        this.name = arg0;
        this.age = arg1;
    }

    @When("^format the input$")
    public void formatTheInput() throws Throwable {
        this.result = name + "-" + age;
    }

    @Then("^the format output is \"([^\"]*)\"$")
    public void theFormatOutputIs(String value) throws Throwable {
        assertThat(result, equalTo(value));
    }
}
