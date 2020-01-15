package com.dmsdbj.team3.tools.word;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年01月09日 16:57:00
 */
public class Test {
    public static void main(String[] args) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put("username","张三");
        dataMap.put("sex","男");
        String templateFile = "/Users/Betty/Desktop/template.ftl";
        String exportFile = "/Users/Betty/Desktop/test.doc";
        WordUtil.getInstance().createDocFile(templateFile,dataMap,exportFile,1);
    }
}
