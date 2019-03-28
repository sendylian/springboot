package com.sendy.springboot.service.impl;

import com.sendy.springboot.UserDesignWare;
import com.sendy.springboot.dao.UserDesignWareMapper;
import com.sendy.springboot.service.UserDesignWareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author:lianxinjing
 * @Date:2019/3/28 10:11
 */

@Service(value = "userDesignWareService")
public class UserDesignWareServiceImpl implements UserDesignWareService {

    @Resource
    private UserDesignWareMapper userDesignWareMapper ;

    @Override
    public UserDesignWare getUserDesignWareById(int id) {
        return userDesignWareMapper.getUserDesignWareById(id);
    }

    @Override
    public List<UserDesignWare> getAll() {
        return userDesignWareMapper.getAll();


    }
}
