package online.qsx.common;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * hibernate 会话工厂工具类
 */
@Component
public class BaseDao extends HibernateDaoSupport {
    @Autowired
    public final void SF(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }
}
