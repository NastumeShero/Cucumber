package com.xiao.study.cucumber.quickstart;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MyStepdefs implements En {

    public MyStepdefs() {
        Given("^application URL is ready with the user$", () -> {
            // Write code here that turns the phrase above into concrete actions
            assertThat(1,equalTo(1));
        });
        When("^user enters the URL in browser$", () -> {
            // Write code here that turns the phrase above into concrete actions
            assertThat(1,equalTo(1));
        });
        Then("^application page loads$", () -> {
            // Write code here that turns the phrase above into concrete actions
            assertThat(1,equalTo(1));
        });
    }
}
