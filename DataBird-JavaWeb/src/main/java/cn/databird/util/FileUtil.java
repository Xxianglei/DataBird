package cn.databird.util;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 言溪 on 2016/10/20.
 */
public class FileUtil {
    public FileUtil() {
    }

    public static byte[] read(String path) throws IOException {
        short base_size = 1024;
        File file = new File(path);
        if (!file.exists()) {
            return null;
        } else {
            FileInputStream fis = new FileInputStream(file);
            boolean len = false;
            byte[] dataByte = new byte[base_size];
            ByteArrayOutputStream out = new ByteArrayOutputStream(base_size);

            int len1;
            while ((len1 = fis.read(dataByte)) != -1) {
                out.write(dataByte, 0, len1);
            }

            byte[] content = out.toByteArray();
            fis.close();
            out.close();
            return content.length == 0 ? null : content;
        }
    }

    public static void write(String path, byte[] data) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }

        FileOutputStream fos = new FileOutputStream(file);
        fos.write(data);
        fos.flush();
        fos.close();
    }

    public static List<String> findFiles(String baseDirName) {
        ArrayList files = new ArrayList();
        File baseDir = new File(baseDirName);
        if (baseDir.exists() && baseDir.isDirectory()) {
            String[] filelist = baseDir.list();
            String[] var7 = filelist;
            int var6 = filelist.length;

            for (int var5 = 0; var5 < var6; ++var5) {
                String fileName = var7[var5];
                files.add(fileName);
            }
        } else {
            System.err.println("search error：" + baseDirName + "is not a dir！");
        }

        return files;
    }

    public static List<String> findFileNames(String baseDirName, FileFilter fileFilter) {
        ArrayList files = new ArrayList();
        File baseDir = new File(baseDirName);
        if (baseDir.exists() && baseDir.isDirectory()) {
            File[] filelist = baseDir.listFiles(fileFilter);
            File[] var8 = filelist;
            int var7 = filelist.length;

            for (int var6 = 0; var6 < var7; ++var6) {
                File file = var8[var6];
                if (file.isFile()) {
                    files.add(file.getName());
                }
            }
        } else {
            System.err.println("search error：" + baseDirName + "is not a dir！");
        }

        return files;
    }

    /**
     * 读取文件内容
     *
     * @param filePath
     * @param encoding
     * @return
     */
    public static String readFile(String filePath, String encoding) {

        String encode = "UTF-8";
        if (StringUtils.isNotBlank(encoding)) {
            encode = encoding;
        }
        try {
            String content = null;
            File file = new File(filePath);
            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encode);
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    content += lineTxt;
                    System.out.println(lineTxt);
                }
                read.close();
                return content;
            } else {
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return "";
    }

}
