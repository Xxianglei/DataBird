package cn.databird.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by brainy on 16-11-1.
 */
public class CheckoutUtil {

    /**
     * 常用正则表达式：匹配email地址
     */
    public final static String regExp_email = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";

    /**
     * 常用正则表达式：匹配帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
     */
    public final static String regExp_accountNumber = "^[a-zA-Z][a-zA-Z0-9_]{4,16}$";

    /**
     * 常用正则表达式：匹配密码是否合法(必修有 字母，数字，符号，三者其二,6-16位)
     */
    public final static String regExp_password = "[^\\s]{6,16}$";

    /**
     * 验证字符串是否匹配指定正则表达式
     *
     * @param content 目标字符串
     * @param regExp  正则
     * @return boolean
     */
    public static boolean regExpVali(String content, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }
}
