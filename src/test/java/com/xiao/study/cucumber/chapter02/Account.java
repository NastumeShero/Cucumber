package com.xiao.study.cucumber.chapter02;


import io.cucumber.datatable.DataTableType;

public class Account  {

    private String username;

//    public Account(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
