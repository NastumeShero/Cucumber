package com.xiao.study.cucumber.chapter02;


import cucumber.api.java.en.Given;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonFormat;


import java.util.Date;

public class DateFormatStepdefs {

    @Given("^i am born at (.+)$")
    public void born(String date){
        System.out.println(date);
    }


    /**
     * 当直接将传入的参数定义为Date类型时，程序会抛出异常java.lang.IllegalArgumentException: Can't transform '2017-11-20' to class java.util.Date
     *
     * @Format("yyyy-MM-dd")
     * */
    @Given("^x is born at (.+)$")
    public void xIsBornAt( Date date) throws Throwable {
        System.out.println(date);
    }


}
