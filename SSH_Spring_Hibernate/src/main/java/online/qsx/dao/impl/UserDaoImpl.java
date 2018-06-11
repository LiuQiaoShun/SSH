package online.qsx.dao.impl;

import online.qsx.dao.UserDao;
import online.qsx.model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户数据访问类
 */
@Repository("userDaoImpl")
public class UserDaoImpl extends DaoImpl<User> implements UserDao{
//    @Autowired
//    private SessionFactory sessionFactory;
//
//    Session session=sessionFactory.getCurrentSession();
//
//    //分页查询
//    public List<User>find(int pageNow,int pageSize){
//        Query query=session.createQuery("from User");
//        // 设定从哪一行开始，因为数据库的下标是从0开始的
//        List<User>users=query.list();
//        query.setMaxResults(pageSize); //每页显示的数据
//        query.setFirstResult((pageNow-1)*pageSize); //越过每行显示的数据
//        return users;
//    }
//
//    //用户总数量
//    public int useCount(){
//        int Count =Integer.parseInt(session.createQuery("select count (*) from User").list().get(0).toString());
//        return Count;
//    }
}
