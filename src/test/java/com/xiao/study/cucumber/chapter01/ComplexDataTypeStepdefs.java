package com.xiao.study.cucumber.chapter01;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;


public class ComplexDataTypeStepdefs {



    @Given("^the user account information$")
    public void theUserAccountInformation() throws Throwable {
        System.out.println("The UserAccount information");
    }


    @Then("^We can found the user \"([^\"]*)\" with password is \"([^\"]*)\",phone is \"([^\"]*)\" exists$")
    public void weCanFoundTheUserWithPasswordIsPhoneIsExists(String name, String password, String phone) throws Throwable {
        System.out.println(name);
        System.out.println(password);
        System.out.println(phone);
        System.out.println("=========");
    }

    @Then("^we verify following user exists$")
    public void weVerifyFollowingUserExists(DataTable dataTable) throws Throwable {
        /**
         * the result is display
         * The method of cells display:
         * [name, password, phone]
         * [xiao, 12345, 111111]
         * [catalina, 12345, 111111]
         * [Tami, 12345, 111111]
         *
         * */
        //cells()方法中是返回的this.raw；即以一行来显示
       List<List<String>> userlist=dataTable.cells();
       System.out.println("The method of cells display:");
       userlist.forEach(System.out::println);

       /**
        * dataTable调用asList方法，则结果显示如下：获取每一个值并列出来
        * The method of asList display:
        * name
        * password
        * phone
        * xiao
        * 12345
        * 111111
        * */
        List<String> accountList=dataTable.asList();
//       //调用asLists()，在源码中显示实际就是调用的cells()方法
//        List<List<String>> accountList=dataTable.asLists();
        System.out.println("The method of asList display:");
        accountList.forEach(System.out::println);

        /**
         * The result is display
         * The method of asList display:
         * {name=xiao, password=12345, phone=111111}
         * {name=catalina, password=12345, phone=111111}
         * {name=Tami, password=12345, phone=111111}
         * */
        //asMaps()方法是以key，value的格式来显示结果的
        List<Map<String,String>> accountMaps=dataTable.asMaps();
        System.out.println("The method of asMaps display:");
        accountMaps.forEach(System.out::println);
    }
}
