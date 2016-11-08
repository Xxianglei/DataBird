package cn.databird.controller;

import cn.databird.service.LoginService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by 言溪 on 2016/11/6.
 */
@Controller
public class LoginController {
    private static final Logger logger=Logger.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/test")
    public String  login(){
       return "login";
    }


}

