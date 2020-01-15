package com.dmsdbj.team3.tools.Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import lombok.Data;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName JacksonUtil.java
 * @Description TODO
 * @createTime 2020年01月09日 09:33:00
 */
public class JacksonUtil {
    //Product
    @Test
    public void test1() {
        Product p = new Product();
        p.setId(1);
        p.setName("电视");
        p.setPrice(2000);
        p.setReleaseDate(new Date());
        ObjectMapper mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        String json=null;
        try {
            json = mapper.writeValueAsString(p);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }

    //List<Product>json
    @Test
    public void test2() {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("电视");
        p1.setPrice(2000);

        Product p2 = new Product();
        p1.setId(2);
        p1.setName("冰箱");
        p1.setPrice(3000);

        List<Product> ps = new ArrayList<>();
        ps.add(p1);
        ps.add(p2);

        ObjectMapper mapper = new ObjectMapper();

        //过滤
        FilterProvider fp = new SimpleFilterProvider().addFilter("productFilter", SimpleBeanPropertyFilter.serializeAllExcept("id","name"));
        String json=null;
        try {
            json = mapper.writeValueAsString(ps);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(json);
    }
    @Data
    private class Product {
        private int id;
        private String name;
        private double price;
        private Date releaseDate;
    }
}
