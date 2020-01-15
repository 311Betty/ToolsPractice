package com.dmsdbj.team3.tools.xml;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName XMLUtil.java
 * @Description TODO
 * @createTime 2020年01月07日 17:14:00
 */
class XMLUtil {
    public static Object getBean(String path, String tagName) {
        try {
            DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = builderFactory.newDocumentBuilder();
            Document document = builder.parse(new File(path));
            String firstChild = document.getElementsByTagName(tagName).item(0).getFirstChild().getNodeValue();
            Class aClass = Class.forName(firstChild);
            Object o = aClass.newInstance();
            return o;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
