package cn.databird.dao;

import cn.databird.base.BaseDao;
import cn.databird.vo.UserInfo;

import java.util.List;

/**
 * Created by 言溪 on 2016/10/28.
 */
public interface LoginDao extends BaseDao {
    List<UserInfo> getUserInfo(String userName);
}
