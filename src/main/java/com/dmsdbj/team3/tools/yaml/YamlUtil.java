package com.dmsdbj.team3.tools.yaml;

import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;
import java.util.Properties;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName YamlUtil.java
 * @Description TODO
 * @createTime 2020年01月07日 10:54:00
 */
public class YamlUtil {
    public static Map<String,Object> yaml2Map(String yamlSource){
        YamlMapFactoryBean bean = new YamlMapFactoryBean();
        bean.setResources(new ClassPathResource(yamlSource));
        return bean.getObject();
    }


    public static Properties yaml2Properties(String yamlSource) {
        YamlPropertiesFactoryBean bean = new YamlPropertiesFactoryBean();
        bean.setResources(new ClassPathResource(yamlSource));
        return bean.getObject();
    }
}
