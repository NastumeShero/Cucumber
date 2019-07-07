package com.xiao.study.cucumber.chapter02;

import io.cucumber.datatable.TableRowTransformer;

import java.util.List;

public class AccoutTransformer implements TableRowTransformer<Account> {

    Account account;

    @Override
    public Account transform(List<String> list) throws Throwable {

        return null;
    }
}
