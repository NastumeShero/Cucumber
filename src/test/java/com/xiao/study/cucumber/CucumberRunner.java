package com.xiao.study.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//指定运行的测试框架
@RunWith(Cucumber.class)
//@CucumberOptions则是指定对应的feature文件所在的位置
@CucumberOptions(
        plugin = {"pretty",
        "json:target/cucumber-report.json",
        "html:target/Cucumber",
        "junit:target/cucumber_junit.xml"},
        features = {
                "classpath:com/xiao/study/cucumber/chapter03/",
                "classpath:com/xiao/study/cucumber/chapter02/",
                "src/test/resource/com/xiao/study/cucumber/chapter01",
                "src/test/resource/com/xiao/study/cucumber/quickstart",

        },
        glue = {
                "com.xiao.study.cucumber.chapter03",
                "/com/xiao/study/cucumber/chapter02",
                "com/xiao/study/cucumber/chapter01",
                "com.xiao.study.cucumber.quickstart"
        },

        monochrome = false,
        snippets = SnippetType.CAMELCASE)

public class CucumberRunner {
}
