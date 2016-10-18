package cn.databird.dao.impl;

import cn.databird.dao.SimpleDao;
import cn.databird.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by 言溪 on 2016/10/18.
 */
@Component
public class SimpleDaoImpl implements SimpleDao {
    private static final Logger LOGGER=Logger.getLogger(SimpleDaoImpl.class);
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    @Autowired
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void test(User user) {
        hibernateTemplate.save(user);
        System.out.println("恭喜您，添加成功！");
        LOGGER.info("info");
    }
}
