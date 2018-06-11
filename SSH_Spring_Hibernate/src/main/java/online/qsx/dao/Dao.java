package online.qsx.dao;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

/**
 * 通用的Dao接口层
 * @param <T> 对象
 */
public interface Dao<T> {

    /**
     * 通用分页查询方法
     * @param t  对象
     * @param className 类名
     * @param pageNum 页数
     * @return
     */
    PageInfo<T> queryPageInfo(T t,Class className,int pageNum);

    /**
     * 通用的查询所有的方法
     * @param t 对象
     * @param className 类的名字
     * @return 集合
     */
    List<T>query(T t,Class className);

    /**
     * 通用的根据id查询一个的方法
     * @param id 对象的编号
     * @param className 类的名字
     * @return 对象
     */
    T queryObjectById(Serializable id,Class className);

    /**
     * 通用的修改对象
     * @param t 对象
     */
    void update(T t);

    /**
     * 通用的增加对象
     * @param t 对象
     */
    void save(T t);

    /**
     * 通用的删除对象
     * @param t 对象
     */
    void remove(T t);
}
