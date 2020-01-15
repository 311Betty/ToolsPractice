package com.dmsdbj.team3.tools.excel.Strategy;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Context.java
 * @Description TODO
 * @createTime 2020年01月13日 19:12:00
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.althm();
    }



}
