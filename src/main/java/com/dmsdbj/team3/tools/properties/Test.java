package com.dmsdbj.team3.tools.properties;

import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.util.Properties;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月07日 15:17:00
 */
class Test {

    public static void main(String[] args) {
        String path = "test.properties";
        String key = "username";
        String defaultValue = "password";
        String result=PropertyUtil.getProperty(path,key,defaultValue);
        String result1=PropertyUtil.getProperty(path,key);
        System.out.println(result);
        System.out.println(result1);
    }
}
