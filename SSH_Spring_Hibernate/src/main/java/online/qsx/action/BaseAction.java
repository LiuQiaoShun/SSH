package online.qsx.action;


import com.github.pagehelper.PageInfo;
import com.opensymphony.xwork2.ActionSupport;
import online.qsx.service.Server;
import online.qsx.service.impl.ServerImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 通用的控制器工具
 * @param <T>
 */
public abstract class BaseAction<T> extends ActionSupport{

    //默认页数位
    protected int pageNum=1;
    /**
     * 模块服务
     */
    @Autowired
    protected Server<T> server;

    /**
     *指定注入那个服务
     * @param server
     */
    public abstract void SetServer(Server<T> server);

    /**
     * 分页对象集合
     */
    protected PageInfo<T> pageInfo;

    /**
     * 模块对象集合
     */
    protected List<T>objects;

    /**
     * 模块对象
     */
    protected T object;

    /**
     * 分页查询
     * @return
     */
    public abstract String pageInfo();

    /**
     * 查看所有
     * @return
     */
    public abstract String list();

    /**
     * 根据编号查看一个
     * @return
     */
    public abstract String to_edit();

    /**
     * 执行添加
     * @return
     */
    public String do_save(){
        server.save(object);
        return "do_save";
    }
    /**
     * 去执行页面
     * @return
     */
    public String to_save(){

        return "to_save";
    }
    /**
     * 执行修改
     * @return
     */
    public String do_edit(){
        server.update(object);
        return "do_edit";
    }

    /**
     * 去删除
     * @return
     */
    public String to_delete(){

        return "to_delete";
    }
    /**
     * 执行删除
     * @return
     */
    public String do_delete(){
        server.remove(object);
        return "do_delete";
    }

    public Server<T> getServer() {
        return server;
    }

    public void setServer(Server<T> server) {
        this.server = server;
    }

    public List<T> getObjects() {
        return objects;
    }

    public void setObjects(List<T> objects) {
        this.objects = objects;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public PageInfo<T> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<T> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
