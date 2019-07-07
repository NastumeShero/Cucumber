package com.xiao.study.cucumber.chapter01;

public class Calculator {

    private final int x;
    private final int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int add() {
        return x + y;
    }

    public int subtraction() {
        return x - y;
    }
}
