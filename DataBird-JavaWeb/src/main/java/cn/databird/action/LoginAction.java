package cn.databird.action;

import cn.databird.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsStatics;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Created by 言溪 on 2016/10/27.
 */
@Component("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {

    private  static final Logger LOGGER=Logger.getLogger(LoginAction.class);

   @Autowired
   private LoginService loginService;

    HttpServletRequest req = (HttpServletRequest)ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);


}
