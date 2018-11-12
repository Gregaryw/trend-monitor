package com.sephome.base;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.BaseMapper;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 基础Service实现类
 * @author HarlanWang
 * @version v.0.0.1
 * @date 2018/9/18
 */
@Slf4j
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {
    private Class<T> clazz;

    /**
     * 通过反射技术获取接口泛型实例字节
     */
    public BaseServiceImpl() {
        ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
        Type[] generics = type.getActualTypeArguments();
        clazz = (Class<T>) (generics[0]);
    }

    @Autowired
    protected BaseMapper<T> baseMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    @Override
    public T selectByPrimaryKey(Integer id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public List<T> selectListByPage() {
        return baseMapper.selectAll();
    }
}
