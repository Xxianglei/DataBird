package cn.databird.action;

import cn.databird.service.RigersterService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Created by 言溪 on 2016/10/24.
 */
@Component("rigesterAction")
@Scope("prototype")
public class RigesterAction extends ActionSupport {

    public static final Logger LOGGER = Logger.getLogger(RigesterAction.class);

    private HttpServletRequest req = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);

    @Autowired
    private RigersterService rigersterService;

    public void isExitUserName() {
        System.out.println("用于测试代码！！");
    }

    public void simpleRigester() {

        Map<String, String[]> paras = req.getParameterMap();

        try {

            rigersterService.simpleRigerster(paras);
        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
