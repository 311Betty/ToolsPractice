package com.dmsdbj.team3.tools.word;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.Map;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName WordUtil.java
 * @Description TODO
 * @createTime 2020年01月09日 16:35:00
 */
public class WordUtil {
    private static WordUtil wordUtil = null;

    private WordUtil() {
    }

    public static WordUtil getInstance() {

        if (wordUtil == null) {
            synchronized (WordUtil.class) {
                if (wordUtil == null) {
                    wordUtil = new WordUtil();
                }
            }

        }
        return wordUtil;
    }

    public File createDocFile(String templateFilePath, Map<String, Object> dataMap, String exportFilePath, int loadType) {
        Template t = null;
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_28);
        configuration.setDefaultEncoding("utf-8");
        try {
            templateFilePath = pathReplace(templateFilePath);
            String ftlPath = templateFilePath.substring(0, templateFilePath.lastIndexOf("/"));
            if (loadType == 1) {
                configuration.setDirectoryForTemplateLoading(new File(ftlPath));
            } else {
                configuration.setClassForTemplateLoading(this.getClass(), ftlPath);
            }
            String ftlFile = templateFilePath.substring(templateFilePath.lastIndexOf("/") + 1);
            t = configuration.getTemplate(ftlFile,"utf-8");

            File outFile = new File(exportFilePath);
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)));
            t.process(dataMap, out);
        } catch (Exception e) {
            System.out.println("导出word文档出错");
            e.printStackTrace();
        }

        return null;
    }
       //把\替换成/
      private String pathReplace(String path) {
        while (path != null && path.contains("\\")) {
            path = path.replace("\\", "/");
        }
        return path;
    }
}
