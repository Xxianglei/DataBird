package cn.databird.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by 言溪 on 2016/10/27.
 */
@Component
public class BaseDaoImpl implements BaseDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public void save(Object object) {
        hibernateTemplate.save(object);
    }

    public <T> List<T> findAll(String sql) {
        List<T> list =null;
        try{
             list=(List<T>) hibernateTemplate.find(sql);
        }catch (Exception e){
            System.out.println("我出现错误了");
            e.printStackTrace();
        }
        return list;
    }

    public void update(Object object) {
        hibernateTemplate.update(object);

    }
    public <T> boolean deleteById(Class<T> tClass,String id){
        if(hibernateTemplate.get(tClass,id)==null){
            return false;
        }
        return delete(hibernateTemplate.get(tClass,id));
    }

    public boolean delete(Object object) {
        hibernateTemplate.delete(object);
        return true;
    }

    public <T> T get(Class<T> tClass, int id) {
        T t= (T)hibernateTemplate.get(tClass,id);
        return t;
    }
}
