package com.trend.base;

import com.github.pagehelper.PageHelper;
import com.trend.constants.PagePrefixEnum;
import com.trend.factory.ResponseParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基础controller类
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/11/11
 */
@Slf4j
public abstract class BaseController<T> {

    private String genericObjShortName;

    /**
     * 获取基础的服务
     * @return BaseService
     */
    protected abstract BaseService<T> getBaseService();

    public BaseController() {
        try {
            ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
            Type[] generics = type.getActualTypeArguments();
            String typeName = generics[0].getTypeName();
            genericObjShortName = typeName.substring(typeName.lastIndexOf(".")+1,typeName.length());
            //把获取到的类名首个字母转换成小写
            char[] chars = genericObjShortName.toCharArray();
            chars[0] += 32;
            genericObjShortName = String.valueOf(chars);
        } catch (Exception e) {
            log.error("获取BaseController泛型对象{}出错",this.getClass(),e);
        }
    }


    @GetMapping("/initList")
    protected String initList(){
        return this.genericObjShortName+ PagePrefixEnum.LIST.getValue();
    }

    @RequestMapping("/list")
    @ResponseBody
    protected ResponseParam list(HttpServletRequest request){
        Map<String, Object> param = getParam(request);
        for (Map.Entry<String, Object> entry : param.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
        PageHelper.startPage(1,20);

        List<T> list = getBaseService().selectListByPage();
        return ResponseParam.SUCCESS().addData("list",list);
    }

    /**
     * 把浏览器参数转化放到Map集合中
     * @param request
     * @return
     */
    protected Map<String, Object> getParam(HttpServletRequest request) {
        Map<String, Object> paramMap = new HashMap<>();
        String method = request.getMethod();
        Enumeration<?> keys = request.getParameterNames();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            if(key!=null){
                if (key instanceof String) {
                    String value = request.getParameter(key.toString());
                    //前台encodeURIComponent('我们');转码后到后台还是ISO-8859-1，所以还需要转码
                    if("GET".equals(method)){
                        try {
                            value =new String(value.getBytes("ISO-8859-1"),"UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                    paramMap.put(key.toString(), value);
                }
            }
        }
        return paramMap;
    }

}
