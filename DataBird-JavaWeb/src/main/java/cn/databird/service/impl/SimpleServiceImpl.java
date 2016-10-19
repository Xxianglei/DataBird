package cn.databird.service.impl;

import cn.databird.dao.SimpleDao;
import cn.databird.model.User;
import cn.databird.service.SimpleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 言溪 on 2016/10/19.
 */
@Service
public class SimpleServiceImpl implements SimpleService {
    private static final Logger LOGGER=Logger.getLogger(SimpleServiceImpl.class);
    @Autowired
    private SimpleDao simpleDao;
    public void SimpleTest(User user) {
        simpleDao.test(user);
    }
}
