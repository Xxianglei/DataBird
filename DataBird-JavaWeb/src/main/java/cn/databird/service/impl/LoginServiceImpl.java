package cn.databird.service.impl;

import cn.databird.dao.LoginDao;
import cn.databird.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 言溪 on 2016/10/27.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

}
