package com.xiao.study.cucumber.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class MultipleWithAndButStepdefs implements En {


    public MultipleWithAndButStepdefs() {
        Given("alex open the url of git", () -> {

        });
        And("^alex open the url of Jenkins$", () -> {

        });
        When("^alex click build job link$", () -> {

        });
        Then("^the job will be start$", () -> {

        });
        When("^alex click the job id link$", () -> {

        });
        And("^alex choice the job console$", () -> {

        });
        And("^alex goto the console page$", () -> {

        });
        Then("^alex the job building log will be print$", () -> {

        });
        And("^alex the last job can see successfully state$", () -> {

        });
        But("^alex the job will not running at current$", () -> {

        });


    }
}
