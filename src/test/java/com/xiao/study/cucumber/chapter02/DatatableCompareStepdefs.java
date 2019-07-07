package com.xiao.study.cucumber.chapter02;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DatatableCompareStepdefs {
    
    private List<List<String>> source;

    @Given("open the db connection pool")
    public void openDBConnectionPool(){

    }

    @When("^insert the batch of data$")
    public void insertTheBatchOfData(DataTable dataTable) throws Throwable {
        this.source=dataTable.cells();
    }


    @Then("^validation the data is insert$")
    public void validationTheDataIsInsert(DataTable expectedData) throws Throwable {
        expectedData.diff(DataTable.create(source));
    }

    @When("^Delete the user (.*)$")
    public void deleteTheUser(String user) throws Throwable {
        List<List<String>> source=new ArrayList<List<String>>();
        Iterator<List<String>> iterator=this.source.iterator();
        while(iterator.hasNext()){
            List<String> item=iterator.next();
            if(!item.get(0).equals(user)){
                source.add(item);
            }
        }
        this.source=source;
    }

    @Then("^validation the data after delete$")
    public void validationTheDataAfterDelete(DataTable expectedData) throws Throwable {
        expectedData.diff(DataTable.create(source));
    }


}
