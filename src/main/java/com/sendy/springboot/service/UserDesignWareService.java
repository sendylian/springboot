package com.sendy.springboot.service;

import com.sendy.springboot.UserDesignWare;

import java.util.List;

/**
 * @Description:11
 * @Author:lianxinjing
 * @Date:2019/3/28 10:10
 */
public interface UserDesignWareService {

    List<UserDesignWare> getAll();
    UserDesignWare getUserDesignWareById(int id);
}
