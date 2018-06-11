package online.qsx.action;

import online.qsx.model.Page;
import online.qsx.model.User;
import online.qsx.service.Server;
import online.qsx.service.impl.UserServerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by 8888 on 2018/1/3.
 */
@Controller("userAction")
public class UserAction extends BaseAction<User> {
//    @Autowired
//    private UserServerImpl userServer;
//
//    Page page=new Page();

//    // 分页总数量
//    private int Count;
//
//    //当前页
//    private int pageNow;
//
//    // 总页数
//    private int totalpage;
//
//    // 动态分页
//    private String action;

    @Autowired
    @Qualifier("userServerImpl")
    @Override
    public void SetServer(Server<User> server) {
        super.server=server;
    }

//    //分页查询
//    public String getPage(){
//        //获取总数
//        Count=userServer.useCount();
//        // 获取当前页码
//        pageNow= page.getPageNow();
//        page.setTotalpage(Count);
//        // 获取总页数
//        totalpage=(int) page.getTotalpage();
//        // 调用service层的分页查询方法
//        userServer.find(pageNow,page.getPageSize());
//        action="userAction";
//        return "page";
//    }


    @Override
    public String pageInfo() {
        super.pageInfo=super.server.queryPageInfo(object,User.class,pageNum);
        return "pageInfo";
    }

    @Override
    public String list() {
        super.objects=super.server.query(super.object,User.class);
        return "list";
    }

    @Override
    public String to_edit() {
        super.object=super.server.queryObjectById(object.getId(),User.class);
        return "to_edit";
    }
}
