package com.sendy.springboot;

import com.sendy.springboot.service.UserDesignWareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Description:hehe
 * @Author:lianxinjing
 * @Date:2019/3/26 18:04
 */
@Controller
@RequestMapping(value = "/user")
public class HelloController {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
        return "hehe";
    }

    @Autowired
    private UserDesignWareService userDesignWareService;


    @RequestMapping("/getAll")
    @ResponseBody
    private List<UserDesignWare> getAllUser() {
        List<UserDesignWare> users =  userDesignWareService.getAll();
        return users;

    }


    @RequestMapping("/getUserDesignWareById")
    @ResponseBody
    private UserDesignWare getUserDesignWareById() {
        UserDesignWare users =  userDesignWareService.getUserDesignWareById(82);
        return users;

    }

    //跳转到index.ftl页面
    @RequestMapping(value = "index")
    public String index(ModelMap map){
        map.addAttribute("resource","hehe");
        return "index";
    }
    //haha
}
