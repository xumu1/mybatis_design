package com.xumu.mybatis.sqlsession.defaults;

import com.xumu.mybatis.cfg.Configuration;
import com.xumu.mybatis.sqlsession.SqlSession;
import com.xumu.mybatis.sqlsession.proxy.MapperProxy;
import com.xumu.mybatis.utils.DataSourceUtil;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * @author xumu
 */
@Data
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;
    private Connection connection;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
        this.connection = DataSourceUtil.getConnection(configuration);
    }

    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T)Proxy.newProxyInstance(
                daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},
                new MapperProxy(configuration.getMappers(),connection));
    }

    public void close() {
        if(connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
