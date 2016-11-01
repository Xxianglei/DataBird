package cn.databird.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.Reader;
import java.util.List;
import java.util.Map;

/**
 * Created by 言溪 on 2016/10/26.
 */
public class JsonToolUtil {
    private static Gson gson = new Gson();

    /**
     * 得到格式化json数据 退格用\t 换行用\r
     */
    public static String format(String jsonStr) {
        int level = 0;
        StringBuffer jsonForMatStr = new StringBuffer();
        for (int i = 0; i < jsonStr.length(); i++) {
            char c = jsonStr.charAt(i);
            if (level > 0 && '\n' == jsonForMatStr.charAt(jsonForMatStr.length() - 1)) {
                jsonForMatStr.append(getLevelStr(level));
            }
            switch (c) {
                case '{':
                case '[':
                    jsonForMatStr.append(c + "\n");
                    level++;
                    break;
                case ',':
                    jsonForMatStr.append(c + "\n");
                    break;
                case '}':
                case ']':
                    jsonForMatStr.append("\n");
                    level--;
                    jsonForMatStr.append(getLevelStr(level));
                    jsonForMatStr.append(c);
                    break;
                default:
                    jsonForMatStr.append(c);
                    break;
            }
        }

        return jsonForMatStr.toString();

    }

    /**
     * 获取json中指定的层级
     * @param level 层级编号
     * @return String
     */
    private static String getLevelStr(int level) {
        StringBuffer levelStr = new StringBuffer();
        for (int levelI = 0; levelI < level; levelI++) {
            levelStr.append("\t");
        }
        return levelStr.toString();
    }

    /**
     * 根据指定的String格式的Json获取到相应的Map
     * @param json json数据
     * @return Map
     */
    public static Map getFromJsonObjectToMap(String json){
        JsonObject jsonObject = getAsJsonObject(json);
        return gson.fromJson(jsonObject, Map.class);
    }

    /**
     * 根据指定的文件流中包含的json获取到相应的Map
     * @param reader json数据文件流
     * @return Map
     */
    public static Map getFromJsonObjectToMap(Reader reader){
        JsonReader jsonReader = new JsonReader(reader);
        JsonObject jsonObject = getAsJsonObject(jsonReader);
        return gson.fromJson(jsonObject, Map.class);
    }

    /**
     * 根据指定的String格式的Json获取到相应的List
     * @param json json数据
     * @return List
     */
    public static List getFromJsonObjectToList(String json){
        JsonArray jsonArray = getAsJsonArray(json);
        return gson.fromJson(jsonArray, List.class);
    }

    /**
     * 根据指定的文件流中包含的json获取到相应的List
     * @param reader json数据文件流
     * @return List
     */
    public static List getFromJsonObjectToList(Reader reader){
        JsonReader jsonReader = new JsonReader(reader);
        JsonArray jsonArray = getAsJsonArray(jsonReader);
        return gson.fromJson(jsonArray, List.class);
    }

    /**
     * 对象转换为JSON字符串
     * @param object 需要转换的Json
     * @return String
     */
    public static String toJsonString(Object object){
        return gson.toJson(object);
    }

    /**
     * 通过json字符串转换为JsonObject
     * @param json String格式的json
     * @return JsonObject
     */
    private static JsonObject getAsJsonObject(String json){
        return new JsonParser().parse(json).getAsJsonObject();
    }

    /**
     * 通过JsonReader将指定json文件转化为JsonObject
     * @param jsonReader Json文件流
     * @return JsonObject
     */
    private static JsonObject getAsJsonObject(JsonReader jsonReader){
        return new JsonParser().parse(jsonReader).getAsJsonObject();
    }

    /**
     * 通过json字符串转换为JsonArray
     * @param json Stirng格式json
     * @return JsonArray
     */
    private static JsonArray getAsJsonArray(String json){
        return new JsonParser().parse(json).getAsJsonArray();
    }

    /**
     * 通过JsonReader将指定json文件转为JsonArray
     * @param jsonReader Json文件流
     * @return JsonArray
     */
    private static JsonArray getAsJsonArray(JsonReader jsonReader){
        return new JsonParser().parse(jsonReader).getAsJsonArray();
    }
}
