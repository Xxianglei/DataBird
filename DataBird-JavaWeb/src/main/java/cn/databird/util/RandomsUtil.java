package cn.databird.util;

import org.apache.log4j.Logger;

import java.util.Random;
import java.util.UUID;

/**
 * Created by 言溪 on 2016/10/21.
 */
public class RandomsUtil {

    @SuppressWarnings("unused")
    private static Logger log = Logger.getLogger(RandomsUtil.class);

    private static final Random random = new Random();

    // 定义验证码字符.去除了O、I、l、、等容易混淆的字母
    public static final char authCode[] = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y',
            'a', 'c', 'd', 'e', 'f', 'g', 'h', 'j','k', 'm', 'n', 'p','q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y',
            '3', '4', '5', '7', '8'};

    public static final int length = authCode.length;

    /**
     * 生成验证码
     *
     * @return
     */
    public static char getAuthCodeChar() {
        return authCode[number(0, length)];
    }

    /**
     * 生成验证码
     *
     * @return
     */
    public static String getAuthCode(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(authCode[number(0, authCode.length)]);
        }
        return sb.toString();
    }

    /**
     * 获取UUID by jdk
     *
     * @return
     */
    public static String getUuid(boolean is32bit) {
        String uuid = UUID.randomUUID().toString();
        if (is32bit) {
            return uuid.toString().replace("-", "");
        }
        return uuid;
    }

    /**
     * 产生两个数之间的随机数
     *
     * @param min 小数
     * @param max 比min大的数
     * @return int 随机数字
     */
    public static int number(int min, int max) {
        return min + random.nextInt(max - min);
    }

    /**
     * 产生0--number的随机数,不包括num
     *
     * @param number 数字
     * @return int 随机数字
     */
    public static int number(int number) {
        return random.nextInt(number);
    }

    /**
     * 生成RGB随机数
     *
     * @return
     */
    public static int[] getRandomRgb() {
        int[] rgb = new int[3];
        for (int i = 0; i < 3; i++) {
            rgb[i] = random.nextInt(255);
        }
        return rgb;
    }

    /**
     * 生成短信验证码(6位)
     */
    public static String genSMSCode6() {
        String codeStr;
        int codeInt = random.nextInt(1000000);
        codeStr = String.valueOf(codeInt);
        int length = codeStr.length();
        for (; length < 6; length++) {
            codeInt = codeInt * 10;
        }
        codeStr = String.valueOf(codeInt);
        return codeStr;
    }

    /**
     * 生成十位数字码(10位)
     */
    public static String genSMSCode10() {
        return (genSMSCode6().substring(0, 5) + genSMSCode6().substring(0, 5)).replace('4', '6').replace('7', '8');
    }

    /**
     * 生成短信验证码(4位)
     */
    public static String genSMSCode4() {
        return genSMSCode6().substring(0, 4).replace('4', '6').replace('7', '8');
    }
}

