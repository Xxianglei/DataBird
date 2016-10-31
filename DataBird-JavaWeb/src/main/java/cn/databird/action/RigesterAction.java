package cn.databird.action;

import cn.databird.model.User;
import cn.databird.service.RigersterService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * Created by 言溪 on 2016/10/24.
 */
@Component("rigesterAction")
@Scope("prototype")
public class RigesterAction extends ActionSupport {

    public static final Logger LOGGER = Logger.getLogger(RigesterAction.class);

    @Autowired
    private RigersterService rigersterService;

    public void isExitUserName(){
        System.out.println("用于测试代码！！");
    }

}
