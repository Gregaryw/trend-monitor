package com.trend.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/18
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
