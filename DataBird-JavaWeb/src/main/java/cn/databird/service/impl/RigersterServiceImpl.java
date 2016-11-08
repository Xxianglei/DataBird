package cn.databird.service.impl;

import cn.databird.base.BaseDao;
import cn.databird.model.User;
import cn.databird.service.RigersterService;
import cn.databird.util.CheckoutUtil;
import cn.databird.util.ConstantStr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * Created by 言溪 on 2016/10/24.
 */
@Service
public class RigersterServiceImpl implements RigersterService {

    @Autowired
    private BaseDao rigersterDao;

    public void simpleRigerster(Map<String, String[]> paras) throws Exception {

        String userName = ((String[]) (paras.get(ConstantStr.userName)))[0];
        String password = ((String[]) (paras.get(ConstantStr.password)))[0];
        String email = ((String[]) (paras.get(ConstantStr.email)))[0];

        if (!CheckoutUtil.regExpVali(userName, CheckoutUtil.regExp_accountNumber)) {

            return;
        }

        if (!CheckoutUtil.regExpVali(password, CheckoutUtil.regExp_password)) {

            return;
        }

        if (!CheckoutUtil.regExpVali(email, CheckoutUtil.regExp_email)) {

            return;
        }

        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setEmail(email);
        user.setSex(true);
        user.setRealName("databird");

        rigersterDao.save(user);
    }
}
