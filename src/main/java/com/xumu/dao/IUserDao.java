package com.xumu.dao;

import com.xumu.domain.User;

import java.util.List;


public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
