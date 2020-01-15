package com.dmsdbj.team3.tools.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName PropertyUtil.java
 * @Description TODO
 * @createTime 2020年01月07日 15:17:00
 */
class PropertyUtil {
    private static Properties properties;

    synchronized static private void loadProps(String path) {
        System.out.println("开始加载properties文件内容。。。。");

        properties = new Properties();
        InputStream inputStream=null;
        try {
            inputStream = PropertyUtil.class.getClassLoader().getResourceAsStream(path);
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("properties文件未找到");
        }finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("jdbc.properties文件流关闭出现异常");
                }
            }
        }
        System.out.println("加载properties文件内容完成");
        System.out.println("properties文件内容：" + properties);
    }

    public static String getProperty(String path, String key) {
        if (properties == null) {
            loadProps(path);
        }
        return properties.getProperty(key);
    }

    public static String getProperty(String path, String key, String defaultValue) {
        if (properties == null) {
            loadProps(path);
        }
        return properties.getProperty(key, defaultValue);
    }


}
