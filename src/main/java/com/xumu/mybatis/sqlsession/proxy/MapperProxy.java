package com.xumu.mybatis.sqlsession.proxy;

import com.xumu.mybatis.cfg.Configuration;
import com.xumu.mybatis.cfg.Mapper;
import com.xumu.mybatis.utils.Executor;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * 用于增强被代理对象，也就是调用selectList方法
 */
@Data
@AllArgsConstructor
public class MapperProxy implements InvocationHandler {

    // mappers的key是全限定类名+方法名
    private Map<String, Mapper> mappers;
    // 数据库连接对象
    private Connection connection;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 获取方法名
        String methodName = method.getName();
        // 获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        // 组合成key
        String key = className + "." + methodName;
        // 获取mapper
        Mapper mapper = mappers.get(key);
        if(mapper == null){
            throw new IllegalArgumentException("传入参数有误");
        }
        // 调用工具类查询所有

        return new Executor().selectList(mapper,connection);
    }
}
