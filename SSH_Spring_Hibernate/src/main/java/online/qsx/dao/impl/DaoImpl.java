package online.qsx.dao.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import online.qsx.common.BaseDao;
import online.qsx.dao.Dao;
import online.qsx.page.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * 通用的数据访问类
 */

public class DaoImpl<T> implements Dao<T>{
    @Autowired
    private BaseDao baseDao;

    @Override
    public PageInfo<T> queryPageInfo(T t, Class className, int pageNum) {
        //getSimpleName表示除掉包只含有类名
        PageHelper.startPage(pageNum,PageUtil.PAGE_SIZE);
//        List<?> list=baseDao.getHibernateTemplate().find("from "+ className.getSimpleName());
       List<T> list1=baseDao.getHibernateTemplate().loadAll(className);
        PageInfo<T> pageInfo=new PageInfo<T>(list1);
//        List<T> list=baseDao.getHibernateTemplate().find("from "+className.getSimpleName());
        //System.out.println(baseDao.getHibernateTemplate().find("from" +className.getSimpleName()+"limit("+(pageNum-1)* PageUtil.PAGE_SIZE+"),"+PageUtil.PAGE_SIZE));
        return pageInfo;
    }

    @Override
    public List<T> query(T t, Class className) {
        return (List<T> )baseDao.getHibernateTemplate().find("from "+className.getSimpleName());
    }

    @Override
    public T queryObjectById(Serializable id, Class className) {
        return (T) baseDao.getHibernateTemplate().get(className,id);
    }

    @Override
    public void update(T t) {
        baseDao.getHibernateTemplate().update(t);
    }

    @Override
    public void save(T t) {
        baseDao.getHibernateTemplate().save(t);
    }

    @Override
    public void remove(T t) {
        baseDao.getHibernateTemplate().delete(t);
    }
}
