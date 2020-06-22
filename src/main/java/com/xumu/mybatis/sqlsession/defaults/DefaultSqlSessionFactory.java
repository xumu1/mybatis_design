package com.xumu.mybatis.sqlsession.defaults;

import com.xumu.mybatis.cfg.Configuration;
import com.xumu.mybatis.sqlsession.SqlSession;
import com.xumu.mybatis.sqlsession.SqlSessionFactory;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
