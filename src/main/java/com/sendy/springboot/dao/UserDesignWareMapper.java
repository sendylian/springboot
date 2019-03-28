package com.sendy.springboot.dao;

import com.sendy.springboot.UserDesignWare;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDesignWareMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserDesignWare record);

    int insertSelective(UserDesignWare record);

    UserDesignWare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserDesignWare record);

    int updateByPrimaryKey(UserDesignWare record);

    List<UserDesignWare> getAll();

    UserDesignWare getUserDesignWareById(int id);
}