package online.qsx.action;

import online.qsx.model.Student;
import online.qsx.service.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 学生控制器
 */
@Controller("studentAction")
public class StudentAction extends BaseAction<Student> {
    @Autowired
    @Qualifier("studentServerImpl")
    @Override
    public void SetServer(Server<Student> server) {
        super.server=server;
    }

    @Override
    public String pageInfo() {
        super.pageInfo=super.server.queryPageInfo(object,Student.class,pageNum);
        return "pageInfo";
    }

    @Override
    public String list() {
        super.objects=super.server.query(super.object,Student.class);
        return "list";
    }

    @Override
    public String to_edit() {
        super.object=super.server.queryObjectById(object.getStudentno(),Student.class);
        return "to_edit";
    }
}
