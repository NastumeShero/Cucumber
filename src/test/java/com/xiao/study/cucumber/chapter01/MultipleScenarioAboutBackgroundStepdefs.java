package com.xiao.study.cucumber.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class MultipleScenarioAboutBackgroundStepdefs implements En {
    public MultipleScenarioAboutBackgroundStepdefs() {

        Given("^x and y value$", () -> {

        });

        And("^invoke and method$", () -> {

        });

        When("^click the calculator button$", () -> {

        });
        Then("^the result is x\\+y$", () -> {

        });
        And("^invoke sub method$", () -> {

        });
        Then("^the result is x-y$", () -> {

        });

    }
}
