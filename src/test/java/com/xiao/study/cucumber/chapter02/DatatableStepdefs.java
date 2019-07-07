package com.xiao.study.cucumber.chapter02;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.DataTableType;

import java.util.List;
import java.util.Map;

public class DatatableStepdefs {


    @Given("^the user open the login page$")
    public void dataDisplayAsRaw() throws Throwable {

    }

    @When("^let's validate the following user account and password$")
    public void dataTableAsList(DataTable dataTable) throws Throwable {
        List<List<String>> dataRaw= dataTable.cells();
        System.out.println(dataRaw);
    }

    @When("^let's validate the following user account and password user-defined$")
    public void Board(Board dataTable) throws Throwable {

        System.out.println(dataTable.toString());

    }

    @When("^let's validate the following user account and password listMap$")
    public void toListMaps(List<Map<String,String>> dataMap) throws Throwable {
        dataMap.forEach(System.out::println);
    }

    //与toListMaps是一样的结果
//    @When("^let's validate the following user account and password listMap$")
//    public void dataDisplayAsMap(DataTable dataTable) throws Throwable {
//        List<Map<String,String>> dataMap= dataTable.asMaps();
//        System.out.println(dataMap);
//    }

    @When("^let's validate the following user account and password listlist$")
    public void toListlist(List<List<String>> dataList) throws Throwable {
        dataList.forEach(System.out::println);
    }

//    @When("^let's validate the following user account and password user-defined-class$")
//    public void toUserDefinedClass(List<Account> data) throws Throwable {
//
//        data.forEach(System.out::println);
//
//    }



}
