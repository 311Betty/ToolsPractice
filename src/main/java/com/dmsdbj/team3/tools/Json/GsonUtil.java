package com.dmsdbj.team3.tools.Json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * @author 白靖
 * @version 1.0.0
 * @ClassName GsonUtil.java
 * @Description TODO
 * @createTime 2020年01月09日 09:33:00
 */
class GsonUtil {
    private static Gson gson = null;
    static{
        if (gson == null) {
            gson=new Gson();
        }
    }
    private GsonUtil(){}

    public static String gsonString(Object object) {
        String  gsonString =null;
        if (gson == null) {
            gsonString=gson.toJson(object);
        }
        return gsonString;
    }


    public static <T> T gsonToBean(String gsonString, Class<T> cls) {
        T t=null;
        if (gson == null) {
            t = gson.fromJson(gsonString, cls);
        }
        return t;
    }

    public static <T> List<T> gsonToList(String gsonString, Class<T> cls) {
        List<T>list=null;
        if (gson == null) {
            list = gson.fromJson(gsonString, new TypeToken<List<T>>() {
            }.getType());
        }
        return list;
    }
}
