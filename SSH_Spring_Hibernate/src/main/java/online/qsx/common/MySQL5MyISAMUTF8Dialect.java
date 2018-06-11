package online.qsx.common;

import org.hibernate.dialect.MySQL5Dialect;

/**
 * 设置MySQL数据库引擎与编码节
 */
public class MySQL5MyISAMUTF8Dialect extends MySQL5Dialect {
    @Override
    public String getTableTypeString() {
        return "ENGINE=MyISAM CHARSET=utf8";
    }

}
