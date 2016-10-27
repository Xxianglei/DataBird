package cn.databird.util;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by 言溪 on 2016/10/26.
 */
/**
 * MD5加密组件
 */

public class Md5Util {
        /**
         * MD5加密
         *
         * @param data
         *            待加密数据
         * @return byte[] 消息摘要
         *
         * @throws Exception
         */
        public static  byte[] encodeMD5(String data) throws Exception {

            // 执行消息摘要
            return DigestUtils.md5(data);
        }

        /**
         * MD5加密
         *
         * @param data
         *            待加密数据
         * @return byte[] 消息摘要
         *
         * @throws Exception
         */
        public static  String encodeMD5Hex(String data) throws Exception {

            // 执行消息摘要
            return DigestUtils.md5Hex(data);
        }


}
