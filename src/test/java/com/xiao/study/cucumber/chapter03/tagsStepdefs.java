package com.xiao.study.cucumber.chapter03;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import java.util.logging.Logger;

public class tagsStepdefs {

    private static final Logger LOG=Logger.getLogger("Tag");

    @Given("^open the github home page with (.+)$")
    public void openHomePage(String dataTag){
        LOG.info("=======my tag"+dataTag+"===========");
    }

//    @Before("@v-1.0.0")
//    public  void before(){
//        LOG.info("=======my tag before===========");
//    }

    @Given("^this is the background$")
    public void thisIsTheBackground() throws Throwable {
        LOG.info("=======this is the background===========");
    }



}
