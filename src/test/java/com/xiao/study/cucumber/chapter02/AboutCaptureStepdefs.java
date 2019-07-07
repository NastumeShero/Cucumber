package com.xiao.study.cucumber.chapter02;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class AboutCaptureStepdefs {

    @Given("^the number is (\\d+)$")
    public void groupCapture(int value){
        System.out.println(value);
    }


    @Given("^no capture the number is \\d+$")
    public void noCaptureTheNumberIs() throws Throwable {

    }

//  想通过一个方法匹配多条step，并且作为参数传入时，可以用如下方法
    @Given("^I (have|not have) 200 RMB in my package$")
    public void captureString(String data) throws Throwable {
        System.out.println(data);
    }
//     当程序只想匹配多个step，而不作为参数导入时，则需要在获取参数的表达式前面加上?:
    @Given("^I (?:have|not have|put|) 200 Dollar in my package$")
    public void iHaveDollarInMyPackage() throws Throwable {

    }
}
