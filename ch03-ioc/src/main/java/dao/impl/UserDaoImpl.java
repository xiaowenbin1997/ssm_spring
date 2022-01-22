package dao.impl;

import dao.UserDao;
import domain.SysUser;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
        System.out.println("mysql实现");
    }

    @Override
    public void insertUser(SysUser sysUser) {
        System.out.println("将用户插入mysql数据库");
    }
}
