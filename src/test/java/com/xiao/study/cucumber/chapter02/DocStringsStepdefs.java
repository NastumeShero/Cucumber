package com.xiao.study.cucumber.chapter02;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class DocStringsStepdefs {

    @Given("^the book is about Concurrency$")
    public void theBookInfo(String bookinfo){
        System.out.println(bookinfo);
    }

    @Given("^my name is (.+)$")
    public void myNameIsUser(String name,String details) throws Throwable {
        System.out.println(name);
        System.out.println(details);
    }
}
