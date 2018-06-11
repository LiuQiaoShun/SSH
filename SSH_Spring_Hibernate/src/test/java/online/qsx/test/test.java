package online.qsx.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import online.qsx.dao.Dao;
import online.qsx.dao.StudentDao;
import online.qsx.dao.impl.StudentDaoImpl;
import online.qsx.model.Page;
import online.qsx.model.Student;
import online.qsx.service.StudentServer;
import online.qsx.service.impl.ServerImpl;
import online.qsx.service.impl.StudentServerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试工具类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class test {
    @Autowired
    private StudentServer studentDaoImpl;

        @Test
        public void testQuery(){
            System.out.println(studentDaoImpl);
            studentDaoImpl.query(null, Student.class);
        }

        @Test
        public void testQueryPageInfo(){
//            PageHelper.startPage()
            studentDaoImpl.queryPageInfo(null,Student.class,1);
        }

}
