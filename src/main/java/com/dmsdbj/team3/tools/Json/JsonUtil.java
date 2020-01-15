package com.dmsdbj.team3.tools.Json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;
import net.sf.json.xml.XMLSerializer;

import java.util.List;
import java.util.Map;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName JsonUtil.java
 * @Description TODO
 * @createTime 2020年01月09日 09:33:00
 */
class JsonUtil {
    //数组转string的Json
    public static String arrya2Json(Object[] objects) {
        JSONArray jsonArray = JSONArray.fromObject(objects);
        return jsonArray.toString();
    }
    //list转StringJson
    public static String list2json(List list) {
        JSONArray jsonArray = JSONArray.fromObject(list);
        return jsonArray.toString();
    }

    //map转json
    public static String map2json(Map map) {
        JSONObject jsonObject = JSONObject.fromObject(map);
        return jsonObject.toString();
    }

    //object2json
    public static String object2json(Object object) {
        JSONObject jsonObject = JSONObject.fromObject(object);
        return jsonObject.toString();
    }

    //xml
    public static String xml2json(String xml) {
        JSONArray jsonArray = (JSONArray) new XMLSerializer().read(xml);
        return jsonArray.toString();
    }

    public static JsonConfig configJson(String[] excludes) {
        JsonConfig jsonConfig =new JsonConfig();
        jsonConfig.setExcludes(excludes);
        jsonConfig.setIgnoreDefaultExcludes(true);
        jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
        return jsonConfig;
    }
}
