package com.dmsdbj.team3.tools.xml;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月07日 17:14:00
 */
public class Test {
    public static void main(String[] args) {
        String path = "src/main/resources/test.xml";
        String tagName = "className";
        Object bean = XMLUtil.getBean(path, tagName);
        System.out.println(bean.getClass().getPackage());

    }
}
