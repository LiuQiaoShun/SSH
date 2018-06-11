package online.qsx.service.impl;


import com.github.pagehelper.PageInfo;
import online.qsx.dao.Dao;
import online.qsx.service.Server;

import java.io.Serializable;
import java.util.List;

/**
 * 通用的业务逻辑抽象类
 */
public abstract class ServerImpl<T>implements Server<T> {

    protected Dao dao;

    /**
     * 子类控制注入哪一个
     * @param dao
     */
    public abstract void setDao(Dao dao);

    @Override
    public PageInfo<T> queryPageInfo(T t, Class className, int pageNum) {
        return dao.queryPageInfo(t,className,pageNum);
    }

    @Override
    public List<T> query(T t, Class className) {
        return dao.query(t,className);
    }

    @Override
    public T queryObjectById(Serializable id, Class className) {
        return (T)dao.queryObjectById(id,className);
    }

    @Override
    public void update(T t) {
        dao.update(t);
    }

    @Override
    public void save(T t) {
        dao.save(t);
    }

    @Override
    public void remove(T t) {
        dao.remove(t);
    }
}
