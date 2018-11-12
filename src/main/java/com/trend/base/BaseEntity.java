package com.trend.base;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.lang.reflect.Field;
import java.util.Date;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/18
 */
public abstract class BaseEntity {
    /**
     * 把子类对象封装成json数据返回
     * @return 子类对象json字符串数据
     * @throws IllegalAccessException
     */
    public String toJson(){
        JSONObject result = new JSONObject();
        try {
            if(this != null){
                //获取数据字段
                Field[] fields = this.getClass().getDeclaredFields();
                for (Field field : fields) {
                    //设置私有字段可访问
                    field.setAccessible(true);
                    result.put(field.getName(),field.get(this));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //返回转换成json数据
        return result.toString();
    }
}
