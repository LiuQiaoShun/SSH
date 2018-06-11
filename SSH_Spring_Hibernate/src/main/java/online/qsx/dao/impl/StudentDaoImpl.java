package online.qsx.dao.impl;

import online.qsx.dao.StudentDao;
import online.qsx.dao.UserDao;
import online.qsx.model.Student;
import online.qsx.model.User;
import org.springframework.stereotype.Repository;

/**
 * 学生数据访问类
 */
@Repository("studentDaoImpl")
public class StudentDaoImpl extends DaoImpl<Student> implements StudentDao{

}
