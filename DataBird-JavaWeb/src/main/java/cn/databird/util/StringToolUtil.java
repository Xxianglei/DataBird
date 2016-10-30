package cn.databird.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 言溪 on 2016/10/21.
 */
public class StringToolUtil extends StringUtils {
    private static Logger log = Logger.getLogger(StringToolUtil.class);

    /**
     * 常用正则表达式：匹配非负整数（正整数 + 0）
     */
    public final static String regExp_integer_1 = "^\\d+$";

    /**
     * 常用正则表达式：匹配正整数
     */
    public final static String regExp_integer_2 = "^[0-9]*[1-9][0-9]*$";

    /**
     * 常用正则表达式：匹配非正整数（负整数  + 0）
     */
    public final static String regExp_integer_3 = "^((-\\d+) ?(0+))$";

    /**
     * 常用正则表达式：匹配负整数
     */
    public final static String regExp_integer_4 = "^-[0-9]*[1-9][0-9]*$";

    /**
     * 常用正则表达式：匹配整数
     */
    public final static String regExp_integer_5 = "^-?\\d+$";

    /**
     * 常用正则表达式：匹配非负浮点数（正浮点数 + 0）
     */
    public final static String regExp_float_1 = "^\\d+(\\.\\d+)?$";

    /**
     * 常用正则表达式：匹配正浮点数
     */
    public final static String regExp_float_2 = "^(([0-9]+\\.[0-9]*[1-9][0-9]*) ?([0-9]*[1-9][0-9]*\\.[0-9]+) ?([0-9]*[1-9][0-9]*))$";

    /**
     * 常用正则表达式：匹配非正浮点数（负浮点数 + 0）
     */
    public final static String regExp_float_3 = "^((-\\d+(\\.\\d+)?) ?(0+(\\.0+)?))$";

    /**
     * 常用正则表达式：匹配负浮点数
     */
    public final static String regExp_float_4 = "^(-(([0-9]+\\.[0-9]*[1-9][0-9]*) ?([0-9]*[1-9][0-9]*\\.[0-9]+) ?([0-9]*[1-9][0-9]*)))$";

    /**
     * 常用正则表达式：匹配浮点数
     */
    public final static String regExp_float_5 = "^(-?\\d+)(\\.\\d+)?$";

    /**
     * 常用正则表达式：匹配由26个英文字母组成的字符串
     */
    public final static String regExp_letter_1 = "^[A-Za-z]+$";

    /**
     * 常用正则表达式：匹配由26个英文字母的大写组成的字符串
     */
    public final static String regExp_letter_2 = "^[A-Z]+$";

    /**
     * 常用正则表达式：匹配由26个英文字母的小写组成的字符串
     */
    public final static String regExp_letter_3 = "^[a-z]+$";

    /**
     * 常用正则表达式：匹配由数字和26个英文字母组成的字符串
     */
    public final static String regExp_letter_4 = "^[A-Za-z0-9]+$";

    /**
     * 常用正则表达式：匹配由数字、26个英文字母或者下划线组成的字符串
     */
    public final static String regExp_letter_5 = "^\\w+$";

    /**
     * 常用正则表达式：匹配email地址
     */
    public final static String regExp_email = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";

    /**
     * 常用正则表达式：匹配url
     */
    public final static String regExp_url_1 = "^[a-zA-z]+://(\\w+(-\\w+)*)(\\.(\\w+(-\\w+)*))*(\\?\\S*)?$";

    /**
     * 常用正则表达式：匹配url
     */
    public final static String regExp_url_2 = "[a-zA-z]+://[^\\s]*";

    /**
     * 常用正则表达式：匹配中文字符
     */
    public final static String regExp_chinese_1 = "[\\u4e00-\\u9fa5]";

    /**
     * 常用正则表达式：匹配双字节字符(包括汉字在内)
     */
    public final static String regExp_chinese_2 = "[^\\x00-\\xff]";

    /**
     * 常用正则表达式：匹配空行
     */
    public final static String regExp_line = "\\n[\\s ? ]*\\r";

    /**
     * 常用正则表达式：匹配HTML标记
     */
    public final static String regExp_html_1 = "/ <(.*)>.* <\\/\\1> ? <(.*) \\/>/";

    /**
     * 常用正则表达式：匹配首尾空格
     */
    public final static String regExp_startEndEmpty = "(^\\s*) ?(\\s*$)";

    /**
     * 常用正则表达式：匹配帐号是否合法(字母开头，允许5-16字节，允许字母数字下划线)
     */
    public final static String regExp_accountNumber = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";

    /**
     * 常用正则表达式：匹配国内电话号码，匹配形式如 0511-4405222 或 021-87888822
     */
    public final static String regExp_telephone = "\\d{3}-\\d{8} ?\\d{4}-\\d{7}";

    /**
     * 常用正则表达式：腾讯QQ号, 腾讯QQ号从10000开始
     */
    public final static String regExp_qq = "[1-9][0-9]{4,}";

    /**
     * 常用正则表达式：匹配中国邮政编码
     */
    public final static String regExp_postbody = "[1-9]\\d{5}(?!\\d)";

    /**
     * 常用正则表达式：匹配身份证, 中国的身份证为15位或18位
     */
    public final static String regExp_idCard = "\\d{15} ?\\d{18}";

    /**
     * 常用正则表达式：IP
     */
    public final static String regExp_ip = "\\d+\\.\\d+\\.\\d+\\.\\d+";

    /**
     * 字符编码
     */

   // public final static String encoding = BaseConfig.configProp.get(ConstantInit.config_encoding);

    /**
     * 验证字符串是否匹配指定正则表达式
     *
     * @param content 目标字符串
     * @param regExp 正则
     * @return boolean
     */
    public static boolean regExpVali(String content, String regExp) {
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        return matcher.matches();
    }

    /**
     * double精度调整
     *
     * @param doubleValue 需要调整的值123.454
     * @param format      目标样式".##"
     * @return String
     */
    public static String decimalFormat(double doubleValue, String format) {
        DecimalFormat myFormatter = new DecimalFormat(format);
        return myFormatter.format(doubleValue);
    }

//    /**
//     * Url Base64编码
//     *
//     * @param data 待编码数据
//     * @return String 编码数据
//     * @throws Exception
//     */
//    public static String encode(String data) throws Exception {
//        // 执行编码
//        byte[] b = Base64.encodeBase64URLSafe(data.getBytes(encoding));
//        return new String(b, encoding);
//    }

    /**
     * Url Base64解码
     *
     * @param data 待解码数据
     * @return String 解码数据
     * @throws Exception
     */
//    public static String decode(String data) throws Exception {
//        // 执行解码
//        byte[] b = Base64.decodeBase64(data.getBytes(encoding));
//        return new String(b, encoding);
//    }

    /**
     * URL编码（utf-8）
     *
     * @param source 目标字符串
     * @return String
     */
//    public static String urlEncode(String source) {
//        String result = source;
//        try {
//            result = java.net.URLEncoder.encode(source, encoding);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        return result;
//    }

    /**
     * 根据内容类型判断文件扩展名
     *
     * @param contentType 内容类型
     * @return String
     */
    public static String getFileExt(String contentType) {
        String fileExt = "";
        if ("image/jpeg".equals(contentType)) {
            fileExt = ".jpg";

        } else if ("audio/mpeg".equals(contentType)) {
            fileExt = ".mp3";

        } else if ("audio/amr".equals(contentType)) {
            fileExt = ".amr";

        } else if ("video/mp4".equals(contentType)) {
            fileExt = ".mp4";

        } else if ("video/mpeg4".equals(contentType)) {
            fileExt = ".mp4";
        }

        return fileExt;
    }

    /**
     * 获取bean名称
     *
     * @param bean 目标bean
     * @return String
     */
    public static String beanName(Object bean) {
        String fullClassName = bean.getClass().getName();
        String classNameTemp = fullClassName.substring(fullClassName.lastIndexOf(".") + 1, fullClassName.length());
        return classNameTemp.substring(0, 1) + classNameTemp.substring(1);
    }

    public final static Pattern referer_pattern = Pattern.compile("@([^@^\\s^:]{1,})([\\s\\:\\,\\;]{0,1})");//@.+?[\\s:]

    /**
     * 首字母转小写
     *
     * @param s 目标字符串
     * @return String
     */
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

    /**
     * 首字母转大写
     *
     * @param s 目标字符串
     * @return String
     */
    public static String toUpperCaseFirstOne(String s) {
        if (Character.isUpperCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

    /**
     * 验证是否是手机号
     * @param queryString 需要验证的字符串
     * @return Boolean
     */
    public static boolean isPhoneNumber(String queryString) {
        return (queryString.length() == 11 && hasDigital(queryString) == 11);
    }

    /**
     * 隐藏部分字符
     * @param src 源字符串
     * @param target 目标字符串
     * @param start 起始编号
     * @param len 目标长度
     * @return String
     */
    public static String hideMiddleChars(String src, char target, int start, int len){
        if (src == null || start > src.length())
            return src;

        try {
            int end = start + len - 1;
            if(end > src.length())
                end = src.length();
            StringBuilder builder = new StringBuilder(src);
            for(int i = start - 1; i < end; i++)
                builder.setCharAt(i, target);
            return builder.toString();
        }
        catch (Exception e) {
            e.printStackTrace();
            return src;
        }
    }

    private static int hasDigital(String queryString) {
        int count = 0;
        String regEx = "[0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(queryString);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                count++;
            }
        }
        return count;
    }

    /**
     * 字符串转换为字节数组
     * @param str  字符串
     * @return byte[]
     */
//    public static byte[] getBytes(String str){
//        if (str != null){
//            try {
//                return str.getBytes(encoding);
//            } catch (UnsupportedEncodingException e) {
//                return null;
//            }
//        }else{
//            return null;
//        }
//    }

    /**
     * 字节数组转换为字符串
     * @param bytes 字节数组
     * @return String
     */
//    public static String toString(byte[] bytes){
//        try {
//            return new String(bytes, encoding);
//        } catch (UnsupportedEncodingException e) {
//            return EMPTY;
//        }
//    }

    /**
     * 是否包含字符串
     * @param str 验证字符串
     * @param strs 字符串组
     * @return 包含返回true
     */
    public static boolean inString(String str, String... strs){
        if (str != null){
            for (String s : strs){
                if (str.equals(trim(s))){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 替换掉HTML标签方法
     */
    public static String replaceHtml(String html) {
        if (StringUtils.isBlank(html)){
            return "";
        }
        String regEx = "<.+?>";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(html);
        return m.replaceAll("");
    }

    /**
     * 替换为手机识别的HTML，去掉样式及属性，保留回车。
     * @param html
     * @return
     */
    public static String replaceMobileHtml(String html){
        if (html == null){
            return "";
        }
        return html.replaceAll("<([a-z]+?)\\s+?.*?>", "<$1>");
    }

    /**
     * 替换为手机识别的HTML，去掉样式及属性，保留回车。
     * @param txt
     * @return
     */
//    public static String toHtml(String txt){
//        if (txt == null){
//            return "";
//        }
//        return replace(replace(Encodes.escapeHtml(txt), "\n", "<br/>"), "\t", "&nbsp; &nbsp; ");
//    }

    /**
     * 如果不为空，则设置值
     * @param target 目标字符串
     * @param source 替换为字符串
     */
    public static void setValueIfNotBlank(String target, String source) {
        if (isNotBlank(source)){
            target = source;
        }
    }

    /**
     * 获得用户远程地址
     */
    public static String getRemoteAddr(HttpServletRequest request){
        String remoteAddr = request.getHeader("X-Real-IP");
        if (isNotBlank(remoteAddr)) {
            remoteAddr = request.getHeader("X-Forwarded-For");
        }else if (isNotBlank(remoteAddr)) {
            remoteAddr = request.getHeader("Proxy-Client-IP");
        }else if (isNotBlank(remoteAddr)) {
            remoteAddr = request.getHeader("WL-Proxy-Client-IP");
        }
        return remoteAddr != null ? remoteAddr : request.getRemoteAddr();
    }

    /**
     * 缩略字符串（不区分中英文字符）
     * @param str 目标字符串
     * @param length 截取长度
     * @return
     */
    public static String abbr(String str, int length) {
        if (str == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            int currentLength = 0;
            for (char c : replaceHtml(StringEscapeUtils.unescapeHtml4(str)).toCharArray()) {
                currentLength += String.valueOf(c).getBytes("GBK").length;
                if (currentLength <= length - 3) {
                    sb.append(c);
                } else {
                    sb.append("...");
                    break;
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

//    public static String abbr2(String param, int length) {
//        if (param == null) {
//            return "";
//        }
//        StringBuffer result = new StringBuffer();
//        int n = 0;
//        char temp;
//        boolean isCode = false; // 是不是HTML代码
//        boolean isHTML = false; // 是不是HTML特殊字符,如&nbsp;
//        for (int i = 0; i < param.length(); i++) {
//            temp = param.charAt(i);
//            if (temp == '<') {
//                isCode = true;
//            } else if (temp == '&') {
//                isHTML = true;
//            } else if (temp == '>' && isCode) {
//                n = n - 1;
//                isCode = false;
//            } else if (temp == ';' && isHTML) {
//                isHTML = false;
//            }
//            try {
//                if (!isCode && !isHTML) {
//                    n += String.valueOf(temp).getBytes("GBK").length;
//                }
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//
//            if (n <= length - 3) {
//                result.append(temp);
//            } else {
//                result.append("...");
//                break;
//            }
//        }
//        // 取出截取字符串中的HTML标记
//        String temp_result = result.toString().replaceAll("(>)[^<>]*(<?)",
//                "$1$2");
//        // 去掉不需要结素标记的HTML标记
//        temp_result = temp_result
//                .replaceAll(
//                        "</?(AREA|BASE|BASEFONT|BODY|BR|COL|COLGROUP|DD|DT|FRAME|HEAD|HR|HTML|IMG|INPUT|ISINDEX|LI|LINK|META|OPTION|P|PARAM|TBODY|TD|TFOOT|TH|THEAD|TR|area|base|basefont|body|br|col|colgroup|dd|dt|frame|head|hr|html|img|input|isindex|li|link|meta|option|p|param|tbody|td|tfoot|th|thead|tr)[^<>]*/?>",
//                        "");
//        // 去掉成对的HTML标记
//        temp_result = temp_result.replaceAll("<([a-zA-Z]+)[^<>]*>(.*?)</\\1>",
//                "$2");
//        // 用正则表达式取出标记
//        Pattern p = Pattern.compile("<([a-zA-Z]+)[^<>]*>");
//        Matcher m = p.matcher(temp_result);
//        List<String> endHTML = Lists.newArrayList();
//        while (m.find()) {
//            endHTML.add(m.group(1));
//        }
//        // 补全不成对的HTML标记
//        for (int i = endHTML.size() - 1; i >= 0; i--) {
//            result.append("</");
//            result.append(endHTML.get(i));
//            result.append(">");
//        }
//        return result.toString();
//    }

    /**
     * 转换为Double类型
     */
    public static Double toDouble(Object val){
        if (val == null){
            return 0D;
        }
        try {
            return Double.valueOf(trim(val.toString()));
        } catch (Exception e) {
            return 0D;
        }
    }

    /**
     * 转换为Float类型
     */
    public static Float toFloat(Object val){
        return toDouble(val).floatValue();
    }

    /**
     * 转换为Long类型
     */
    public static Long toLong(Object val){
        return toDouble(val).longValue();
    }

    /**
     * 转换为Integer类型
     */
    public static Integer toInteger(Object val){
        return toLong(val).intValue();
    }

    /**
     * 转换为JS获取对象值，生成三目运算返回结果
     * @param objectString 对象串
     *   例如：row.user.id
     *   返回：!row?'':!row.user?'':!row.user.id?'':row.user.id
     */
    public static String jsGetVal(String objectString){
        StringBuilder result = new StringBuilder();
        StringBuilder val = new StringBuilder();
        String[] vals = split(objectString, ".");
        for (String val1 : vals) {
            val.append(".").append(val1);
            result.append("!").append(val.substring(1)).append("?'':");
        }
        result.append(val.substring(1));
        return result.toString();
    }
}
