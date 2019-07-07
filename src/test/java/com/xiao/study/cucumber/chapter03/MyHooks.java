package com.xiao.study.cucumber.chapter03;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.logging.Logger;

public class MyHooks {

    private static final Logger LOG=Logger.getLogger("MyHooks");

    //多个Before时，通过order来定义执行顺序，按照从小到大的顺序执行的；默认值为10000
//    @Before(order=10)
//    public  void before(){
//        LOG.info("=======my hooks before===========");
//    }
//
//    @After
//    public void after(){
//        LOG.info("=======my hooks after===========");
//    }
//
//    @Before(order=100)
//    public  void anotherBefore(){
//        LOG.info("=======my hooks anotherBefore===========");
//    }

//    @After(value = "~@v-1.0.0,@author1",order = 100)
//    public void anotherAfter(){
//        LOG.info("=======my hooks anotherAfter===========");
//    }


}
