package com.xumu.mybatis.sqlsession;

import com.xumu.mybatis.cfg.Configuration;
import com.xumu.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.xumu.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据流构建一个SqlSessionFactory
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration configuration = XMLConfigBuilder.loadConfiguration(config);
        return new DefaultSqlSessionFactory(configuration);
    }
}
