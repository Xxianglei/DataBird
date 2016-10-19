package cn.databird.action;

import cn.databird.model.User;
import cn.databird.service.SimpleService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by 言溪 on 2016/10/19.
 */
@Component
@Scope("prototype")
public class SimpleAction extends ActionSupport {
    private static final Logger LOGGER=Logger.getLogger(SimpleAction.class);
    @Autowired
    private SimpleService simpleServie;

    public String addUserTest(){
        User user=new User();
        user.setAddress("河南周口");
        user.setLeaveTime(new Date());
        user.setStartTime(new Date());
        user.setUserName("jieer");
        simpleServie.SimpleTest(user);
        return SUCCESS;

    }
}

