package com.xumu.mybatis.utils;

import com.xumu.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 创建数据源
 */
public class DataSourceUtil {

    public static Connection getConnection(Configuration configuration){
        try {
            Class.forName(configuration.getDriver());
            return DriverManager.getConnection(configuration.getUrl(), configuration.getUsername(), configuration.getPassword());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
