package cn.databird.action;

import cn.databird.service.LoginService;
import cn.databird.util.ConstantStr;
import cn.databird.util.JsonToolUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.StrutsStatics;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * Created by 言溪 on 2016/10/27.
 */
@Component("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {

    private static final Logger LOGGER = Logger.getLogger(LoginAction.class);

    static final HttpServletRequest req = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
    static final HttpServletResponse res = (HttpServletResponse) ActionContext.getContext().get(StrutsStatics.HTTP_RESPONSE);
    @Autowired
    private LoginService loginService;

    private JSONObject jsonObject;
    InputStream inputStream;

    /**
     * login
     * 登录
     */
    public void login2() throws IOException {
        inputStream = req.getInputStream();
        String message = IOUtils.toString(inputStream, "UTF-8");
        Map<String, String> map = JsonToolUtil.getFromJsonObjectToMap(message);
        try {
            String result = loginService.login(map);
            jsonObject = new JSONObject();
            jsonObject.put("status", ConstantStr.str_two_hundred);
            jsonObject.put("result", result);
        } catch (Exception e) {
            jsonObject.put("status", ConstantStr.str_five_hundred);
            jsonObject.put("result", ConstantStr.str_zero);
        }

        res.getWriter().write(jsonObject.toString());
    }

    /**
     * getAllUserInfo
     * 得到用户所有信息
     */
    public void getAllUserInfo() throws IOException{
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/json;charset=UTF-8");
        try {
            String userName=req.getParameter("userName");
            Map<String, Object> map1=loginService.getAllUserInfo(userName);
            jsonObject.put("status",ConstantStr.str_two_hundred);
            jsonObject.put("result",map1);
            System.out.println(jsonObject.toString());

        }catch (Exception e){
            jsonObject.put("status",ConstantStr.str_five_hundred);
        }
        res.getWriter().write(jsonObject.toString());
    }



}
