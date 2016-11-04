package cn.databird.dao.impl;

import cn.databird.base.BaseDaoImpl;
import cn.databird.dao.LoginDao;
import cn.databird.util.SqlUtil;
import cn.databird.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 言溪 on 2016/10/28.
 */
@Component
public class LoginDaoImpl extends BaseDaoImpl implements LoginDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<UserInfo> getUserInfo(String userName) {
        List<UserInfo> list=(List<UserInfo>) hibernateTemplate.find(SqlUtil.getAllUserInfo(userName));
        for(UserInfo userInfo:list){
            userInfo.getRealName();
        }
        return list;
    }
}
