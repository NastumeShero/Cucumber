package com.xiao.study.cucumber.chapter03;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//指定运行的测试框架
@RunWith(Cucumber.class)
//@CucumberOptions则是指定对应的feature文件所在的位置
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-report.json",},
        monochrome = true,
        snippets = SnippetType.CAMELCASE)

public class Chapter03Runner {
}
