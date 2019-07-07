package com.xiao.study.cucumber.chapter02;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class RegexStepdefs {
    private int x,y;
    private int result;

    //若注解的描述中，与feature文件中的内容一致，则数字1和2就是普通的描述，不能作为变量导入
    @Given("^the number 1 and number 2")
    public void givenCase1(){
        System.out.println("描述中没有使用正则表达式，数字不会作为变量传入");

    }

    //在注解的描述中，通过(\\d+)的正则表达式来识别feature文件中的数字为变量，一定要加上括号
    @Given("^the number is (\\d+) and number (-?\\d+\\.?)")
    public void givenCase(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println(x);
        System.out.println(y);
    }

//    //Given中的正则表达式没有加上括号，则无法获取参数；此处运行时会提示该step没有参数，而方法中定义了两个属性
//    @Given("^the number \\d+ and number is \\d+$")
//    public void givenCase4(int x,int y){
//        this.x=x;
//        this.y=y;
//        System.out.println(x);
//        System.out.println(y);
//    }



    @When("^take the add action$")
    public void takeTheAddAction() throws Throwable {

        this.result=x+y;
    }

    @Then("^the result number 3$")
    public void thenCase1() throws Throwable {

    }

    //通过feature文件中step的提示，通过create step来自动生成时，会将数字直接作为变量用
    @Then("^the result number is (\\d+)$")
    public void theResultNumberIs(int arg0) throws Throwable {
        assertThat(result,equalTo(arg0));
        System.out.println(result);
    }


    @Given("^the number is (\\d+) and number is (\\d+\\.?\\d*)$")
    public void theNumberIsAndNumberIs(int arg0, float arg1) throws Throwable {
       System.out.println(arg0);
        System.out.println(arg1);
    }
}
