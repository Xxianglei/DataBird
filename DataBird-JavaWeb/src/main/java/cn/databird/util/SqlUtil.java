package cn.databird.util;


import cn.databird.vo.UserInfo;

import java.util.Date;

/**
 * Created by 言溪 on 2016/10/30.
 */
public class SqlUtil {
    public static String loginByUserNameAndPassword(String userName, String password) {
        String sql = "SELECT userName FROM User WHERE userName='" + userName + "' AND password ='" + password + "'";
        return sql;
    }

    public static String loginByEmailAndPassword(String email, String password) {
        String sql = "SELECT userName FROM User WHERE email='" + email + "' AND password='" + password + "'";
        return sql;
    }
    public static String getAllUserInfo(String userName){
        String sql="SELECT new cn.databird.vo.UserInfo(realName,sex,email,phoneNum,nativePlace,workPlace,workCompany," +
                "studyDir,avator,grade,birthday,lab)" +
                "FROM User  WHERE userName='"+userName+"'";
        return sql ;

    }


}
