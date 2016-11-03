package cn.databird.service;

import java.util.Map;

/**
 * Created by 言溪 on 2016/10/27.
 */
public interface LoginService {
    String login(Map<String, String> map) throws Exception;
    Map<String, Object> getAllUserInfo(String userName);

}
