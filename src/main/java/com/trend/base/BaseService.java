package com.trend.base;

import java.util.List;

/**
 * 基础Service接口
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/18
 */
public interface BaseService<T> {
    int deleteByPrimaryKey(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T t);

    int updateByPrimaryKey(T t);

    List<T> selectListByPage();

}
