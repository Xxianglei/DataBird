package cn.databird.dao;

import cn.databird.base.BaseDao;
import cn.databird.model.User;

/**
 * Created by 言溪 on 2016/10/24.
 */
public interface RigersterDao extends BaseDao {

    void simpleRigerster(User user) throws Exception;
}
