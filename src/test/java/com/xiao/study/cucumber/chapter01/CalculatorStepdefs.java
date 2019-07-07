package com.xiao.study.cucumber.chapter01;


import cucumber.api.PendingException;
import cucumber.api.java8.En;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CalculatorStepdefs implements En {

    private Calculator calculator;
    int result;

    public CalculatorStepdefs() {


        Given("^x is (\\d+) and y is (\\d+)$", (Integer arg0, Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            this.calculator=new Calculator(arg0,arg1);
        });

        When("^invoke add method$", () -> {
            // Write code here that turns the phrase above into concrete actions
            result= this.calculator.add();
        });

        Then("^the result is (\\d+)$", (Integer arg0) -> {
            //验证实际结果与预期结果，result为计算出来的结果，int1为feature文件中给出的预期值
            assertThat(result,equalTo(arg0));
        });

        When("^invoke subtraction method$", () -> {
            // Write code here that turns the phrase above into concrete actions
           result=this.calculator.subtraction();
        });
    }




}
