package cn.databird.base;

import java.util.List;

/**
 * Created by 言溪 on 2016/10/27.
 */
public interface BaseDao {
     void  save(Object object);
     <T> List<T> findAll(String sql);
     void update(Object object);
     <T> boolean deleteById(Class<T> tClass,String id);
     <T> T get(Class<T> tClass,int id);
}
