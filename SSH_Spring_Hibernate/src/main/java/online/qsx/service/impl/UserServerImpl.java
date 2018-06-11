package online.qsx.service.impl;

import online.qsx.dao.Dao;
import online.qsx.dao.UserDao;
import online.qsx.dao.impl.UserDaoImpl;
import online.qsx.model.User;
import online.qsx.service.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务逻辑类
 */
@Service("userServerImpl")
public class UserServerImpl extends ServerImpl<User> implements UserServer{
    @Override
    @Autowired
    @Qualifier("userDaoImpl")
    public void setDao(Dao dao) {
        super.dao=dao;
    }




//    @Autowired
//    private UserDaoImpl userDaoIml;
//
//    public List<User> find(int pageNow, int pageSize) {
//        return userDaoIml.find(pageNow, pageSize);
//    }
//
//    public int useCount() {
//        return userDaoIml.useCount();
//    }
}
