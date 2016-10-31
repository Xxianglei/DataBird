package cn.databird.dao.impl;

import cn.databird.base.BaseDaoImpl;
import cn.databird.dao.RigersterDao;
import cn.databird.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 言溪 on 2016/10/24.
 */
@Component
public class RigersterDaoImpl extends BaseDaoImpl implements RigersterDao  {
    @Autowired
    private HibernateTemplate hibernateTemplate;


}
