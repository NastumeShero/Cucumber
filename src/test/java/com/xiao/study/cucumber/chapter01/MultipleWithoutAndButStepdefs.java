package com.xiao.study.cucumber.chapter01;

import cucumber.api.java8.En;

public class MultipleWithoutAndButStepdefs implements En {

    public MultipleWithoutAndButStepdefs() {

        Given("user open the url of git", () -> {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("user open the url of git");
        });

        Given("user open the url of Jenkins", () -> {
            System.out.println("user open the url of Jenkins");
        });

        When("click build job link", () -> {
            System.out.println("click build job link");
        });

        Then("the job will be started", () -> {
            System.out.println("the job will be started");
        });

        When("click the job id link", () -> {
            System.out.println("click the job id link");
        });

        When("choice the job console", () -> {
            System.out.println("choice the job console");
        });

        When("goto the console page", () -> {
            System.out.println("goto the console page");
        });

        Then("the job building log will be print", () -> {
            System.out.println("the job building log will be print");
        });

        Then("the last job can see successfully state", () -> {
            System.out.println("the last job can see successfully state");
        });
    }
}
