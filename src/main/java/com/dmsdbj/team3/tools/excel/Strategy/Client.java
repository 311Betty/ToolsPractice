package com.dmsdbj.team3.tools.excel.Strategy;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2020年01月13日 19:12:00
 */
public class Client {
    public static void main(String[] args) {
        Context context;
        context = new Context(new CSA());
        context.contextInterface();
        context = new Context(new CSB());
        context.contextInterface();
        context = new Context(new CSC());
        context.contextInterface();

    }
}
