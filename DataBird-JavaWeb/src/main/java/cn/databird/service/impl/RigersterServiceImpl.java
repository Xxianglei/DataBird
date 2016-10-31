package cn.databird.service.impl;

import cn.databird.dao.RigersterDao;
import cn.databird.service.RigersterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by 言溪 on 2016/10/24.
 */
@Service
public class RigersterServiceImpl implements RigersterService {
    @Autowired
    private RigersterDao rigersterDao;

}
