package com.dmsdbj.team3.tools.yaml;

import java.util.Map;
import java.util.Properties;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月07日 10:53:00
 */
public class Test {
    public static void main(String[] args) {
        String path = "test.yml";
        Map<String, Object> map = YamlUtil.yaml2Map(path);
        System.out.println(map);
        Properties properties = YamlUtil.yaml2Properties(path);
        System.out.println(properties);

    }
}
