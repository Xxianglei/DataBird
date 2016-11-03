package cn.databird.service.impl;

import cn.databird.dao.LoginDao;
import cn.databird.service.LoginService;
import cn.databird.util.*;
import cn.databird.vo.UserInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 言溪 on 2016/10/27.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    /**
     * @param map
     * @return String
     * @throws Exception
     */
    public String login(Map<String, String> map) throws Exception{
        List<String> lists;
        String userName = map.get(ConstantStr.userName).trim();
        String password = map.get(ConstantStr.password).trim();
        /**
         * 校验字段合法性
         */
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            return ConstantStr.str_one_hundred;
        }
        if (password.length() < 6) {
            return ConstantStr.str_one_hundred_one;
        }

        password = Base64Util.decodeBase64String(password);
        /**
         * 判断是否email登录还是
         */
        if (CheckoutUtil.regExpVali(userName, CheckoutUtil.regExp_email)) {
            lists = loginDao.findAll(SqlUtil.loginByEmailAndPassword(userName, password));
        } else
            lists = loginDao.findAll(SqlUtil.loginByUserNameAndPassword(userName, password));

        if (lists.isEmpty()) {
            return ConstantStr.str_two_hundred;
        } else {
            return ConstantStr.str_two_hundred_one;
        }
    }

    /**
     *
     * @param userName
     * @return map
     */
    public Map<String, Object> getAllUserInfo(String userName) {
        List<UserInfo> userInfos=loginDao.findAll(SqlUtil.getAllUserInfo(userName));
        Map<String,Object> map =new HashMap<String, Object>();
        /**
         * userInfos==null 说明系统异常
         * userInfos isEmpty 说明查询类容为空
         */
        if(userInfos!=null&&!userInfos.isEmpty()){
            for(UserInfo userInfo:userInfos){
                System.out.println(userInfo.toString());
                map.put("message",ConstantStr.str_two_hundred_one);
                map.put("userName",userName);
                map.put("userInfo",userInfo);
            }
        }else if(userInfos.isEmpty()) {
            map.put("message",ConstantStr.str_two_hundred_two);
        }else {
            map.put("message",ConstantStr.str_five_hundred);
        }
        return map;
    }
}



















