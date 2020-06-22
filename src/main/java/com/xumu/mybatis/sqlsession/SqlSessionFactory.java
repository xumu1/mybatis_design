package com.xumu.mybatis.sqlsession;

import com.xumu.mybatis.cfg.Configuration;

public interface SqlSessionFactory {

    SqlSession openSession();
}
