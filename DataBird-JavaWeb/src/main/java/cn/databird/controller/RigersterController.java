package cn.databird.controller;

import cn.databird.service.RigersterService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 言溪 on 2016/11/8.
 */
@Controller
public class RigersterController {
    private Logger logger=Logger.getLogger(RigersterController.class);
    @Autowired
    private RigersterService rigersterService;
    @RequestMapping(value = "/rigerster")
    public String rigerster(){
        return null;
    }
}
